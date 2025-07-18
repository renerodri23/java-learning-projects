import java.util.Date;

public class EjemploAutomovil {
    public static void main(String[] args) {
        
        Automovil subaru = new Automovil("subaru","impreza");

        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);


        Automovil mazda = new Automovil("mazda","bt-50",Color.ROJO);
        mazda.setMotor(new Motor(3.0,TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque());

        Automovil.setColorPatente(Color.AZUL);

        Automovil nissan = new Automovil("Nissan", new Estanque(60),new Motor(),Color.GRIS,"Navara");
        Automovil nissan2 = new Automovil("Nissan", new Estanque(50),new Motor(),Color.GRIS,"Navara");

        Automovil auto = new Automovil();
        Date fecha =new Date();

        System.out.println(nissan2 == nissan);
        System.out.println(nissan.equals(nissan2));

        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(auto.equals(nissan2));

        System.out.println(subaru.detalle());
        System.out.println(mazda.detalle());
        System.out.println(nissan.detalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(mazda.frenar());
        System.out.println(" Automovil.colorPatente= " +Automovil.getColorPatente() );



        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println(mazda.calcularConsumo(232,0.49f));
        System.out.println(mazda.calcularConsumo(232,60));
        System.out.println(nissan.calcularConsumo(232,60));

        System.out.println("Velocidad maxima en carretera: "+Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima en ciudad: "+Automovil.VELOCIDAD_MAX_CIUDAD);

    }
}
