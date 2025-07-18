package org.rpalacios.almacen;

public class Perecederos extends Alimenticio{
    private String fechaVencimiento;

    public Perecederos(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }
}
