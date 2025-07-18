package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParalel {
    public static void main(String[] args) {

        List<Usuario> l = new ArrayList<>();
        l.add(new Usuario("Rene", "Palacios"));
        l.add(new Usuario("Julissa", "Diaz"));
        l.add(new Usuario("Gabriel", "Angulo"));
        l.add(new Usuario("Luci", "Martinez"));
        l.add(new Usuario("Pepe", "Hernandez"));
        l.add(new Usuario("Lalo", "Mena"));

        long t1 = System.currentTimeMillis();
        String nm = l.stream()
                //.parallel()
                .map(u -> u.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre thread : "+Thread.currentThread().getName()
                    +" - "+ n);
                })
                .flatMap(n -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (n.contains("gabriel".toUpperCase())) {
                        return Stream.of(n);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");
        long t2 = System.currentTimeMillis();
        System.out.println("Tiempo total: "+(t2-t1));
        System.out.println(nm);
    }
}
