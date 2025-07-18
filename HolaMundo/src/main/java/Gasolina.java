import java.util.Scanner;

public class Gasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bievenido, Ingrese la medida actual del estanque de gas (max 70 litros)");

        double gas = scanner.nextDouble();

        if(gas==70){
            System.out.println("Estanque lleno");
        } else if (gas>=60 && gas<70) {
            System.out.println("Estanque casi lleno");
        }else if (gas>=40 && gas<60) {
            System.out.println("Estanque 3/4");
        }else if (gas>=35 && gas<40) {
            System.out.println("Medio Estanque");
        }else if (gas>=20 && gas<35) {
            System.out.println("Suficiente");
        }else if (gas>=1 && gas<20) {
            System.out.println("Insuficiente");
        }else {
            System.out.println("Medidas no aceptadas");
        }
    }
}
