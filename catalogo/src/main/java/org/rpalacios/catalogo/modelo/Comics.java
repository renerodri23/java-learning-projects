package org.rpalacios.catalogo.modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comics extends Libro{
    private List<String> personajes;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personajes = new ArrayList<>();
    }

    public Comics addPersonaje(String p){
        personajes.add(p);
        return this;
    }

    @Override
    public double getPrecioVenta() {
        return getPrecio()*1.00;
    }
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Fecha publicación: ").append(sdf.format(getFechaPublicacion()));
        for(String personaje : this.personajes){
            sb.append("Personaje: ").append(personaje).append("\n");
        }
        return sb.toString();


    }

}
