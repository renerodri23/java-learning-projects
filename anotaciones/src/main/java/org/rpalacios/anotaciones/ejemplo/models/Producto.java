package org.rpalacios.anotaciones.ejemplo.models;

import org.rpalacios.anotaciones.ejemplo.JsonAtributo;

import java.time.LocalDate;

public class Producto {

    @JsonAtributo
    private String nombre;

    @JsonAtributo
    private Long precio;

    private LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }
}
