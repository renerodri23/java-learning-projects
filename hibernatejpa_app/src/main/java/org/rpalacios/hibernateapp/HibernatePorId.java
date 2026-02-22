package org.rpalacios.hibernateapp;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.rpalacios.hibernateapp.entity.Cliente;
import org.rpalacios.hibernateapp.util.JpaUtil;

import java.util.Scanner;

public class HibernatePorId {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el id:");
        Long id = s.nextLong();

        EntityManager em = JpaUtil.getEntityManager();
        Cliente cliente = em.find(Cliente.class, id);

        System.out.println(cliente);
        em.close();
    }
}
