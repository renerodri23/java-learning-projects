package org.rpalacios.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class EjemploStreamRange {
    public static void main(String[] args) {
       IntStream n = IntStream.rangeClosed(5,20).peek(System.out::println);

        //int r = n.sum();
        IntSummaryStatistics stats = n.summaryStatistics();
        System.out.println("Max : " + stats.getMax());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Suma : " + stats.getSum());
        System.out.println("Promedio : " + stats.getAverage());
        System.out.println("Total : " + stats.getCount());





    }
}
