import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        int[] a = new int[12];
        int[] frecuencia = new int [6];
        Scanner s = new Scanner(System.in);
        int num;

        for(int i=0;i<a.length;i++){
            do{
                System.out.println("Ingrese el numero(de rango 1 al 6) para la posicion "+i+" del areglo");
                num=s.nextInt();
                if (num <1||num>6){
                    System.out.println("Su numero no esta en el rango pedido");
                }

            }while(num<1||num>6);
            a[i]=num;
            frecuencia[a[i]-1]++;


        }
        for(int i =0;i<frecuencia.length;i++){
            System.out.println((i+1)+":"+"*".repeat(frecuencia[i]));
        }

    }
}
