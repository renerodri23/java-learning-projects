package org.rapalacios.datetime.ejemplos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {

        LocalDate f = LocalDate.of(2011,9,23);
        LocalDate f2 = LocalDate.of(2025,7,3);

        // Para cambiar valores utilizar .with f2.withMonth(12);

        Period p = Period.between(f,f2);
        System.out.println("p = " + p);
        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d dias",
                f,f2,p.getYears(),p.getMonths(),p.getDays());
    }
}
