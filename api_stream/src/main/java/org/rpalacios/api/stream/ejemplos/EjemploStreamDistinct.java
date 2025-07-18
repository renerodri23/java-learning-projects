package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {
       Stream<String> n = Stream.of("Pato Guzman","Paco Gonzales","George Perez","Pepe Guiterrez","Andres Galan","Andres Galan","Andres Galan","Andres Galan")
               .distinct();

        n.forEach(System.out::println);

    }
}
