package org.rpalacios.optional.ejemplo;

import org.rpalacios.optional.ejemplo.models.Computadora;
import org.rpalacios.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.rpalacios.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodoOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computadora> repo = new ComputadorRepositorio();
        System.out.println("orElseThrow");
        Computadora pc = repo.filtrar("rog").orElseThrow();
        System.out.println(pc);

        System.out.println("orElseThrow Lambda");
        Computadora pc2 = repo.filtrar("rog").orElseThrow(IllegalStateException::new);
        System.out.println(pc2);

        String doc = "Documento.pdf";
        String extension = Optional.ofNullable(doc)
                .filter(c -> c.contains("."))
                .map(c -> c.substring(doc.lastIndexOf(".")+1))
                .orElseThrow();
        System.out.println(extension);




    }
}
