import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {


        int i = 5, j = 4,suma = i+j;

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + (i + j));

        int resta = i-j;
        System.out.println("resta = " + (i-j));

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));




    }
}
