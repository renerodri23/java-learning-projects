package org.rapalacios.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fc = LocalDateTime.now();
        System.out.println("fc = " + fc);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("E dd MMM yyyy  hh:mm:ss a");
        String ff = f.format(fc);
        System.out.println("ff = " + ff);
    }
}
