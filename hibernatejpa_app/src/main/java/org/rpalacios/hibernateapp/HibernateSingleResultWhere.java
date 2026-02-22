package org.rpalacios.hibernateapp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.rpalacios.hibernateapp.entity.Cliente;
import org.rpalacios.hibernateapp.util.JpaUtil;

import java.util.List;
import java.util.Scanner;

public class HibernateSingleResultWhere {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        EntityManager em = JpaUtil.getEntityManager();
        Query query = em.createQuery("select c from Cliente c where c.formaPago=?1",Cliente.class);
        System.out.println("Ingrese la forma de pago a buscar:");
        String pago = s.next();
        query.setParameter(1, pago);
        List<Cliente> clientes = query.getResultList();
        System.out.println(clientes);
        em.close();
    }
}
