import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner s = new Scanner(System.in);

        int ultimo;

        for(int i = 0;i<a.length;i++){
            System.out.print("Ingrese el numero: ");
            a[i]=s.nextInt();
        }

        ultimo = a[a.length-1];
        for(int i =a.length-2;i>=0;i--){
            a[i+1] = a[i];
        }
        a[0]=ultimo;

        System.out.println("El areglo");
        for(int i =0; i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
