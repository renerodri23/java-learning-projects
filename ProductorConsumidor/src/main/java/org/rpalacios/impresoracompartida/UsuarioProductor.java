package org.rpalacios.impresoracompartida;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class UsuarioProductor implements Runnable{



    private Impresora im;
    private String autor;
    private String titulo;

    public UsuarioProductor(String autor, String titulo, Impresora im) {
        this.autor = autor;
        this.titulo = titulo;
        this.im = im;
    }

    @Override
    public void run() {
        //fecha
        LocalDateTime f = LocalDateTime.now();
        DateTimeFormatter frm = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String ff = f.format(frm);

        for(int i=0;i<5;i++){
            String doc = this.titulo +" - hoja "+(i+1);
            System.out.println("["+this.autor+"] envió: "+ doc+" a las "+ff);
            try {
                TimeUnit.SECONDS.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                im.put(doc);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}
