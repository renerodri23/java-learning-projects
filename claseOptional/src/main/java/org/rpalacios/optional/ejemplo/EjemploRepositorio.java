package org.rpalacios.optional.ejemplo;

import org.rpalacios.optional.ejemplo.models.Computadora;
import org.rpalacios.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.rpalacios.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computadora> repo = new ComputadorRepositorio();

        repo.filtrar("rog").ifPresentOrElse(System.out::println, ()-> System.out.println("No se encontro"));
        //Optional<Computadora> pc = repo.filtrar("asus rog");
        /*if (pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontro");
        }*/


    }
}
