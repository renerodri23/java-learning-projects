package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        long n = Stream.of("Pato Guzman","","","Pepe Guiterrez")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + n);
    }
}
