package org.rpalacios.catalogo.modelo;

public class IPhone extends Electronico{
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*1.10;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Modelo: ").append(this.modelo).append("\n")
                .append("Color: ").append(this.color).append("\n");
        return sb.toString();


    }
}
