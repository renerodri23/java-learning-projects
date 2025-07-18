package org.rpalacios.hilos.ejemploExecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ThreadPoolExecutor ex = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        System.out.println("Tamaño del pool: "+ ex.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+ ex.getQueue().size());
        Callable<String> tarea = () ->{

            System.out.println("Iniciando tarea...");
            try {
                System.out.println("Nombe del thread "+ Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Finaliza la tarea");
            return "Algun resultado importante de la tarea";
        };

        Callable<Integer> tarea2 = () ->{
            System.out.println("Ejecutando tarea 2...");
            TimeUnit.SECONDS.sleep(3);
            return 10;
        };
        Future<String> f = ex.submit(tarea);
        Future<String> f2 = ex.submit(tarea);
        Future<Integer> f3 = ex.submit(tarea2);
        System.out.println("Tamaño del pool: "+ ex.getPoolSize());
        System.out.println("Cantidad de tareas en cola: "+ ex.getQueue().size());


        ex.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");

        //System.out.println(f.isDone());
        while(!(f.isDone()&& f2.isDone() && f3.isDone())){
            System.out.printf("Resultado 1: %s - Resultado 2: %s - Resultado 3: %s%n",f.isDone()? "finalizo":"en proceso",f2.isDone()? "finalizo":"en proceso",f3.isDone()? "finalizo":"en proceso");
            TimeUnit.MILLISECONDS.sleep(1000);
        }
        System.out.println(f.get());
        System.out.println("Finaliza la tarea 1: "+f.isDone());
        System.out.println(f2.get());
        System.out.println("Finaliza la tarea 2 : "+f2.isDone());
        System.out.println(f3.get());
        System.out.println("Finaliza la tarea 3: "+f3.isDone());

    }
}
