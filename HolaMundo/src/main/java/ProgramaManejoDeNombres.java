import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, Ingrese el primer nombre");
        String nombre1= scanner.nextLine();
        System.out.println("Ingrese el segundo nombre");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese el tercer nombre");
        String nombre3 = scanner.nextLine();

        String nom1 = nombre1.toUpperCase().charAt(1) + ".".concat(nombre1.substring(nombre1.length()-2));
        String nom2 = nombre2.toUpperCase().charAt(1) + ".".concat(nombre2.substring(nombre2.length()-2));
        String nom3 = nombre3.toUpperCase().charAt(1) + ".".concat(nombre3.substring(nombre3.length()-2));

        System.out.println("Los Nombre con los ajustes pedidos son:");
        System.out.println(nom1.concat("_").concat(nom2).concat("_").concat(nom3));


    }
}
