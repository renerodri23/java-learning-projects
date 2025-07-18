import java.util.Scanner;

public class NumeroMax {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i<a.length;i++){
            int numero;
            do{
                System.out.print("Escriba un numero(entre 11 a 99) para la posicion "+i+" del arreglo: ");
                numero = s.nextInt();
                if(numero < 11|| numero > 99){
                    System.out.println("Numero fuera de rango");
                }
            }while(numero<11||numero>99);
            a[i]=numero;

        }
        int max=0;
        for (int i = 0; i < a.length;i++){
            max = (a[max]>a[i] ? max : i);
        }


        System.out.println("El numero maximo de este arreglo esta en la posicion: "+max);
        System.out.println("Y ese numero es: "+a[max]);

    }
}
