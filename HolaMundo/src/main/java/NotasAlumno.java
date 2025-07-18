import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Scanner scanner = new Scanner(System.in);

        double nota;
        int nota1=0;
        int notaMayorA5 = 0;
        int notaMenorA4= 0;
        double sumaNotaMayoresA5 = 0;
        double sumaNotaMenoresA4 = 0;
        double sumaTotal = 0;

        double promedioNotasMayoresA5, promedioNotasMenoresA4;

        boolean error = false;

        for ( int i = 0; i<20;i++){
            System.out.println("Introduzca una nota entre 1 y 7");
            nota = scanner.nextDouble();

            if (nota == 0){
                error = true;
                break;
            }

            if(nota==1){
                nota1++;
            }else{
                if(nota>5){
                    notaMayorA5++;
                    sumaNotaMayoresA5 += nota;
                }else if (nota < 4){
                    notaMenorA4++;
                    sumaNotaMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error){
            System.out.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
            System.exit(1);
        }
        System.out.println("El número de notas 1 es de: " + nota1);

        if (notaMayorA5== 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotaMayoresA5 / notaMayorA5;
            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        if (notaMenorA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotaMenoresA4 / notaMenorA4;
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
    }
}


