package org;

public class Fabrica {
    private String botella;
    private boolean disponible; //buffer

    public synchronized void producir(String agua){
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.botella = agua;
        System.out.println("Produciendo Botella "+this.botella);
        this.disponible=true;
        notify();
    }
    public synchronized String procesar(){
        while(!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Procesando la botella: "+this.botella);
        this.disponible=false;
        notify();
        return botella;
    }
}
