import java.util.Scanner;

public class CirculoYSuArea {
    public static void main(String[] args) {
        System.out.println("Bienvenido, ingrese el radio de el circulo: ");
        Scanner scanner = new Scanner(System.in);

         double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio,2);
        System.out.println("EL Area del Circulo es: " + area);

    }
}
