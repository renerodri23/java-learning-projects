import java.util.Date;

public class OrdenCompra {
    //public Automovil() {this.id = ++ultimoId;}
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    public static int ultimoId;
    private int indiceProducto;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.id = ++ultimoId;
        this.productos = new Producto[4];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void addProducto(Producto producto){
        if (indiceProducto< this.productos.length){
            this.productos[indiceProducto++]=producto;
        }
    }

    public int getGranTotal(){
        int total = 0;
        for (Producto p: productos){
            total += p.getPrecio();
        }
        return total;
    }
}
