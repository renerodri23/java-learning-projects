package org.rpalacios.poointerfaces.imprenta.modelo;

public interface Imprimible {
    String TEXTO_DEFAULT = "Imprimiendo valor por defecto";

    default String imprimir(){
        return TEXTO_DEFAULT;
    }

     static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
