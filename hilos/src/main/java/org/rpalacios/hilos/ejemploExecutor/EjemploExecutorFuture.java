package org.rpalacios.hilos.ejemploExecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService ex = Executors.newSingleThreadExecutor();

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
        Future<String> f = ex.submit(tarea);
        ex.shutdown();
        System.out.println("Continuando con la ejecucion del metodo main");

        //System.out.println(f.isDone());
        while(!f.isDone()){
            System.out.println("ejecutando tareas ....");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println(f.get());
        System.out.println("Finaliza la tarea: "+f.isDone());
    }
}
