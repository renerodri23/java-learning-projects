package org.rpalacios.genericsclass;

import java.util.Scanner;

public class EjemploGenericos {
    public static <T>void imprimirCamion(Camion<T> c){
        for (T t: c){
            if (t instanceof Animal){
                System.out.println(((Animal)t).getNombre()+" tipo: "+((Animal)t).getTipo());
            }
            else if (t instanceof Maquinaria){
                System.out.println((((Maquinaria)t).getTipo()));
            }
            else if (t instanceof Automovil){
                System.out.println(((Automovil)t).getMarca());
            }

        }
    }
    public static void main(String[] args) {

        Camion<Animal> transporteCabllos =  new Camion<>(5);
        transporteCabllos.add(new Animal("Juan","Caballo"));
        transporteCabllos.add(new Animal("Peregrino","Caballo"));
        transporteCabllos.add(new Animal("Twilight Sparkle","Pony"));
        transporteCabllos.add(new Animal("FlutterShy","Pony"));

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el nombre del ultimo caballo del camion: ");
        String nc=s.nextLine();
        System.out.println("Ingrese el tipo del ultimo caballo del camion");
        String tc = s.nextLine();

        transporteCabllos.add(new Animal(nc,tc));

        imprimirCamion(transporteCabllos);

        Camion<Maquinaria> transporteM = new Camion<>(3);
        transporteM.add(new Maquinaria("Bulldozer"));
        transporteM.add(new Maquinaria("Grua Horquilla"));
        transporteM.add(new Maquinaria("Perforadora"));
        System.out.println();

        imprimirCamion(transporteM);

        Camion<Automovil> transporteA = new Camion<>(3);
        transporteA.add(new Automovil("Toyota"));
        transporteA.add(new Automovil("Mitsubishi"));
        transporteA.add(new Automovil("Chevrolet"));
        System.out.println();

        imprimirCamion(transporteA);
    }
}
