package org.rpalacios.ejemplo.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploDuplicate {
    public static void main(String[] args) {
        String[] peces ={"Corvina","Lenguado","Pejerrey","Robalo","Atun", "Lenguado"};

        Set<String> u = new HashSet<>();
        for (String p:peces){
            if (!u.add(p)){
                System.out.println("Elemento duplicado: "+p);

            }
        }
        System.out.println(u.size()+" elemntos no duplicados: "+u);
    }
}
