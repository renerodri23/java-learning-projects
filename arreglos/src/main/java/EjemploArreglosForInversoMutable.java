import java.util.Arrays;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
    public static void main(String[] args) {


        String[] productos = {"Kingston Pendrive 64Gb","Samsung Galaxy","Disco Duro SDD Samsung Externo",
                "Asus Notebook","Macbook Air","Chromecast 4ta Genercacion","Cluster de Discos Duros"};

        int total = productos.length;
        



        Arrays.sort(productos);
        System.out.println("==================== usando for===================================");

        for(int i=0; i<total;i++){
            System.out.println("Para indice "+i+":"+productos[i]);
        }

        for(int i=0;i<total/2;i++){
            String actual = productos[i];
            String inverso = productos[total-1-i];
            productos[i]=inverso;
            productos[total-1-i]=actual;
        }
        Collections.reverse(Arrays.asList(productos));
        System.out.println("==================== usando for===================================");

        for(int i=0; i<total;i++){
            System.out.println("Para indice "+i+":"+productos[i]);
        }





    }
}
