package org.rpalacios.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
       Stream<String> n = Stream.of("Pato Guzman","Paco Gonzales","George Perez","Pepe Guiterrez","Andres Galan","Andres Galan","Andres Galan","Andres Galan")
               .distinct();

        String r = n.reduce("resultado concatenacion ",(a,b) -> a+", "+b);
        System.out.println(r);

    }
}
