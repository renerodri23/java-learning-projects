package org.rpalacios.recursividad.ejemplo.models;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente Poder 700");
        Componente placaMadre =  new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("Cpu AMD Ryzen 5 2900");
        Componente ventilador = new Componente("Ventildor");
        Componente disipador = new Componente("Disispador");
        Componente tv = new Componente("arjeta de video");
        Componente gpu = new Componente("gpu");
        Componente gpuram = new Componente("45gb ");
        Componente gpuram2 = new Componente("ram");
        Componente gpuVentiladores = new Componente("Ventilador");
        Componente ram =  new Componente("ram");
        Componente ssd = new Componente("ssd");

        cpu.addComponente(ventilador).addComponente(disipador);
        tv.addComponente(gpu).addComponente(gpuram).addComponente(gpuram2).addComponente(gpuVentiladores);
        placaMadre.addComponente(cpu).addComponente(tv).addComponente(ram).addComponente(ssd);

        pc.addComponente(poder).addComponente(placaMadre).addComponente(new Componente("Teclado y Mouse"));

        estadoRecursivo(pc);
    }

    public static void estadoRecursivo(Componente c){
        System.out.println(c.getNombre());
        if (c.hasChildren()){
            for (Componente children: c.getHijos()){
                estadoRecursivo(children);
            }
        }
    }
}
