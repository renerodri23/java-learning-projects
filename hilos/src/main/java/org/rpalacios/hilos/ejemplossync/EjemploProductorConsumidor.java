package org.rpalacios.hilos.ejemplossync;

import org.rpalacios.hilos.ejemplossync.runnable.Consumidor;
import org.rpalacios.hilos.ejemplossync.runnable.Panadero;

public class EjemploProductorConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
