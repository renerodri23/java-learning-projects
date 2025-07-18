import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForOrdenamientoBurbuja {
    public static void main(String[] args) {


        String[] productos = {"Kingston Pendrive 64Gb","Samsung Galaxy","Disco Duro SDD Samsung Externo",
                "Asus Notebook","Macbook Air","Chromecast 4ta Genercacion","Cluster de Discos Duros"};

        int total = productos.length;
        


        int contador = 0;
        //Arrays.sort(productos);
        for(int i = 0; i <total;i++){
            for(int j =0;j<total;j++){
                if(productos[i].compareTo(productos[j])<0){
                    String auxiliar = productos[i];
                    productos[i]=productos[j];
                    productos[j]=auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);

        for(int i=0; i<total;i++){
            System.out.println("Para indice "+i+":"+productos[i]);
        }





    }
}
