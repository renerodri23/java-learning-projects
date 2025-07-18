package org.rpalacios.catalogo.ejemplo;

import org.rpalacios.catalogo.modelo.IPhone;
import org.rpalacios.catalogo.modelo.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EjemploCatalogo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        IPhone iphone = new IPhone(500,"Aple","Iphone 15","Rojo");


        TvLcd tv = new TvLcd(100,"Xiomai",123);

        Date spidermanDate = sdf.parse("18/03/2004");
        Comics spiderman = new Comics(5,spidermanDate,"Stan lee","Marvel Spiderman", "Marvel");
        spiderman.addPersonaje("Gwen Stacy")
                .addPersonaje("Peter Parker")
                .addPersonaje("Rhino")
                .addPersonaje("Doctor octopus")
                .addPersonaje("Miles Morales");

        System.out.println(spiderman);
        System.out.println(iphone);
        System.out.println(tv);
    }

}
