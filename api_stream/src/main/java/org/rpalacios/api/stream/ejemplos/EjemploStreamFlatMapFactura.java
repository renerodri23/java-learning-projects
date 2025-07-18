package org.rpalacios.api.stream.ejemplos;

import org.rpalacios.api.stream.ejemplos.models.Factura;
import org.rpalacios.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John","Doe");
        Usuario u2 = new Usuario("Pepe","Perez");

        u1.addtF(new Factura("Compras"));
        u1.addtF(new Factura("Compras Muebles"));

        u2.addtF(new Factura("Bicilceta"));
        u2.addtF(new Factura("Auto"));

        List<Usuario> us= Arrays.asList(u1,u2);
        us.stream()
                .flatMap(u -> u.getF().stream())
                .forEach(f-> System.out.println(f.getDescripcion().concat(" : cliente ")
                        .concat(f.getUsuario().toString())));
    }
}
