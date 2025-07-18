package org.rpalacios.mamaiferos.modelos;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(float tamanoGarras, int velocidad, String especieTigre) {
        super(tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre se alimenta tranquilamente. Pesa " + this.peso + " kg, mide " + this.altura + " m de alto y " + this.largo + " m de largo. Además, cuenta con garras de " + this.tamanoGarras + " cm, las cuales le permiten cazar con precisión y desgarrar su alimento con facilidad.";
    }

    @Override
    public String dormir() {
        return "La especie " + this.especieTigre + " suele dormir en su hábitat natural: " + this.habitat + ".";
    }

    @Override
    public String correr() {
        return "El tigre, también conocido como " + this.nombreCientifico + ", puede alcanzar una velocidad de hasta " + this.velocidad + " km/h cuando corre.";
    }

    @Override
    public String comunicarse() {
        return "El tigre se comunica por rugidos";
    }
}
