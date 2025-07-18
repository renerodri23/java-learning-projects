package org.rpalacios.poointerdaces.repositorio;
import org.rpalacios.poointerdaces.repositorio.excepciones.AccessDataException;
import org.rpalacios.poointerdaces.repositorio.excepciones.DataWriteAccessException;
import org.rpalacios.poointerdaces.repositorio.excepciones.ReadDataAccessException;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porId(Integer id) throws AccessDataException;
    void crear(T t) throws AccessDataException;
    void editar(T t) throws AccessDataException;
    void eliminar(Integer id)throws AccessDataException;
}
