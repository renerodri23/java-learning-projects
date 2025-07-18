package og.rpalacios.carrosupermercado.modelo;

public class NoPerecible extends Producto {
    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio) {
        super(nombre, precio);
    }

    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String mostrarDetalle() {
        StringBuilder sb = new StringBuilder(super.mostrarDetalle());
        sb.append("\t Contenido: ").append(contenido)
                .append("\t Calorias: ").append(calorias);
        return sb.toString();
    }
}
