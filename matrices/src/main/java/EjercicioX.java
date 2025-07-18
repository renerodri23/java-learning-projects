import java.util.Scanner;

public class EjercicioX {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el valor de n que se utilizara para la creacion de la matriz (n x n)");
        int n = s.nextInt();
        if (n==0){
            System.err.println("ERROR");
            return;
        }
        String[][] m =new String[n][n];

        for (int i=0;i< m.length;i++){
            for (int j=0;j<m[i].length;j++){
                if (i==j||i+j == n -1){
                    m[i][j]= "X";
                }else {
                    m[i][j]="_";
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
