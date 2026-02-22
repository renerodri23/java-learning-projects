package org.rpalacios.hibernateapp;

import jakarta.persistence.EntityManager;
import org.rpalacios.hibernateapp.entity.Cliente;
import org.rpalacios.hibernateapp.services.ClienteService;
import org.rpalacios.hibernateapp.services.ClienteServicesImpl;
import org.rpalacios.hibernateapp.util.JpaUtil;

import java.util.List;
import java.util.Optional;

public class HibernateCrudService {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();

        ClienteService service = new ClienteServicesImpl(em);

        System.out.println("===== Listar Clientes =====");
        List<Cliente> clientes = service.listar();
        clientes.forEach(System.out::println);

        System.out.println("===== Obtener Cliente por ID =====");
        Optional<Cliente> optionalCliente = service.porId(1L);
        optionalCliente.ifPresent(System.out::println);

        System.out.println("===== Crear Nuevo Cliente =====");
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombre("Luci");
        nuevoCliente.setApellido("Nona");
        nuevoCliente.setFormaPago("Credito");

        service.guardar(nuevoCliente);
        System.out.println("Cliente guardado: " + nuevoCliente);
        service.listar().forEach(System.out::println);

        System.out.println("===== Editar Cliente =====");
        Long id = nuevoCliente.getId();
        optionalCliente = service.porId(id);
        optionalCliente.ifPresent(c -> {;
            c.setFormaPago("Debito");
            service.guardar(c);
            System.out.println("Cliente actualizado: " + c);
            service.listar().forEach(System.out::println);
        });

        System.out.println("===== Eliminar Cliente =====");
        id = nuevoCliente.getId();
        optionalCliente = service.porId(id);
        optionalCliente.ifPresent(c -> {
                    service.eliminar(c.getId());
        });
        System.out.println("Cliente eliminado con ID: " + id);
        service.listar().forEach(System.out::println);
        em.close();
    }
}
