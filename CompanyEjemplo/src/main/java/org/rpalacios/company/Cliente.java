package org.rpalacios.company;

public class Cliente extends Persona{

    private int clienteId;

    public static int ultimoId;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId= ++ultimoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    @Override
    public String toString() {
        return super.toString()+"\nclienteId=" + clienteId;
    }
}
