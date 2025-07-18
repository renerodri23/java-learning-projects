package org.rpalacios.hilos.ejemploExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService ex = Executors.newSingleThreadExecutor();

        Runnable tarea = () ->{

            System.out.println("Iniciando tarea...");
            try {
                System.out.println("Nombe del thread "+ Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea");
        };
        ex.submit(tarea);
        ex.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main 1:");
        ex.awaitTermination(2,TimeUnit.SECONDS);
        System.out.println("Continuando con la ejecucion del metodo main 2:");

    }
}
