package org.rpalacios.hibernateapp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;
import org.rpalacios.hibernateapp.entity.Cliente;
import org.rpalacios.hibernateapp.util.JpaUtil;

import java.util.List;
import java.util.Objects;

public class HibernateCriteria {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();

        CriteriaBuilder criteria = em.getCriteriaBuilder();
        CriteriaQuery<Cliente> query = criteria.createQuery(Cliente.class);

        Root<Cliente> from = query.from(Cliente.class);

        query.select(from);
        List<Cliente> clientes = em.createQuery(query).getResultList();
        clientes.forEach(System.out::println);

        System.out.println("======================== Listar where equals ========================");
        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        query.select(from).where(criteria.equal(from.get("nombre"),"Rene"));
        clientes = em.createQuery(query).getResultList();
        clientes.forEach(System.out::println);

        System.out.println("======================== Usando where like para buscar cientes por nombres =======================");
        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        ParameterExpression<String> nameParam = criteria.parameter(String.class, "nombre");
        query.select(from).where(criteria.like(from.get("nombre"), nameParam));
        clientes = em.createQuery(query).setParameter("nombre", "R%").getResultList();
        clientes.forEach(System.out::println);

        System.out.println("======================== Usando where between para rangos =======================");
        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        query.select(from).where(criteria.between(from.get("id"),2L,6L));
        clientes = em.createQuery(query).getResultList();
        System.out.println(clientes);

        System.out.println("========================cConsultas where in =======================");
        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        query.select(from).where(from.get("nombre").in("Rene","Pepe","John"));
        clientes = em.createQuery(query).getResultList();
        System.out.println(clientes);



        System.out.println("======================== Consulta con los predicadores de conjuncion y disyuncion ========================");
        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        Predicate porNombre = criteria.equal(from.get("nombre"), "Rene");
        Predicate porFormaPago = criteria.equal(from.get("formaPago"), "Paypal");
        query.select(from).where(criteria.and(porNombre, porFormaPago));
        clientes = em.createQuery(query).getResultList();
        System.out.println(clientes);

        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        Predicate porNombre1 = criteria.equal(from.get("nombre"), "Rene");
        Predicate porFormaPago1 = criteria.equal(from.get("formaPago"), "Paypal");
        query.select(from).where(criteria.or(porNombre1, porFormaPago1));
        clientes = em.createQuery(query).getResultList();
        System.out.println(clientes);

        System.out.println("======================== Consultas con order by asc desc ========================");
        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        query.select(from).orderBy(criteria.asc(from.get("nombre")), criteria.asc(from.get("apellido")));
        clientes = em.createQuery(query).getResultList();
        System.out.println(clientes);

        System.out.println("======================== Consultas con order by desc asc ========================");
        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        query.select(from).orderBy(criteria.desc(from.get("nombre")), criteria.desc(from.get("apellido")));
        clientes = em.createQuery(query).getResultList();
        System.out.println(clientes);

        System.out.println("======================== Consultas por id ========================");
        query = criteria.createQuery(Cliente.class);
        from = query.from(Cliente.class);
        ParameterExpression<Long> idParam = criteria.parameter(Long.class, "id");
        query.select(from).where(criteria.equal(from.get("id"), idParam));
        Cliente cliente = em.createQuery(query).setParameter("id", 3L).getSingleResult();
        System.out.println(cliente);

        System.out.println("======================== Conultar solo el nombre =======================");
        CriteriaQuery<String> queryString = criteria.createQuery(String.class);
        Root<Cliente> fromCliente = queryString.from(Cliente.class);
        queryString.select(fromCliente.get("nombre"));
        List<String> nombres = em.createQuery(queryString).getResultList();
        nombres.forEach(System.out::println);


        System.out.println("======================== Consultar por nombres y apellidos concatenacion ========================");
        queryString = criteria.createQuery(String.class);
        fromCliente = queryString.from(Cliente.class);

        queryString.select((criteria.concat(criteria.concat(from.get("nombre"), " "), from.get("apellido"))));
        nombres = em.createQuery(queryString).getResultList();
        nombres.forEach(System.out::println);

        System.out.println("======================== Consulta de campos personalizados del entity cliente ========================");
        CriteriaQuery<Object[]> queryObject = criteria.createQuery(Object[].class);
        fromCliente = queryObject.from(Cliente.class);
        queryObject.multiselect(fromCliente.get("id"), fromCliente.get("nombre"), fromCliente.get("apellido"));
        List<Object[]> resultados = em.createQuery(queryObject).getResultList();
        for (Object[] fila : resultados) {
            System.out.println("id: " + fila[0] + ", nombre: " + fila[1] + ", apellido: " + fila[2]);
        }

        System.out.println("======================== Contar registro en la consultas con cont ========================");
        CriteriaQuery<Long> queryCount = criteria.createQuery(Long.class);
        fromCliente = queryCount.from(Cliente.class);
        queryCount.select(criteria.count(fromCliente));
        Long totalClientes = em.createQuery(queryCount).getSingleResult();
        System.out.println("Total de clientes: " + totalClientes);

        em.close();
    }
}
