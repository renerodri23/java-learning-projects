package org.rpalacios.api.ejemplos.w;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ImporteProducto {
    public static void main(String[] args) {

        List<Producto> l = new ArrayList<>();
        l.add(new Producto("Perfume",12.00,3));
        l.add(new Producto("Desodorante",2.50,2));
        l.add(new Producto("Shampoo",10.75,1));
        l.add(new Producto("Acondicionador",15.00,1));
        l.add(new Producto("Jabon Liquido",7.30,4));

        DoubleStream lp = l.stream()
                .mapToDouble(m -> m.getPrecio()* m.getCantidad());
        double r = lp.reduce(0,Double::sum);
        System.out.println("r = " + r);

    }
}
