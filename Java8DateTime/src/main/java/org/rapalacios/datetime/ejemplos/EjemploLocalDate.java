package org.rapalacios.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDate {
    public static void main(String[] args) {

        LocalDate f = LocalDate.now();

        f = LocalDate.of(2020, 3, 23);
        System.out.println(f);

        f = LocalDate.of(2020, Month.JULY, 15);
        System.out.println(f);

        f = LocalDate.parse("2023-01-29");
        System.out.println(f);

        LocalDate m = LocalDate.now().plusDays(1);
        System.out.println(m);

        LocalDate m2 = LocalDate.now().plusMonths(1);
        System.out.println(m2);

        boolean bisiesto = LocalDate.now().isLeapYear();
        System.out.println("bisiesto = " + bisiesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2025-07-07"));
        System.out.println("esAntes = " + esAntes);

        boolean esDespues = LocalDate.parse("2025-06-08").isAfter(LocalDate.now());
        System.out.println("esDespues = " + esDespues);

        f = LocalDate.now();
        Locale es = Locale.forLanguageTag("es");
        System.out.println(f);
        StringBuilder sb = new StringBuilder().append(f.getDayOfWeek().getDisplayName(TextStyle.FULL,es))
                .append(" ").append(f.getDayOfMonth()).append(" de ")
                .append(f.getMonth().getDisplayName(TextStyle.FULL,es)).append(" ").append(f.getYear());
        System.out.println(sb);

    }

}
