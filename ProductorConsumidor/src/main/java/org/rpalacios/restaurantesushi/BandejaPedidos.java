package org.rpalacios.restaurantesushi;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class BandejaPedidos {

    public static final String FIN = "FIN";

    BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

    public void addOrder(String o) throws InterruptedException{
        queue.put(o);
    }

    public String takeOrder() throws InterruptedException{
        return queue.take();
    }
}
