package org.rpalacios.fabricabotellasagua.runnable;

import org.Fabrica;

import java.util.concurrent.TimeUnit;

public class Productor implements Runnable{
    private Fabrica f;

    public Productor(Fabrica f) {
        this.f = f;
    }

    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            f.producir("Botella n: "+i);
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
