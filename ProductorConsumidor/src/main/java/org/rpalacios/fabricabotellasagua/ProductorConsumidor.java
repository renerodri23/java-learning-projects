package org.rpalacios.fabricabotellasagua;

import org.Fabrica;
import org.rpalacios.fabricabotellasagua.runnable.Consumidor;
import org.rpalacios.fabricabotellasagua.runnable.Productor;

public class ProductorConsumidor {
    public static void main(String[] args) {
        Fabrica f = new Fabrica();
        new Thread(new Productor(f)).start();
        new Thread(new Consumidor(f)).start();
    }
}
