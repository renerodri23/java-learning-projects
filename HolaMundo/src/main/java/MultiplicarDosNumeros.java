import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvendio!");
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        int resultado= 0;


        boolean signo1 =num1 > -1;
        boolean signo2 = num2 > -1;

        int numerofinal = signo1 ? num1 : -num1;
        for(int i = 0; i < numerofinal; i++){
            resultado=resultado+num2;

        }

        if (!signo1){
            resultado = -resultado;
        }
        System.out.println(resultado);
    }
}
