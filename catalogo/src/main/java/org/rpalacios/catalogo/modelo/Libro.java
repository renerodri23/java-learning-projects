package org.rpalacios.catalogo.modelo;

import java.util.Date;

abstract public class Libro extends Producto implements ILibro{
    private Date fechaPublicacion;
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public abstract double getPrecioVenta();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Autor: ").append(getAutor()).append("\n")
                .append("Titulo: ").append(getTitulo()).append("\n")
                .append("Editorial: ").append(getEditorial()).append("\n");
        return sb.toString();
    }
}
