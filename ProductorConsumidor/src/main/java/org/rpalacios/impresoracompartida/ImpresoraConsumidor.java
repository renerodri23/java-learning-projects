package org.rpalacios.impresoracompartida;

import java.util.concurrent.TimeUnit;

public class ImpresoraConsumidor implements Runnable{
    private Impresora im;

    public ImpresoraConsumidor(Impresora im) {
        this.im=im;
    }

    @Override
    public void run() {
        while(true) {
            String doc;
            try {
                doc = im.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (doc.equals(Impresora.FIN)){
                System.out.println("Señál de fin recibida. Terminando");
                break;
            }
            System.out.println("Imprimiendo documento " + doc);
            try {
                TimeUnit.SECONDS.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
