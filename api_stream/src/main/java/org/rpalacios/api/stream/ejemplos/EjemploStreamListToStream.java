package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {

        List<Usuario> l = new ArrayList<>();
        l.add(new Usuario("Rene","Palacios"));
        l.add(new Usuario("Julissa","Diaz"));
        l.add(new Usuario("Gabriel","Angulo"));
        l.add(new Usuario("Luci","Martinez"));
        l.add(new Usuario("Pepe","Hernandez"));
        l.add(new Usuario("Lalo","Mena"));

        Stream<String> nm = l.stream()
                .map(u -> u.getNombres().toUpperCase()  .concat(" ").concat(u.getApellido().toUpperCase()))
                .flatMap(n -> {
                    if (n.contains("gabriel".toUpperCase())){
                        return Stream.of(n);
                    }
                    return Stream.empty();
                })
                .map(String::toLowerCase)
                .peek(System.out::println);
    }
}
