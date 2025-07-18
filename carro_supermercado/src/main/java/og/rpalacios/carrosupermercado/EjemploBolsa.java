package og.rpalacios.carrosupermercado;

import og.rpalacios.carrosupermercado.modelo.*;
import og.rpalacios.carrosupermercado.repositorio.BolsaSupermercado;

import java.util.Scanner;

public class EjemploBolsa{
    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();

        Scanner s = new Scanner(System.in);
         int o;

        System.out.println("Bienvenido por favor ingresar que tipo de producto quiere ingresar en la bolsa de supermercado");
        System.out.println("Escriba el numero:\n 1-Lacteos \n 2-Limpieza \n 3-NoPerecible \n 4-Fruta");
        o = s.nextInt();
        s.nextLine();

        switch(o){
            case 1:
                System.out.println("Has elegido Lacteo");
                while(bolsaLacteos.getDataSources().size()<5){
                    System.out.println("Producto Numero "+(bolsaLacteos.getDataSources().size()+1));
                    System.out.println("Ingrese el nombre del Lacteo: ");
                    s.nextLine();
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el precio del Lacteo");
                    double precio = s.nextDouble();
                    System.out.println("Ingrese la cantidad del Lacteo");
                    int cantidad = s.nextInt();
                    System.out.println("Ingrese las proteinas del Lacteo ");
                    int proteinas = s.nextInt();
                    Lacteo l = new Lacteo(nombre,precio,cantidad,proteinas);
                    bolsaLacteos.addProducto(l);
                }
                System.out.println("\n - - - Productos en la bolsa - - -\n");
                bolsaLacteos.showProductos();
                break;
            case 2:
                System.out.println("Has elegido Limpieza");
                while(bolsaLimpieza.getDataSources().size()<5){
                    System.out.println("Producto Numero "+(bolsaLimpieza.getDataSources().size()+1));
                    System.out.println("Ingrese el nombre del Articulo de Limpieza: ");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el precio del Articulo de Limpieza");
                    double precio = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese los componentes del Articulo de Limpieza");
                    String componentes = s.nextLine();
                    System.out.println("Ingrese los litros del Articulo de Limpieza ");
                    double litros = s.nextDouble();
                    s.nextLine();
                    Limpieza l = new Limpieza(nombre,precio,componentes,litros);
                    bolsaLimpieza.addProducto(l);

                }
                System.out.println("\n - - - Productos en la bolsa - - -\n");
                bolsaLimpieza.showProductos();
                break;
            case 3:
                System.out.println("Has elegido NoPerecible");
                while(bolsaNoPerecibles.getDataSources().size()<5){
                    System.out.println("Producto Numero "+(bolsaNoPerecibles.getDataSources().size()+1));
                    System.out.println("Ingrese el nombre del NoPerecible: ");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el precio del NoPerecible");
                    double precio = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese el contenido del NoPerecible");
                    int contenido = s.nextInt();
                    s.nextLine();
                    System.out.println("Ingrese las calorias del NoPerecible ");
                    int calorias = s.nextInt();
                    s.nextLine();
                    NoPerecible n = new NoPerecible(nombre,precio,contenido,calorias);
                    bolsaNoPerecibles.addProducto(n);
                }
                System.out.println("\n - - - Productos en la bolsa - - -\n");
                bolsaNoPerecibles.showProductos();
                break;
            case 4:
                System.out.println("Has elegido Fruta");
                while(bolsaFrutas.getDataSources().size()<5){
                    System.out.println("Producto Numero "+(bolsaFrutas.getDataSources().size()+1));
                    System.out.println("Ingrese el nombre de la Fruta: ");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese el precio de la Fruta");
                    double precio = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese el peso de la Fruta");
                    double peso = s.nextDouble();
                    s.nextLine();
                    System.out.println("Ingrese el color de la Fruta ");
                    String  color = s.nextLine();
                    Fruta f = new Fruta(nombre,precio,peso,color);
                    bolsaFrutas.addProducto(f);
                }
                System.out.println("\n - - - Productos en la bolsa - - -\n");
                bolsaFrutas.showProductos();
                break;
        }
    }
}
