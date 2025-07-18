package org.rpalacios.impresoracompartida;

public class Libreria {
    public static void main(String[] args) throws InterruptedException {
        Impresora im = new Impresora();

        Runnable p1 = new UsuarioProductor("Rene","Gris",im);
        Runnable p2 = new UsuarioProductor("Israel","Kick of the drowing",im);

        Runnable c = new ImpresoraConsumidor(im);

        Thread h1 = new Thread(p1);
        Thread h2 = new Thread(p2);
        Thread hc = new Thread(c);

        h1.start();
        h2.start();
        hc.start();

        h1.join();
        h2.join();

        im.put(Impresora.FIN);
        hc.join();
    }
}
