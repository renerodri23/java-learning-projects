package org.rpalacios.java8.lambda;

import org.rpalacios.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> t = num -> num > 10;
        boolean r = t.test(12);
        System.out.println("Predicate Integer: "+r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println("Predicate String: "+t2.test("ROLE_USER"));

        BiPredicate<String, String> t3 = String::equals;
        System.out.println("BiPredicate String String: "+t3.test("rene","rene"));

        BiPredicate<Integer, Integer> t4 = (i,j)->j>i;
        boolean r2 = t4.test(5,10);
        System.out.println("BiPredicate Integer Integer: "+ r2);

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("Esmeralda");
        a.setNombre("Daniela");
        BiPredicate<Usuario, Usuario> t5 = (ua,ub)-> ua.getNombre().equals(ub.getNombre());
        System.out.println("BiPredicate Usuario Usuario: "+t5.test(a,b));
    }
}
