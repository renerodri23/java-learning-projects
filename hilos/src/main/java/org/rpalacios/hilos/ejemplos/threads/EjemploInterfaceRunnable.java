package org.rpalacios.hilos.ejemplos.threads;

import org.rpalacios.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Italia")).start();
        new Thread(new ViajeTarea("New York")).start();
        new Thread(new ViajeTarea("Francia")).start();
        new Thread(new ViajeTarea("Groenlandia")).start();
    }
}
