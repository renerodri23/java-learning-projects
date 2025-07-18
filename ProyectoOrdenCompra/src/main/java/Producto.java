public class Producto {
    private String fabricante;
    private String nombreProducto;
    private int precio;

    public Producto(String fabricante, String nombreProducto, int precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }


    public int getPrecio() {
        return precio;
    }

    public String getFabricante() {
        return fabricante;
    }
}
