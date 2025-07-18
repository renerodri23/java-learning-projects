package org.rpalacios.mamaiferos.modelos;

abstract public class Felino extends Mamiferos{
    protected float tamanoGarras;
    protected int velocidad;

    public Felino(float tamanoGarras, int velocidad) {
        super();
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
