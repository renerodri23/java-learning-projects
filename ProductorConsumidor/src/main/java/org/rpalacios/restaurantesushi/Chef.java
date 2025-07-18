package org.rpalacios.restaurantesushi;

import java.util.concurrent.TimeUnit;

public class Chef implements Runnable{
    private BandejaPedidos bp;

    public Chef(BandejaPedidos bp) {
        this.bp = bp;
    }

    @Override
    public void run() {
        while(true){
            String o;
            try {
                o = bp.takeOrder();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (o.equals(BandejaPedidos.FIN)) {
                System.out.println("Señál de fin recibida. Terminando");
                break;
            }
            System.out.println("El chef esta preparando el pedido de "+o);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
