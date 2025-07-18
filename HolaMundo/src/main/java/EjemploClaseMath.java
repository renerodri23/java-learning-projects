public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);
        
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
        
        long redondo = Math.round(3.5);
        System.out.println("redondo = " + redondo);

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);
        
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        System.out.println("grados = " + grados);
        
    }
}
