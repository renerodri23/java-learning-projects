package org.rpalacios.optional.ejemplo.repositorio;

import org.rpalacios.optional.ejemplo.models.Computadora;

import java.util.Optional;

public interface Repositorio <T>{
    Optional<Computadora> filtrar(String nombre);
}
