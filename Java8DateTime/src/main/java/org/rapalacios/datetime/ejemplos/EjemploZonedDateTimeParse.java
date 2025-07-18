package org.rapalacios.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class EjemploZonedDateTimeParse {
    public static void main(String[] args) {

        LocalDateTime f = LocalDateTime.parse("2025-07-12T12:45");
        DateTimeFormatter fF = DateTimeFormatter.ofPattern("E dd 'de' MMM yyyy  hh:mm:ss a");


        ZoneId ny = ZoneId.of("America/New_York");
        ZonedDateTime zoneNy = ZonedDateTime.of(f, ny);

        System.out.println("Horario de partida de New York: " + fF.format(zoneNy));

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zoneMadrid = zoneNy.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Horario de llegada de Madrid: " + fF.format(zoneMadrid));

        ZonedDateTime zny = f.atZone(ny);
        System.out.println(zny);
       // ZoneId.getAvailableZoneIds().forEach(System.out::println);
        System.out.println(zny);
    }
}
