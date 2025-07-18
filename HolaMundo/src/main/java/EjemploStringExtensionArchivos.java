public class EjemploStringExtensionArchivos {
    public static void main(String[] args) {
        
        String archivo = "alguna_imagen.jpeg";
        int i = archivo.indexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
    }
}
