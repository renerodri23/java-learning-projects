package org.rpalacios.java8.lambda.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class PalabrasRepetidas {
    public static void main(String[] args) {

        Function<String , Map<String,Integer>> contador = param ->{
           String[] palabras = param.toLowerCase().split(" ");
            Map<String,Integer> repetidas = new HashMap<>();

            for (String p : palabras){
                repetidas.put(p, repetidas.getOrDefault(p,0)+1);
            }

            String masRepetida = null;
            int max = 0;

            for (Map.Entry<String,Integer> e : repetidas.entrySet()){
                if (e.getValue() > max){
                    masRepetida = e.getKey();
                    max = e.getValue();
                }
            }
            return Collections.singletonMap(masRepetida,max);


        };

        String t = "tres tristes tigres comen en tres tristes platos en unos tristes trigales";
        Map<String,Integer>r = contador.apply(t);

        System.out.println("Palabras mas repetidas: "+r);
    }
}
