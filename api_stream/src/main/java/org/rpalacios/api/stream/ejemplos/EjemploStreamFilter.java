package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
        Stream<Usuario> n = Stream.of("Pato Guzman","Paco Gonzales","George Perez","Pepe Guiterrez")
                .map(no -> new Usuario(no.split(" ")[0],no.split(" ")[1]))
                .filter(no -> no.getNombres().startsWith("G"))
                .peek(System.out::println);


        List<Usuario> l = n.toList();
        l.forEach(System.out::println);

        //n.filter(no -> no.startsWith("G")).forEach(System.out::println);

    }
}
