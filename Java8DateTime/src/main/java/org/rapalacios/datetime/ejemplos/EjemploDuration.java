package org.rapalacios.datetime.ejemplos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EjemploDuration {
    public static void main(String[] args) {

        LocalDateTime f =LocalDateTime.now();
        LocalDateTime f2 = LocalDateTime.now().plusHours(2).plusDays(2).plusMinutes(30);

        Duration lapsus = Duration.between(f,f2);
        System.out.println(lapsus);



    }
}
