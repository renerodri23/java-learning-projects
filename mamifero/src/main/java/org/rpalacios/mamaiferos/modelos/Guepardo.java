package org.rpalacios.mamaiferos.modelos;

public class Guepardo extends Felino{
    public Guepardo(float tamanoGarras, int velocidad) {
        super(tamanoGarras, velocidad);
    }

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo se alimenta tranquilamente. Pesa " + this.peso + " kg, mide " + this.altura + " m de alto y " + this.largo + " m de largo. Además, sus garras miden " + this.tamanoGarras + " cm, lo que le ayuda a cazar y alimentarse con eficacia.";
    }

    @Override
    public String dormir() {
        return "El guepardo suele dormir en su hábitat natural: " + this.habitat + ".";
    }

    @Override
    public String correr() {
        return "El guepardo, también conocido como " + this.nombreCientifico + ", puede alcanzar velocidades de hasta " + this.velocidad + " km/h.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo se comunica principalmente mediante ronroneos.";
    }
}
