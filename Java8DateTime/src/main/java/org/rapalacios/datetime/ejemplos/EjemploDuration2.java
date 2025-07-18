package org.rapalacios.datetime.ejemplos;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjemploDuration2 {
    public static void main(String[] args) {

        Instant i = Instant.now();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant i2 = Instant.now();

        Duration t = Duration.between(i,i2);
        System.out.println(t);
    }
}
