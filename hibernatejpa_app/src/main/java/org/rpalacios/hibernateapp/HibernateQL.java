package org.rpalacios.hibernateapp;

import jakarta.persistence.EntityManager;
import org.rpalacios.hibernateapp.dominio.ClienteDto;
import org.rpalacios.hibernateapp.entity.Cliente;
import org.rpalacios.hibernateapp.util.JpaUtil;

import java.util.List;

public class HibernateQL {
    public static void main(String[] args) {

        EntityManager em = JpaUtil.getEntityManager();
        System.out.println("=============== Consultar Todos ===============");
        List<Cliente> clientes = em.createQuery("select c from Cliente c", Cliente.class).getResultList();
        clientes.forEach(System.out::println);

        System.out.println("=============== Consultar por id ===============");
        Cliente cliente = em.createQuery("select c from Cliente c where c.id=:id", Cliente.class)
                .setParameter("id", 2L)
                .getSingleResult();
        System.out.println(cliente);

        System.out.println("=============== Consulta solo el nombre por el id =============== ");
        String nombreCliente = em.createQuery("select c.nombre from Cliente c where c.id=:id", String.class)
                .setParameter("id",3L)
                .getSingleResult();
        System.out.println("Nombre cliente: " + nombreCliente);

        System.out.println("=============== Conssultas por campos personalizados ===============");
        Object[] objetoCliente = em.createQuery("select c.id,c.nombre,c.apellido from Cliente c where c.id=:id",Object[].class)
                .setParameter("id",4L)
                .getSingleResult();
        Long id = (Long)objetoCliente[0];
        String nombre = (String)objetoCliente[1];
        String apellido = (String)objetoCliente[2];
        System.out.println("id: " + id + ", nombre: " + nombre + ", apellido: " + apellido);

        System.out.println("=============== Conssultas por campos personalizados Lists ===============");
        List<Object[]> registros =em.createQuery("select c.id,c.nombre,c.apellido from Cliente c",Object[].class)
                .getResultList();
        registros.forEach(reg -> {
            Long idReg = (Long)reg[0];
            String nombreReg = (String)reg[1];
            String apellidoReg = (String)reg[2];
            System.out.println("id: " + idReg + ", nombre: " + nombreReg + ", apellido: " + apellidoReg);
        });

        System.out.println("=============== Consultas por cliente y forma de pago ===============");
        List<Object[]> registro2 = em.createQuery("select c,c.formaPago from Cliente c",Object[].class)
                .getResultList();
        registro2.forEach(reg -> {
            Cliente c = (Cliente) reg[0];
            String formaPago = (String) reg[1];
            System.out.println("Cliente: " + c + ", forma de pago: " + formaPago);
        });

        System.out.println("=============== Consulta que pueble o duevuelve objeto de una clase personaliada ===============");
        clientes = em.createQuery("select new Cliente(c.nombre,c.apellido) from Cliente c",Cliente.class)
                .getResultList();
        clientes.forEach(System.out::println);

        System.out.println("=============== Consulta que pueble o duevuelve objeto DTO de una clase personaliada ===============");
        List<ClienteDto> clientesDto = em.createQuery("select new org.rpalacios.hibernateapp.dominio.ClienteDto(c.nombre,c.apellido) from Cliente c", ClienteDto.class)
                .getResultList();
        clientesDto.forEach(System.out::println);

        System.out.println("=============== Consultas por rango ===============");
//        clientes = em.createQuery("select c from Cliente c where c.id between 1 and 4", Cliente.class)
//                        .getResultList();
        clientes = em.createQuery("select c from Cliente c where c.nombre between 'P' and 'Z'", Cliente.class)
                        .getResultList();
        clientes.forEach(System.out::println);


        System.out.println("=============== Consulta con orden ================");
        clientes = em.createQuery("select c from Cliente c order by c.nombre desc", Cliente.class)
                .getResultList();
        clientes.forEach(System.out::println);

        System.out.println("=============== Consulta con total de registros de la tabla ================");
        Long total = em.createQuery("select count(c) from Cliente c",Long.class).getSingleResult();
        System.out.println(total);

        System.out.println("=============== Consulta con valor minimo del id ================");
        Long minId = em.createQuery("select min(c.id) as minimo from Cliente c", Long.class).getSingleResult();
        System.out.println(minId);

        System.out.println("=============== Consulta con valor maximo del id ================");
        Long maxId = em.createQuery("select max(c.id) as maximo from Cliente c", Long.class).getSingleResult();
        System.out.println(maxId);

        System.out.println("=============== Consulta con el nombre mas corto ================");
        Integer nombreCorto = em.createQuery("select min(length(c.nombre)) from Cliente c",Integer.class).getSingleResult();
        System.out.println(nombreCorto);

        System.out.println("=============== Consultas resumen funciones agregaciones min max avg sum ===================");
        Object[] stats = em.createQuery("select min(c.id),max(c.id),sum(c.id),count(c.id),avg(length(c.nombre)) from Cliente c",Object[].class).getSingleResult();
        System.out.println("Min id: " + stats[0]);
        System.out.println("Max id: " + stats[1]);
        System.out.println("Sum id: " + stats[2]);
        System.out.println("Count id: " + stats[3]);
        System.out.println("Avg longitud nombre: " + stats[4]);


        System.out.println("=============== Consulta con el nombre mas corto y su largo ====================");
        registros = em.createQuery("select c.nombre, length(c.nombre) as largo from Cliente c where length(c.nombre) = (select min(length(c2.nombre)) from Cliente c2)",Object[].class)
                .getResultList();
        registros.forEach(reg ->{
            String nombreReg = (String)reg[0];
            Integer largoReg = (Integer)reg[1];
            System.out.println("Nombre: " + nombreReg + ", Largo: " + largoReg);
        });
        em.close();

    }
}
