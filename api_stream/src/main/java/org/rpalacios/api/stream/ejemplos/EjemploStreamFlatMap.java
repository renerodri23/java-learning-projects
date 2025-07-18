package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {
        Stream<Usuario> n = Stream.of("Pato Guzman","Paco Gonzales","George Perez","Pepe Guiterrez","Andres Galan")
                .map(no -> new Usuario(no.split(" ")[0],no.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombres().equalsIgnoreCase("Andres")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        n.forEach(System.out::println);

        //n.filter(no -> no.startsWith("G")).forEach(System.out::println);

    }
}
