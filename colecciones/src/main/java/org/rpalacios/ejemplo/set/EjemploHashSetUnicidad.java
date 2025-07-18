package org.rpalacios.ejemplo.set;

import org.rpalacios.ejemplo.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> a = new HashSet<>();
        a.add(new Alumno("Pato",5.0));
        a.add(new Alumno("Cata",6.0));
        a.add(new Alumno("Luci",4.0));
        a.add(new Alumno("Jano",7.0));
        a.add(new Alumno("Andres",3.0));
        a.add(new Alumno("Zeus",2.0));
        a.add(new Alumno("Zeus",3.0));



        System.out.println(a);

        System.out.println("Iterando en un forEach");
        for (Alumno al: a){
            System.out.println(al.getNombre());

        }

        System.out.println();
        System.out.println("Iterando usando while y Iterator");
        Iterator<Alumno> it = a.iterator();

        while (it.hasNext()){
            Alumno al = it.next();
            System.out.println(al.getNombre());
        }

        System.out.println();
        System.out.println("Iterando usando Stream forEach");
        a.forEach(System.out::println);

    }
}
