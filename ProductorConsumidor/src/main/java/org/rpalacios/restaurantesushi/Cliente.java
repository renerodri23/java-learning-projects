package org.rpalacios.restaurantesushi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class Cliente implements Runnable{
    private BandejaPedidos bp;
    private String nombre;
    private TipoSushi ts;

    public Cliente(BandejaPedidos bp, String nombre, TipoSushi ts) {
        this.bp = bp;
        this.nombre = nombre;
        this.ts = ts;
    }


    @Override
    public void run() {


        for (int i=0;i<=5;i++){

            LocalDateTime f = LocalDateTime.now();
            DateTimeFormatter frm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            String ff = f.format(frm);

            String o = "["+nombre+"] Realizo un pedido de Sushi tipo: "+ts+", Orden Numero "+(i+1)+" realizada alas "+ff;
            System.out.println(o);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                bp.addOrder(o);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
