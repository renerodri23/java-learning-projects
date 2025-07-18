import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = { "Azul","Amarillo","Rojo","Verde","Blanco","Negro"};

        double rando = Math.random();
        System.out.println("rando = " + rando);
        rando *= colores.length;

        rando = Math.floor(rando);
        System.out.println("rando = " + rando);
        System.out.println("colores = " + colores[(int) rando]);

        Random random = new Random();
        int randomInt = random.nextInt(7);
        System.out.println("randomInt = " + randomInt);



    }
}

