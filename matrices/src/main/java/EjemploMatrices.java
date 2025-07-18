public class EjemploMatrices {
    public static void main(String[] args) {

        int[][] numeros = new int[2][4];

        System.out.println("Numero de filas: "+numeros.length);
        System.out.println("Numero de columnas: "+numeros[0].length);

        System.out.println("Primer elemento de la matriz: "+numeros[0][0]);
        System.out.println("Ultimo elemento de la matris: "+numeros[numeros.length-1][numeros[1].length-1]);
    }
}
