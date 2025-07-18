package org.rpalacios.java8.lambda.example;

import java.util.function.Function;

public class EliminarEspacios {
    public static void main(String[] args) {

        Function<String,String> deletear = (param) -> {
            return param.replace(" ","")
                    .replace(".","")
                    .replace(",","")
                    .toUpperCase();

        };

        String f = "Hola,Buenas Noches.";
        System.out.println(deletear.apply(f));
    }



}
