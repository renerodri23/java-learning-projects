package org.rpalacios.hilos.ejemplos.threads;

public class NombreThread extends Thread{
    @Override
    public void run() {
        System.out.println("Se inicia el metodo run de hilo "+ getName());

        for (int i = 0; i< 10;i++){
            System.out.println(this.getName());
        }

        System.out.println("Finalizando proceso");
    }

    public NombreThread(String name) {
        super(name);
    }
}
