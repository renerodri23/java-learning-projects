package org.rpalacios.api.stream.ejemplos.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String nombres;
    private String apellido;
    private Integer id;
    private static int ultimoid;

    private List<Factura> f;


    public Usuario(String nombres, String apellido) {
        this.nombres = nombres;
        this.apellido = apellido;
        this.id = ++ultimoid;
        this.f =new ArrayList<>();
    }

    public List<Factura> getF() {
        return f;
    }

    public void addtF(Factura fr) {
        this.f.add((Factura) fr);
        fr.setUsuario(this);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombres +" " +apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombres, usuario.nombres) && Objects.equals(apellido, usuario.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombres, apellido);
    }
}
