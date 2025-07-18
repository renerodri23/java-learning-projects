package org.rpalacios.hilos.ejemplotimer;

import javax.xml.crypto.Data;
import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendaTareaTimer {
    public static void main(String[] args) {

        Toolkit tk = Toolkit.getDefaultToolkit();
        AtomicInteger contA = new AtomicInteger(3);
        Timer t = new Timer();

        t.schedule(new TimerTask() {
            @Override
            public void run() {
                int i = contA.getAndDecrement();
                if(i>0) {
                    tk.beep();
                    System.out.println("Tarea "+i+ " periodica en: " + new Date() + " nombe del Thread: " + Thread.currentThread().getName());
                    //cont --;
                }else {
                    System.out.println("Finaliza el tiempo");
                    t.cancel();
                }
            }
        },0,10000);

        System.out.println("Agendamos una tarea para 5 segundos mas...");
    }
}
