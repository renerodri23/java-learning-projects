package org.rpalacios.hilos.ejemplos;

import org.rpalacios.hilos.ejemplos.threads.NombreThread;

public class EjemploThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Jhon Doe");
        hilo.start();
        //Thread.sleep(50);
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();
        System.out.println(hilo.getState());
    }
}
