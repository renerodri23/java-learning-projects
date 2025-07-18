import java.util.Scanner;

public class NumerosPromedio {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        int sumaNegativo=0;
        int sumaPositivo=0;
        int positivo=0;
        int negativo = 0;
        int ceros = 0;

        for (int i=0;i<a.length;i++){
            System.out.println("Ingrese el numero para la posicion "+i+" del arreglo");
            a[i]= s.nextInt();
            if(a[i]<0){
                sumaNegativo+=a[i];
                negativo++;
            } else if (a[i]>0) {
                sumaPositivo+=a[i];
                positivo++;
            } else if (a[i]==0) {
                ceros++;

            }
        }
        double promP= (double)sumaPositivo/positivo;
        double promN = (double)sumaNegativo/negativo;


        System.out.println("El promedio de los numeros positivos es de: "+ promP);
        System.out.println("El promedio de los numeros negativos es de: "+ promN);

        System.out.println("La cantidad de 0 registrada es de: "+ceros);

    }
}
