package org.rpalacios.optional.ejemplo;

import org.rpalacios.optional.ejemplo.models.Computadora;
import org.rpalacios.optional.ejemplo.models.Fabricante;
import org.rpalacios.optional.ejemplo.models.Procesador;
import org.rpalacios.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.rpalacios.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computadora> repo = new ComputadorRepositorio();

        String pc = repo.filtrar("rog")
                .map(Computadora::getPr)
                .map(Procesador::getF)
                .filter(f->"intal".equalsIgnoreCase(f.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");
        System.out.println(pc);


    }
}
