package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilteraNYmATCH {
    public static void main(String[] args) {
        boolean n = Stream.of("Pato Guzman","Paco Gonzales","George Perez","Pepe Guiterrez")
                .map(no -> new Usuario(no.split(" ")[0],no.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(no -> no.getId().equals(2));



        System.out.println(n);

        //n.filter(no -> no.startsWith("G")).forEach(System.out::println);

    }
}
