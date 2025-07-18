package org.rpalacios.poointerdaces.repositorio.list;

import org.rpalacios.poointerdaces.modelo.Cliente;
import org.rpalacios.poointerdaces.repositorio.AbstractListRepositorio;
import org.rpalacios.poointerdaces.repositorio.Direccion;
import org.rpalacios.poointerdaces.repositorio.excepciones.ReadDataAccessException;

import java.util.ArrayList;
import java.util.List;

public  class ClienteListRepositorio extends AbstractListRepositorio<Cliente> {

    @Override
    public void editar(Cliente cliente) throws ReadDataAccessException {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());


    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((o1, o2) -> {
            {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                   resultado=this.ordenar(campo,o1,o2);

                } else if (dir == Direccion.DESC) {
                    resultado=this.ordenar(campo,o2,o1);
                }
                return resultado;
            }

        });
        return listaOrdenada;
    }


    private int ordenar(String campo,Cliente o1,Cliente o2){
        int resultado=0;
        switch (campo) {
            case "id" -> resultado = o1.getId().compareTo(o2.getId());
            case "nombre" -> resultado = o1.getNombre().compareTo(o2.getNombre());
            case "apellido" -> resultado = o1.getApellido().compareTo(o2.getApellido());
        }
        return resultado;
    }

}
