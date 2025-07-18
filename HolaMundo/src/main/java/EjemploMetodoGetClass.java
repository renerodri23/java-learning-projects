import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        
        String texto = "Hola que tal";
        
        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        for(Method m: strClass.getMethods()){
            System.out.println("m.getName() = " + m.getName());
        }

        Integer num = 34;
        Class integerClass = num.getClass();
        System.out.println("integerClass = " + integerClass);
    }
}
