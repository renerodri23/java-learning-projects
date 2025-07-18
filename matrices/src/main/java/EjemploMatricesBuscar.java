import java.util.Scanner;

public class EjemploMatricesBuscar {
    public static void main(String[] args) {

        int[][] matrizEnteros = {
                {35, 90, 3 ,1978 },
                { 15, 2020, 10, 5},
                {677, 127, 3267, 1999}
        };
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el numero que quiere buscar en la matriz");
        int elementoBuscado = s.nextInt();
        boolean encontrado = false;
        int i;
        int j=0;
        buscar: for(i = 0; i< matrizEnteros.length;i++){
            for (j = 0; j < matrizEnteros[i].length;j++){
                if (matrizEnteros[i][j]==elementoBuscado){
                    encontrado= true;
                    break buscar;
                }
            }

        }
        if(encontrado){
            System.out.println("encontrado = " + elementoBuscado+" en la coordenadas: "+i +" , "+j);
        } else {
            System.out.println(elementoBuscado + " no se encontro en la matriz");
        }
    }
}
