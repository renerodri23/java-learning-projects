package org.rpalacios.catalogo.modelo;

abstract public class Producto implements IProducto{
    private int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
    @Override
    public abstract double getPrecioVenta();

    public String toString() {
       StringBuilder sb = new StringBuilder();
           sb.append(getClass().getSimpleName()).append("\n")
                   .append("Precio: ").append(getPrecio()).append("\n")
                   .append("Precio Venta: ").append(getPrecioVenta()).append("\n");
           return sb.toString();
       }
    }


