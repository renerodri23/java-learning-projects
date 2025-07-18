import java.util.Scanner;

public class EjemploLogin {
    public static void main(String[] args) {

        String[] usernames = new String[4];
        String[] passwords = new String[4];

        usernames[0]="andres";
        passwords[0]="serpiente";

        usernames[1]="rene";
        passwords[1]="spider";

        usernames[2]="felipe";
        passwords[2]="2003";

        usernames[3]="israel";
        passwords[3]="2005";



        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");

        String usuario = scanner.nextLine();
        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;
        for(int i = 0; i< usernames.length;i++) {
            if (usernames[i].equals(usuario) && passwords[i].equals(p)) {
                esAutenticado = true;
                break;
            }
        }
        if(esAutenticado){
            System.out.println("Bienvenido ".concat(usuario).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecta");

            System.out.println("Lo siento, requiere autenticación");
        }
    }
}
