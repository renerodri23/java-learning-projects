package org.rpalacios.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        Stream<String> n = Stream.of("Pato","Paco","George","Pepe")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);

        List<String> l = n.toList();
        l.forEach(System.out::println);

        //n.filter(no -> no.startsWith("G")).forEach(System.out::println);

    }
}
