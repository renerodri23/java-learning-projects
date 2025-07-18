package og.rpalacios.carrosupermercado.repositorio;

import og.rpalacios.carrosupermercado.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T extends Producto> {
    private List<T> dataSources;

    public BolsaSupermercado() {
        this.dataSources = new ArrayList<>();
    }

    public void addProducto(T producto){
        if(dataSources.size()<5){
            dataSources.add(producto);
        }else {
            System.out.println("La bolsa esta llena");
        }
    }

    public List<T> getDataSources() {
        return dataSources;
    }
    public void showProductos(){
        for (T p:dataSources){
            System.out.println(p.mostrarDetalle());
        }
    }



}
