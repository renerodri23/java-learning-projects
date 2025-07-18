package org.rpalacios.vuelo.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Vuelo implements Comparable<Vuelo> {
    private String nombreVuelo;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private int cantidadPasajeros;

    SimpleDateFormat ff = new SimpleDateFormat("E dd MMM yyyy", new Locale("es","ES"));
    SimpleDateFormat fh = new SimpleDateFormat("HH:mm");

    public Vuelo() {
    }

    public Vuelo(String nombreVuelo, String origen, String destino, Date fechaLlegada, int cantidadPasajeros) {
        this.nombreVuelo = nombreVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo: ").append(nombreVuelo).append(" | ");
        sb.append("Origen: ").append(origen).append(" | ");
        sb.append("Destino: ").append(destino).append(" | ");
        sb.append("Fecha: ").append(ff.format(fechaLlegada)).append(" | ");
        sb.append("Hora: ").append(fh.format(fechaLlegada)).append(" | ");
        sb.append("Pasajeros: ").append(cantidadPasajeros);
        return sb.toString();
    }


    @Override
    public int compareTo(Vuelo o) {
        if(this.fechaLlegada == null){
            return 0;
        }
        return this.fechaLlegada.compareTo(o.fechaLlegada);
    }

}

