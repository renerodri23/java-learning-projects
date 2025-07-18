package org.rapalacios.datetime.ejemplos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {
    public static void main(String[] args) {

        LocalTime h = LocalTime.now();
        System.out.println(h);
        System.out.println(h.getHour());
        System.out.println(h.getMinute());
        System.out.println(h.getSecond());

        LocalTime seiscontreinta = LocalTime.of(6,38);
        System.out.println(seiscontreinta);
        seiscontreinta = LocalTime.parse("06:38");
        System.out.println("seiscontreinta = " + seiscontreinta);

        LocalTime ejemplo2 = LocalTime.of(18,30).plus(1, ChronoUnit.HOURS);
        System.out.println("ejemplo2 = " + ejemplo2);

        //Hora 24h = HH
        //Hora en 12h = hh

        System.out.println("Formato AM/PM");
        DateTimeFormatter st = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(st.format(LocalTime.now()));
        System.out.println(st.format(ejemplo2));


    }
}
