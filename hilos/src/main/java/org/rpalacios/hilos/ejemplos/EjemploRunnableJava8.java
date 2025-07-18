package org.rpalacios.hilos.ejemplos;

import org.rpalacios.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Thread main = Thread.currentThread();
        Runnable viaje = ()-> {
                for (int i = 0;i<10;i++){
                    System.out.println(i+" nombre = " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a: "+ Thread.currentThread().getName());
                System.out.println(main.getState());
        };


        Thread v1 = new Thread(viaje,"Italia");
        Thread v2 = new Thread(viaje,"New York");
        Thread v3 = new Thread(viaje,"Francia");
        Thread v4 = new Thread(viaje ,"Groenlandia");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();

        //Thread.sleep(10000);

        System.out.println("Continuamos con la ejecucion del método main: "+ main.getName());
    }
}
