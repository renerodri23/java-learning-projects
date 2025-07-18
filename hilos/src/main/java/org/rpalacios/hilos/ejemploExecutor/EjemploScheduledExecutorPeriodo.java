package org.rpalacios.hilos.ejemploExecutor;

import java.sql.Time;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploScheduledExecutorPeriodo {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService es = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");

        AtomicInteger c = new AtomicInteger(5);
        //CountDownLatch lock = new CountDownLatch(5);
        Future<?> f = es.scheduleAtFixedRate(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                //lock.countDown();
                c.getAndDecrement();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hola mundo tarea ...");
        },1000,2000, TimeUnit.MILLISECONDS);

        //lock.await();
        //f.cancel(true);
        //TimeUnit.SECONDS.sleep(10);
        while (c.get()>=0){
            if (c.get()==0){
                f.cancel(true);
                c.getAndDecrement();
            }
        }
        System.out.println("Alguna otra tarea en el main ...");
        es.shutdown();
    }
}
