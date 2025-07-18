package org.rpalacios.mamaiferos.modelos;

public class Perro extends Canino{
    private int fuerzaMordida;

    public Perro(String color, float tamanoColmillos, int fuerzaMordida) {
        super(color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro se alimenta tranquilamente. Pesa " + this.peso + " kg, mide " + this.altura + " m de alto y " + this.largo + " m de largo. Además, sus colmillos miden " + this.tamanoColmillos + " cm, lo que le ayuda a cazar y comer, y tiene una fuerza de mordida de " + fuerzaMordida + ".";
    }

    @Override
    public String dormir() {
        return "Este perro duerme en su hábitat natural: " + this.habitat + ".";
    }

    @Override
    public String correr() {
        return "El perro, también conocido como " + this.nombreCientifico + ", corre con agilidad.";
    }

    @Override
    public String comunicarse() {
        return "Los perros se comunican principalmente mediante ladridos.";
    }
}
