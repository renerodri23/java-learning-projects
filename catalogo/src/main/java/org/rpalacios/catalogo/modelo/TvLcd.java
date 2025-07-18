package org.rpalacios.catalogo.modelo;

public class TvLcd extends Electronico {
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*2.34;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Pulgadas en Cm: ").append(this.pulgada).append("\n");
        return sb.toString();


    }
}
