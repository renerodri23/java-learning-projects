package org.rpalacios.api.ejemplos.w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class AplanarArreglo {
    public static void main(String[] args) {
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};
        Function<String[][],String[]> aplanado = arr -> Arrays.stream(arr)
                .flatMap(Arrays::stream)
                .distinct()
                .toArray(String[]::new);

        String[] r = aplanado.apply(lenguajes);
        System.out.println(Arrays.toString(r));

    }
}
