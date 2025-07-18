import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {


        String[] productos = new String[7];
        int total = productos.length;


        productos[0] = "Kingston Pendrive 64GB";
        productos[1]="Samsung Galaxy";
        productos[2]="Disco Duro SSD Samsumng Externo";
        productos[3]="Asus Notebook";
        productos[4]="Macjook Air";
        productos[5]="Chromecast 4ta Generacion";
        productos[6]="Cluster de Discos Duros";

        Arrays.sort(productos);
        System.out.println("==================== usando for===================================");

        for(int i=0; i<total;i++){
            System.out.println("Para indice "+i+":"+productos[i]);
        }
        System.out.println("=================usando foreach========================");
        for(String prod : productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("===================== Usando While ========================================");
        int i=0;

        while(i<total){
            System.out.println("para indice " + i+": " + productos[i]);
            i++;
        }
        //
        System.out.println("===================== Usando Do While ========================================");
        int j=0;

        do {
            System.out.println("para indice " + j+": " + productos[j]);
            j++;
        }while(j<total);
        //
        int[] numeros = new int[10];



    }
}
