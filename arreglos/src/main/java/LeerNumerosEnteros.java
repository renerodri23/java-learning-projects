import java.util.Scanner;

public class LeerNumerosEnteros {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido ingresa 10 numeros enteros");

        for (int i=0;i<num.length;i++){
            System.out.print("Ingresa el numero para la poscion "+i+ " de la lista: ");
            num[i]=s.nextInt();

        }
        System.out.println("Los numeros en el arreglo son los siguiente");
        for (int i = 0; i < num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("La lista de numeros ordenadas:");
        for(int i=0;i<=4;i++){
            System.out.println(num[9-i]);
            System.out.println(num[i]);
        }

    }
}
