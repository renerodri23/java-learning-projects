package org.rpalacios.optional.ejemplo.models;

public class Procesador {
    private String nombre;
    private Fabricante f;

    public Procesador(String nombre, Fabricante f) {
        this.nombre = nombre;
        this.f = f;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fabricante getF() {
        return f;
    }

    public void setF(Fabricante f) {
        this.f = f;
    }
}
