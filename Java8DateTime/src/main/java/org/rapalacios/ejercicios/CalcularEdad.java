package org.rapalacios.ejercicios;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class CalcularEdad {

    public static void main(String[] args) {

        LocalDate fN = LocalDate.parse(JOptionPane.showInputDialog("Escribe su fecha de nacimiento (formato yyyy-MM-dd): "));
        LocalDate fH = LocalDate.now();

        Period p = Period.between(fN,fH);

        String m = String.format("Su Edad es de %d años",p.getYears());
        JOptionPane.showMessageDialog(null,m);
    }
}
