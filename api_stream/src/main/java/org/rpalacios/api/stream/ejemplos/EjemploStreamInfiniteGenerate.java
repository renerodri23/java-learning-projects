package org.rpalacios.api.stream.ejemplos;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class EjemploStreamInfiniteGenerate {
    public static void main(String[] args) {

        AtomicInteger c = new AtomicInteger(0);
        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return c.incrementAndGet();
        }).limit(7).forEach(System.out::println);
    }
}
