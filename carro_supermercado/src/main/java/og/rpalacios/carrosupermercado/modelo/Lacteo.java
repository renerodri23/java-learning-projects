package og.rpalacios.carrosupermercado.modelo;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, Double precio) {
        super(nombre, precio);

    }

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String mostrarDetalle() {
        StringBuilder sb = new StringBuilder(super.mostrarDetalle());
        sb.append("\t Cantidad: ").append(cantidad)
                .append("\t Proteinas: ").append(proteinas);
        return sb.toString();
    }
}
