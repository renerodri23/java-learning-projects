import javax.swing.*;

public class NombesLargos {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingresa el nombre de la primera persona: ");
        String nombre2 = JOptionPane.showInputDialog("Ingresa el nombre de la segunda persona: ");
        String nombre3 = JOptionPane.showInputDialog("Ingresa el nombre de la tercera persona: ");

        String max = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1;
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: nombre3;

        System.out.println("La persona con el nombre mas largo es " + max);

    }
}
