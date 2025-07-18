public class EjemploStringMetodos {
    public static void main(String[] args){
        
        String nombre = "Rene";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        System.out.println("nombre.equals(\"Rene\") = " + nombre.equals("Rene"));
        System.out.println("nombre.equals(\"rene\") = " + nombre.equals("rene"));

        System.out.println("nombre.equalsIgnoreCase(\"rene\") = " + nombre.equalsIgnoreCase("rene"));
        System.out.println("nombre.compareTo(\"Rene\") = " + nombre.compareTo("Rene"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));

        String trabalengua = "trabalengua";
        System.out.println("trabalengua = " + trabalengua.replace("a","."));
        System.out.println("trabalengua.indexOf(\"a\") = " + trabalengua.indexOf("a"));
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf("a"));
    }
    
}
