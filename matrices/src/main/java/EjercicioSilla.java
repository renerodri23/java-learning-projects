import java.util.Scanner;

public class EjercicioSilla {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el valor de n que se utilizara para la creacion de la matriz (n x n)");
        int n = s.nextInt();
        if (n==0){
            System.err.println("ERROR");
            return;
        }
        int[][] m =new int[n][n];

        for (int i=0;i< m.length;i++){
            for (int j=0;j<m[i].length;j++){
                if (0==j || i== m.length/2||j==m[i].length-1 && i>m.length/2){
                    m[i][j]= 1;
                }else {
                    m[i][j]=0;
                }
            }
        }

        for (int i=0;i< m.length;i++){
            for (int j=0;j<m[i].length;j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
