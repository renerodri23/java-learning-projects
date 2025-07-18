import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvendio Ingrese el primer numero: ");
        int num1= scanner.nextInt();
        System.out.println("Ingrese el Segundo numero: ");
        int num2= scanner.nextInt();

        String resultado = (num1 > num2) ? num1  + " y " + num2 :num2  + " y " + num1 ;
        System.out.println("los numeros ordenados de mayor a menor: " + resultado);

    }
}
