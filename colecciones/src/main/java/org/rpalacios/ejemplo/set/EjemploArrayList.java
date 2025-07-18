package org.rpalacios.ejemplo.set;

import org.rpalacios.ejemplo.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> a = new ArrayList<>();
        System.out.println(a + ", size=" + a.size());
        a.add(new Alumno("Pato",5.0));
        a.add(new Alumno("Cata",6.0));
        a.add(new Alumno("Luci",4.0));
        a.add(new Alumno("Jano",7.0));
        a.add(new Alumno("Andres",3.0));
        a.add(new Alumno("Zeus",2.0));
        a.add(new Alumno("Zeus",3.0));
        
        System.out.println(a + ", size=" + a.size());



    }
}
