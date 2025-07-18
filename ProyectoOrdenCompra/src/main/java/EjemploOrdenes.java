import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Compra artículos de oficina");
        orden1.setCliente(new Cliente("Luis", "Ramírez"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("HP", "Impresora LaserJet Pro", 105000));
        orden1.addProducto(new Producto("Logitech", "Mouse inalámbrico", 25000));
        orden1.addProducto(new Producto("Acer", "Monitor 24 pulgadas", 97000));
        orden1.addProducto(new Producto("Kingston", "Memoria USB 64GB", 8900));

        OrdenCompra orden2 = new OrdenCompra("Compra productos para cocina");
        orden2.setCliente(new Cliente("Maria", "Fernández"));
        orden2.setFecha(new Date());

        orden2.addProducto(new Producto("Oster", "Licuadora", 45990));
        orden2.addProducto(new Producto("T-fal", "Batería de cocina 10 piezas", 84990));
        orden2.addProducto(new Producto("Imusa", "Sartén Antiadherente", 17990));
        orden2.addProducto(new Producto("Philips", "Freidora de aire", 129990));

        OrdenCompra orden3 = new OrdenCompra("Compra herramientas de carpintería");
        orden3.setCliente(new Cliente("Carlos", "Mendoza"));
        orden3.setFecha(new Date());

        orden3.addProducto(new Producto("Bosch", "Taladro inalámbrico", 89990));
        orden3.addProducto(new Producto("Stanley", "Caja de herramientas", 56990));
        orden3.addProducto(new Producto("Dewalt", "Sierra circular", 129000));
        orden3.addProducto(new Producto("Truper", "Martillo carpintero", 18900));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: " + orden.getId());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombreProducto() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }
}
