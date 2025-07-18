class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;

    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Andrés");

        System.out.println("Iniciamos el metodo main");

        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo tets");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona = " + persona.leerNombre());
        System.out.println("Finalizamos el metodo main con el arreglo modificado");

    }
    public static void test(Persona persona){
        System.out.println("Iniciamos el mtodo test");
        persona.modificarNombre("Felipe");
        System.out.println("Finalizamos el metodo test");
    }
}
