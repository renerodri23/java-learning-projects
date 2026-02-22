package org.rplacios.java_jdbc.repositorio;

import java.util.List;

public interface Repositorio<T> {
    List<T> listar();

    T porId(long id);

    void save(T t);

    void eliminar(Long id);

}
