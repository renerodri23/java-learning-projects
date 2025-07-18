import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner scanner =  new Scanner(System.in);

        for(int i = 0; i<a.length; i++){
            a[i] = scanner.nextInt();

        }

        int max = 0;
        for(int i = 0; i <a.length; i ++){
            max = (a[max] > a[i]) ? max : i;
        }

        System.out.println("max = " + a[max]);


    }
}
