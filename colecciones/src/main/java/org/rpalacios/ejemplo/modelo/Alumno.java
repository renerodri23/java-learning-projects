package org.rpalacios.ejemplo.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private Double nota;

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Alumno(String nombre, Double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return  nombre +" nota = " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }

    @Override
    public int compareTo(Alumno o) {
        if (this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(o.nombre);
        /*if(this.nota == o.nota){
            return 0;
        }
        if (this.nota>o.nota){
            return 1;
        }
        else{
            return -1;
        }*/

    }
}
