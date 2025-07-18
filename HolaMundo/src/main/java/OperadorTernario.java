public class OperadorTernario {
    public static void main(String[] args) {

        String variable= 7==7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";

        double promedio= 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historias = 0.0;

        promedio = (matematicas + ciencias + historias)/3;

        estado = promedio >= 5.49 ? "Aprobado":"Rechazado";
        System.out.println("estado = " + estado);

    }
}
