package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamFilterDistinctUsuarioSum {
    public static void main(String[] args) {
        IntStream n = Stream
                .of("Pato Guzman","Paco Gonzales","George Perez","Pepe Guiterrez","Andres Galan","Andres Galan","Andres Galan")
                .map(no -> new Usuario(no.split(" ")[0],no.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);


       // n.forEach(System.out::println);
        IntSummaryStatistics s = n.summaryStatistics();
        System.out.println(s.getSum());
        System.out.println(s.getMax());
    }
}
