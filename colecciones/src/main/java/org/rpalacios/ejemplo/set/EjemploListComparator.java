package org.rpalacios.ejemplo.set;

import org.rpalacios.ejemplo.modelo.Alumno;

import java.util.*;

public class EjemploListComparator {
    public static void main(String[] args) {

        List<Alumno> a = new ArrayList<>();
        a.add(new Alumno("Pato",5.0));
        a.add(new Alumno("Cata",6.0));
        a.add(new Alumno("Luci",4.0));
        a.add(new Alumno("Jano",7.0));
        a.add(new Alumno("Andres",3.0));
        a.add(new Alumno("Zeus",2.0));
        a.add(new Alumno("Zeus",3.0));

        //System.out.println("Metodo 1");
        //Collections.sort(a,(al,b) -> b.getNombre().compareTo(al.getNombre()));

        //System.out.println("Metodo 2");
        //a.sort(Comparator.comparing(Alumno::getNota).reversed());

        System.out.println("Metodo 3");
        a.sort((al,b)->al.getNota().compareTo(b.getNota()));

        System.out.println(a);

        System.out.println();
        System.out.println("Iterando usando Stream forEach");
        a.forEach(System.out::println);

    }
}
