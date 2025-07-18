package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterDistinctUsuario {
    public static void main(String[] args) {
        Stream<Usuario> n = Stream
                .of("Pato Guzman","Paco Gonzales","George Perez","Pepe Guiterrez","Andres Galan","Andres Galan","Andres Galan")
                .map(no -> new Usuario(no.split(" ")[0],no.split(" ")[1]))
                .distinct();

        n.forEach(System.out::println);
    }
}
