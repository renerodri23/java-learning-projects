import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuDeOpciones {
    public static void main(String[] args) {
        int opcionIndice = 0;

        do{
            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Update", 1);
            opciones.put("Delete", 2);
            opciones.put("Add",3);
            opciones.put("List",4);
            opciones.put("Exit",5);

            Object[] opArreglo = opciones.keySet().toArray(new String[0]);
            Object opcion = JOptionPane.showInputDialog(null, "Seleccione una Operacion", "Mantenedor de Productos", JOptionPane.INFORMATION_MESSAGE,null,opArreglo,opArreglo[0]);

            if (opcion == null){
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operacion valida");

            }else {
                opcionIndice = opciones.get(opcion.toString());

                String mensaje = null;

                switch (opcionIndice){
                    case 1 -> {
                        mensaje = "Producto actualizado correctamente";
                        JOptionPane.showMessageDialog(null , mensaje);
                        System.out.println(mensaje);

                    }
                    case 2 -> {
                        mensaje = "Producto eliminado correctamente";
                        JOptionPane.showMessageDialog(null , mensaje);
                        System.out.println(mensaje);

                    }
                    case 3 -> {
                        mensaje = "Producto agregado correctamente";
                        JOptionPane.showMessageDialog(null , mensaje);
                        System.out.println(mensaje);

                    }
                    case 4 -> {
                        mensaje = "Listando a los productos";
                        JOptionPane.showMessageDialog(null , mensaje);
                        System.out.println(mensaje);
                    }
                }
            }
        } while (opcionIndice!=5);
        JOptionPane.showMessageDialog(null, "Haz salido con exito!");
    }
}
