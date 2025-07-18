import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CompararEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha de su naciemiento en este formato: 'yyyy-MM-dd'");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();

        try{

            Date nacimiento = format.parse(scanner.next());
            Calendar calNacimiento = Calendar.getInstance();
            calNacimiento.setTime(nacimiento);

            Calendar calFechaActual = Calendar.getInstance();
            calFechaActual.setTime(fechaActual);
            int age = calNacimiento.get(Calendar.YEAR) - calFechaActual.get(Calendar.YEAR);

            System.out.println("Su edad es de "+age+ " años");
        } catch (ParseException e) {

        }

    }
}
