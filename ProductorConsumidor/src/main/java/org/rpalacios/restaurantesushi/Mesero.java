package org.rpalacios.restaurantesushi;
import static org.rpalacios.restaurantesushi.TipoSushi.*;

public class Mesero {
    public static void main(String[] args) throws InterruptedException {

        BandejaPedidos bp = new BandejaPedidos();

        Runnable o1 = new Cliente(bp,"Rene",MAKIZUSHI);
        Runnable o2 = new Cliente(bp,"Andres",TEMAKI);

        Runnable c = new Chef(bp);

        Thread h1 = new Thread(o1);
        Thread h2 = new Thread(o2);
        Thread hc = new Thread(c);

        h1.start();
        h2.start();
        hc.start();

        h1.join();
        h2.join();

        bp.addOrder(BandejaPedidos.FIN);
        hc.join();


    }
}
