package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> n = Stream.of("Pato Guzman","Paco Gonzales","George Perez","Pepe Guiterrez")
                .map(no -> new Usuario(no.split(" ")[0],no.split(" ")[1]))
                .filter(no -> no.getNombres().startsWith("z"))
                .peek(System.out::println);


        Optional<Usuario> l = n.findFirst();
        //System.out.println(l.orElse(new Usuario("John","Doe")));
        //System.out.println(l.orElseGet(()->new Usuario("John","Doe")));
        //System.out.println(l.orElseThrow());
        if(l.isPresent()){
            System.out.println(l.get().getNombres());
        } else {
            System.out.println("No se encontro el usuario");
        }
        //n.filter(no -> no.startsWith("G")).forEach(System.out::println);

    }
}
