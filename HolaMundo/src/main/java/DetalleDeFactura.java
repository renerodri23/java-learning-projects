
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido, Digite el nombre de la factura ");
        String factura= scanner.nextLine();

        System.out.println("Digite el precio del primer producto");
        double precio1 = scanner.nextDouble();

        System.out.println("Digite el precio del segundo producto ");
        double precio2 = scanner.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuestos = totalBruto * 0.19;
        double neto = totalBruto + impuestos;

        String descripcion = "la factura " + factura + "tiene un total bruto de "+totalBruto+" con un impuesto de "+impuestos+" y el monto despues de impuesto es de "+neto;
        System.out.println(descripcion);


    }
}
