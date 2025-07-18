package org.rpalacios.ejemplo.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts = " + ts);

        Set<Integer> n = new TreeSet<>((a, b)->{
            return b.compareTo(a);
        });
        n.add(1);
        n.add(5);
        n.add(4);
        n.add(2);
        n.add(3);
        n.add(10);
        System.out.println("n = " + n);


    }
}
