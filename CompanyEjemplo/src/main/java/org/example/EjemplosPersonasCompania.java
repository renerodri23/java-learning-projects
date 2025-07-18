package org.example;

import org.rpalacios.company.*;

public class EjemplosPersonasCompania {
    public static void main(String[] args) {
        System.out.println("========= Empleado ========");
        Empleado persona1 = new Empleado("pao","nubes","DU555","Casa #2, Residencial Violeta",740.0);
        persona1.aumentarRemuneracion(15);
        System.out.println(persona1);

        System.out.println("======= Cliente =======");
        Cliente persona2 = new Cliente("Milton","Rosa","LM3456","Casa #4 Residencial NeoRoneo");
        System.out.println(persona2);

        System.out.println("======= Cliente 2 =======");
        Cliente persona4 = new Cliente("Roy","Towers","ATP345","Casa #4 Residencial Botanica");
        System.out.println(persona4);

        System.out.println("========== Gerente =======");
        Gerente persona3 = new Gerente("Rodrigo","Torres","FDE344","Casa #23 Residencial Honey",800.00,400.00);
        persona3.aumentarRemuneracion(20);;
        System.out.println(persona3);
    }
}
