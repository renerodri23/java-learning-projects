import java.util.Scanner;

public class ElementoRepetido {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número del 1 al 9: ");
            a[i] = s.nextInt();
        }

        // Contar repeticiones
        for (int i = 0; i < a.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    cantidad++;
                }
            }
            b[i] = cantidad;
        }

        int index = 0;
        int max = 0;
        for (int k = 0; k < b.length; k++) {
            if (b[k] > max) {
                max = b[k];
                index = k;
            }
        }

        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que más se repite es: " + a[index]);
        System.out.println("El elemento " + a[index] + " está repetido " + max + " veces");
    }
}
