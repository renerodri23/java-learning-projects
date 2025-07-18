import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {


        String[] productos = {"Kingston Pendrive 64Gb","Samsung Galaxy","Disco Duro SDD Samsung Externo",
                "Asus Notebook","Macbook Air","Chromecast 4ta Genercacion","Cluster de Discos Duros"};

        int total = productos.length;


        /*productos[0] = "Kingston Pendrive 64GB";
        productos[1]="Samsung Galaxy";
        productos[2]="Disco Duro SSD Samsumng Externo";
        productos[3]="Asus Notebook";
        productos[4]="Macjook Air";
        productos[5]="Chromecast 4ta Generacion";
        productos[6]="Cluster de Discos Duros";*/

        Arrays.sort(productos);
        System.out.println("==================== usando for===================================");

        for(int i=0; i<total;i++){
            System.out.println("Para indice "+i+":"+productos[i]);
        }
        System.out.println("==================== usando for inverso ===================================");

        for(int i=0;i<total;i++){
            System.out.println("para i = "+(total-1-i)+" valor: "+productos[total-1-i]);
        }
        System.out.println("==================== usando for inverso 2 ===================================");
        for(int i = total -1;i>=0;i--){
            System.out.println("Para i = "+i+ " Valor "+productos[i]);

        }





    }
}
