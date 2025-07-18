package org.rpalacios.hilos.ejemplos;

import org.rpalacios.hilos.ejemplos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("Hola ","que tal")).start();
        new Thread(new ImprimirFrases("Quien eres"," Tu")).start();
        Thread.sleep(1000);
        Thread th3 = new Thread(new ImprimirFrases("Muchas"," Gracias amigo!"));
        th3.start();

    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
