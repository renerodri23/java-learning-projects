package org.rpalacios.mamaiferos.modelos;

public class Leon extends Felino{
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El león se alimenta con calma. Pesa " + this.peso + " kg, mide " + this.altura + " m de alto y " + this.largo + " m de largo. Además, sus garras miden " + this.tamanoGarras + " cm, lo que le ayuda a cazar y alimentarse eficazmente.";    }

    @Override
    public String dormir() {
        return "Este león duerme junto a su manada número " + this.numManada + ", en su hábitat natural: " + this.habitat + ".";    }

    @Override
    public String correr() {
        return "El león, también conocido como " + this.nombreCientifico + ", puede correr a una velocidad de hasta " + this.velocidad + " km/h.";
    }

    @Override
    public String comunicarse() {
        return "El león se comunica mediante rugidos, que pueden alcanzar una potencia de hasta " + potenciaRugidoDecibel + " decibeles.";
    }
}
