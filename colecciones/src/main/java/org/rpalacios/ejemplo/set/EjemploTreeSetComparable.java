package org.rpalacios.ejemplo.set;

import org.rpalacios.ejemplo.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> a = new TreeSet<>((o,b)->o.getNombre().compareTo(b.getNombre()));
        a.add(new Alumno("Pato",5.0));
        a.add(new Alumno("Cata",6.0));
        a.add(new Alumno("Luci",4.0));
        a.add(new Alumno("Jano",7.0));
        a.add(new Alumno("Andres",3.0));
        a.add(new Alumno("Zeus",2.0));


        System.out.println(a);

    }
}
