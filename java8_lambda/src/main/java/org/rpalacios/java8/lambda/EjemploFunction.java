package org.rpalacios.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f = param -> "Yo te saludo "+param;
        String r = f.apply("Andres");
        System.out.println(r);

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("rene"));

        BiFunction<String,String,String> f3 = (a,b)->a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("Rene ","Israel");
        System.out.println(r2);

        BiFunction<String,String,Integer> f4 = String::compareTo;
        System.out.println(f4.apply("andres","andres"));

        BiFunction<String,String,String> f5 = String::concat;
        System.out.println(f5.apply("andres","andres"));

    }
}
