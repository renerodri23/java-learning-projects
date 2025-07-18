package org.rpalacios.java8.lambda;

import org.rpalacios.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploCosumidor {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha ->{
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumidorBi = (nombre, edad)-> System.out.println("Nombre "+nombre+" tiene "+edad+" años");
        consumidorBi.accept("Pepe",20);

        Consumer<String> c = System.out::println;

        c.accept("Hola");

        List<String> n = Arrays.asList("Rene","Pepe","Luz","Paco");
        n.forEach(c);
        Usuario u = new Usuario();
        BiConsumer<Usuario, String> asingarNombre = (Usuario::setNombre);
        asingarNombre.accept(u,"Andres");
        System.out.println("Nombre usuario: "+u.getNombre());

        Supplier<String> p = ()-> "SUPPLIER";
        System.out.println(p.get());
    }
}
