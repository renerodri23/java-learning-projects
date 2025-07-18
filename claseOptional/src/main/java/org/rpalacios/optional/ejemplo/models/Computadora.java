package org.rpalacios.optional.ejemplo.models;

public class Computadora {
    private String nombre;
    private String modelo;
    private Procesador pr;

    public Computadora(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public Procesador getPr() {
        return pr;
    }

    public void setPr(Procesador pr) {
        this.pr = pr;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return nombre + ", "+ modelo;
    }
}
