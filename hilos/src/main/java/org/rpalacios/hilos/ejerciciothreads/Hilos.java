package org.rpalacios.hilos.ejerciciothreads;

import java.util.concurrent.TimeUnit;

public class Hilos {
    public static void main(String[] args) throws InterruptedException {
            Runnable tareaNumeros = new AlfanumericoTarea(Tipo.NUMERO);
            Runnable tareaLetras = new AlfanumericoTarea(Tipo.LETRA);

            Thread h1 = new Thread(tareaNumeros);
            Thread h2 = new Thread(tareaLetras);

            System.out.println("Inicio de los threads");
            h1.start();
            h2.start();
        }
    }

