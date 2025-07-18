package og.rpalacios.carrosupermercado.modelo;

abstract public class Producto {
    protected String nombre;
    protected double precio;

    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public String mostrarDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre)
                .append("\t Precio: ").append(precio);
        return sb.toString();
    }
}
