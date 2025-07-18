package org.rpalacios.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {
       Stream<Integer> n = Stream.of(5,10,15,20)
               .distinct();

        int r = n.reduce(0, Integer::sum);
        System.out.println(r);

    }
}
