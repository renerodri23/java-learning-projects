package org.rpalacios.optional.ejemplo;

import org.rpalacios.optional.ejemplo.models.Computadora;
import org.rpalacios.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.rpalacios.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodoOrElse {
    public static void main(String[] args) {

        Repositorio<Computadora> repo = new ComputadorRepositorio();
        System.out.println("orElse");
        Computadora pc = repo.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        System.out.println();

        System.out.println("orElseGet");
         pc = repo.filtrar("macbook").orElseGet(EjemploRepositorioMetodoOrElse::valorDefecto);
        System.out.println(pc);


    }
    public static Computadora valorDefecto(){
        return new Computadora("Hp","23jdo");
    }
}
