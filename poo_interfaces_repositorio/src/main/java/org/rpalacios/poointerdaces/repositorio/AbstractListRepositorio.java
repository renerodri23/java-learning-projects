package org.rpalacios.poointerdaces.repositorio;
import org.rpalacios.poointerdaces.modelo.GenericsEntity;
import org.rpalacios.poointerdaces.repositorio.excepciones.DataWriteAccessException;
import org.rpalacios.poointerdaces.repositorio.excepciones.DuplicateException;
import org.rpalacios.poointerdaces.repositorio.excepciones.ReadDataAccessException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepositorio<T extends GenericsEntity> implements FinalInterface<T>{

    protected List<T> dataSource;

    public AbstractListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public T porId(Integer id) throws ReadDataAccessException {
        if (id == null || id<=0){
            throw new ReadDataAccessException("Id Invalido debe ser Mayor que 0");
        }
        T t  = null;
        for (T cli : dataSource){
            if (cli.getId() != null && cli.getId().equals(id)){
                t = cli;
                break;
            }
        }
        if (t == null){
            throw new ReadDataAccessException("No existe el registro con id: "+id);
        }
        return t;
    }

    @Override
    public void crear(T t) throws DataWriteAccessException {
        if(t == null){
            throw new DataWriteAccessException("Error al insertar un objeto vacio");
        }if (this.dataSource.contains(t)){
            throw new DuplicateException("Error el objeto con el id "+t.getId() + " existe en el repositorio");
        }
        this.dataSource.add(t);

    }


    @Override
    public void eliminar(Integer id) throws ReadDataAccessException {
        this.dataSource.remove(this.porId(id));

    }


    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


    public int total(){
        return this.dataSource.size();
    }
}
