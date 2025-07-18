package org.rpalacios.api.stream.ejemplos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        System.out.println("Metodo 1");
        Stream<String> n = Stream.of("Pato","Paco","George","Pepe");

        n.filter(no -> no.startsWith("G")).forEach(System.out::println);

        System.out.println("Metodo 2");
        String[] arr = {"Pato","Paco","George","Gongoli"};
        Stream<String> nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        System.out.println("Metodo 3");
        Stream<String> nom = Stream.<String>builder().add("Pato")
                .add("paco")
                .add("pepa")
                .add("pepe")
                .build();

        nom.forEach(System.out::println);

        System.out.println("Metodo 4");
        List<String> l = new ArrayList<>();
        l.add("Pato");
        l.add("paco");
        l.add("pepa");
        l.add("pepe");

        Stream<String> nomb = l.stream();
        nomb.forEach(System.out::println);
    }
}
