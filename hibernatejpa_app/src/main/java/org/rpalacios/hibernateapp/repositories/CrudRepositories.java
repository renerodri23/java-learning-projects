package org.rpalacios.hibernateapp.repositories;

import java.util.List;

public interface CrudRepositories <T>{
    List<T> listar();
    T porId(Long id);
    void guardar(T t);
    void eliminar(Long id);
}
