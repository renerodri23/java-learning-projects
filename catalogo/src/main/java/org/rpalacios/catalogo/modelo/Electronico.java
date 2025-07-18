package org.rpalacios.catalogo.modelo;

abstract public class Electronico extends Producto implements IElectronico{
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Fabricante: ").append(getFabricante()).append("\n");
        return sb.toString();
    }
}
