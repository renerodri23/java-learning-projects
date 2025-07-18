package org.rpalacios.mamaiferos.modelos;

public class Lobo extends Canino{
    private int numCamada;
    private String especieLobo;

    public Lobo(String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo se alimenta tranquilamente. Pesa " + this.peso + " kg, mide " + this.altura + " m de alto y " + this.largo + " m de largo. Además, sus colmillos miden " + this.tamanoColmillos + " cm, lo que le ayuda a cazar y alimentarse con eficacia.";
    }

    @Override
    public String dormir() {
        return "Este lobo de la especie " + this.especieLobo + " duerme con su camada número " + this.numCamada + ", en su hábitat natural: " + this.habitat + ".";
    }

    @Override
    public String correr() {
        return "El lobo, también conocido como " + this.nombreCientifico + ", corre con gran agilidad.";
    }

    @Override
    public String comunicarse() {
        return "Los lobos se comunican principalmente mediante aullidos, que utilizan para comunicarse con la manada.";
    }
}
