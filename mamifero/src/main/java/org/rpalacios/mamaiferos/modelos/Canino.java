package org.rpalacios.mamaiferos.modelos;

abstract public class Canino extends Mamiferos {
    protected String color;
    protected float tamanoColmillos;

    public Canino(String color, float tamanoColmillos) {
        super();
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

}
