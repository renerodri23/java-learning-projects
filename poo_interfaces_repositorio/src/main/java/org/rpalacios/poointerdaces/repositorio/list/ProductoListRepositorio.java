package org.rpalacios.poointerdaces.repositorio.list;

import org.rpalacios.poointerdaces.modelo.Cliente;
import org.rpalacios.poointerdaces.modelo.Producto;
import org.rpalacios.poointerdaces.repositorio.AbstractListRepositorio;
import org.rpalacios.poointerdaces.repositorio.Direccion;
import org.rpalacios.poointerdaces.repositorio.excepciones.ReadDataAccessException;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractListRepositorio<Producto> {
    @Override
    public void editar(Producto producto) throws ReadDataAccessException {
        Producto p = porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((p1, p2) -> {
            {
                int resultado = 0;
                if (dir == Direccion.ASC) {
                    resultado=this.ordenar(campo,p1,p2);

                } else if (dir == Direccion.DESC) {
                    resultado=this.ordenar(campo,p2,p1);
                }
                return resultado;
            }

        });
        return listaOrdenada;
    }
    private int ordenar(String campo,Producto p1,Producto p2){
        int resultado=0;
        switch (campo) {
            case "id" -> resultado = p1.getId().compareTo(p2.getId());
            case "descripcion" -> resultado = p1.getDescripcion().compareTo(p2.getDescripcion());
            case "precio" -> resultado = p1.getPrecio().compareTo(p2.getPrecio());
        }
        return resultado;
    }
}
