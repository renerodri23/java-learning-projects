package org.rpalacios.fabricabotellasagua.runnable;

import org.Fabrica;

public class Consumidor implements Runnable{
    private Fabrica f;

    public Consumidor(Fabrica f) {
        this.f = f;
    }

    @Override
    public void run() {
        for(int i=1; i<=20;i++){
            f.procesar();
        }
    }
}
