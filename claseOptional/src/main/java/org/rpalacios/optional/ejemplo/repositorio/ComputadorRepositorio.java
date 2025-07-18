package org.rpalacios.optional.ejemplo.repositorio;

import org.rpalacios.optional.ejemplo.models.Computadora;
import org.rpalacios.optional.ejemplo.models.Fabricante;
import org.rpalacios.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements  Repositorio<Computadora> {
    List<Computadora> dS;
    public ComputadorRepositorio() {
        dS = new ArrayList<>();
        Procesador proc =  new Procesador("I9-8902H",new Fabricante("Intel"));
        Computadora asus = new Computadora("ASUS ROG","Strix G512");
        asus.setPr(proc);
        dS.add(asus);
        dS.add(new Computadora("MacBook Pro","MVK12"));

    }

    @Override
    public Optional<Computadora> filtrar(String nombre) {
        return dS.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();

        /*for (Computadora c: dS){
            if (c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();*/
    }
}
