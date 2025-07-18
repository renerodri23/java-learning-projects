package org.rpalacios.hilos.ejemploExecutor;

import org.rpalacios.hilos.ejemplossync.Panaderia;
import org.rpalacios.hilos.ejemplossync.runnable.Consumidor;
import org.rpalacios.hilos.ejemplossync.runnable.Panadero;

import java.util.concurrent.*;

public class EjemploExecutorProductorConsumidor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor ex = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: "+ ex.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+ ex.getQueue().size());

        Panaderia p = new Panaderia();
        Runnable pr = new Panadero(p);
        Runnable c = new Consumidor(p);

        Future<?> f = ex.submit(pr);
        Future<?> f2 = ex.submit(c);

        System.out.println("Tamaño del pool: "+ ex.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+ ex.getQueue().size());


        ex.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");


    }
}
