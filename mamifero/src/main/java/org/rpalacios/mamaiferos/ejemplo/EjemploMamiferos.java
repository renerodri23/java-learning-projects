package org.rpalacios.mamaiferos.ejemplo;

import org.rpalacios.mamaiferos.modelos.*;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamiferos[] mamiferos = new Mamiferos[5];


        Mamiferos leon = new Leon("Sur Africa", 3, 3, 134, "Panthera leo", 4, 20, 2, 114);
        Mamiferos tigre = new Tigre("Asia", 3, 3, 134, "Panthera tigris", 4, 20, "Tigre de Bali");
        Mamiferos guepardo = new Guepardo("Africa subsahariana", 3, 3, 134, "Acinonyx jubatus", 3, 60);
        Mamiferos lobos = new Lobo("America del Norte", 3, 3, 120, "Canis lupus", "Gris", 3, 3, "Lobo Gris");
        Mamiferos perro = new Perro("Templados", 3, 3, 120, "Canis familiaris", "Negro", 3, 743);

        mamiferos[0] = leon;
        mamiferos[1] = guepardo;
        mamiferos[2] = tigre;
        mamiferos[3] = lobos;
        mamiferos[4] = perro;

        for (Mamiferos animal : mamiferos) {
            if (animal != null) {
                System.out.println("============" + animal.getClass().getSimpleName() + "====================================");
                System.out.println("Metodo Comer");
                System.out.println(animal.comer());
                System.out.println();
                System.out.println("Metodo dormir");
                System.out.println(animal.dormir());
                System.out.println();
                System.out.println("Metodo correr");
                System.out.println(animal.correr());
                System.out.println();
                System.out.println("Metodo comunicarse");
                System.out.println(animal.comunicarse());
                System.out.println();
            }

        }
    }
}



