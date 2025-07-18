package org.rpalacios.api.ejemplos.w;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class NumMayor {
    public static void main(String[] args) {

        int[] a = {11,22,34,56,67,543,567,532,556,753};
        Function<int[],Integer> obtMayor = arr -> Arrays.stream(arr).reduce(0,Integer::max);
        int m = obtMayor.apply(a);
        System.out.println("El Valor Mayor es: "+ m);
    }
}
