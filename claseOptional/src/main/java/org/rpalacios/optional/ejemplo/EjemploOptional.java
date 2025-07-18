package org.rpalacios.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {
    public static void main(String[] args) {

        String nombre = "Rene";
        Optional<String> opt =Optional.of(nombre);
        System.out.println("opt = " + opt);
        System.out.println(opt.isPresent());
        opt.ifPresent(s -> System.out.println("Hola " + s));

        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> {
            System.out.println("Hola "+valor);
        });

        nombre = null;
        opt = Optional.ofNullable(nombre);
        System.out.println("opt = " + opt);

        opt.ifPresentOrElse(valor -> System.out.println("Hola "+ valor), ()->{
            System.out.println("No esta presente");
        });
    }
}
