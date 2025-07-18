package org.rpalacios.ejemplo.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploDuplicate2 {
    public static void main(String[] args) {
        String[] peces ={"Corvina","Atun","Lenguado","Pejerrey","Robalo","Atun", "Lenguado"};

        Set<String> u = new HashSet<>();
        Set<String> d = new HashSet<>();
        for (String p:peces){
            if (!u.add(p)){
                d.add(p);
            }
        }
        u.removeAll(d);
        System.out.println(u.size()+" elemntos no duplicados: "+u);
        System.out.println(d.size()+ " elemntos duplicados: "+d);
    }
}
