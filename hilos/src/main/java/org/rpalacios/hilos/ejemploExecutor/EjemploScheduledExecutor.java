package org.rpalacios.hilos.ejemploExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduledExecutor {
    public static void main(String[] args) {

        ScheduledExecutorService es = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");
        es.schedule(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola mundo tarea ...");
        },500, TimeUnit.MILLISECONDS);
        System.out.println("Alguna otra tarea en el main ...");
        es.shutdown();
    }
}
