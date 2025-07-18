package org.rpalacios.appfacturas;

import org.rpalacios.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactuas {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setDui("555-5");
        cliente.setNombre("Andres");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripción de la factura ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for (int i=0;i<2;i++){
            producto = new Producto();

            System.out.println("Ingrese producto numero "+producto.getCodigo()+ " :");
            producto.setNombre(s.nextLine());

            System.out.println("Ingrese el precio del producto: ");
            producto.setPrecio(s.nextFloat());

            System.out.println("Ingrese a cantidad");
            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);

    }

}
