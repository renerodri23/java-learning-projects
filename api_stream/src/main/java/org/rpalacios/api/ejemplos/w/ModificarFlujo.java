package org.rpalacios.api.ejemplos.w;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ModificarFlujo {
    public static void main(String[] args) {

        DoubleStream flujo = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 10 != 0)
                .mapToDouble(n -> n / 2.0)
                .peek(System.out::println);
        OptionalDouble r = flujo.reduce(Double::sum);
        System.out.println("suma = " + r);
    }
}
