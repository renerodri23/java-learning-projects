package org.rpalacios.java8.lambda;

import org.rpalacios.java8.lambda.Aritmetica.Aritmetica;
import org.rpalacios.java8.lambda.Aritmetica.Calculadora;

public class EjemploInterfaceFunctional {
    public static void main(String[] args) {

        Aritmetica suma = Double::sum;
        Aritmetica resta = (a,b)-> a-b;

        Calculadora c =  new Calculadora();
        System.out.println(c.computar(10,5,suma));
        System.out.println(c.computar(10,5,resta));
    }
}
