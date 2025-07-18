package org.rpalacios.company;

public class Empleado extends Persona{
    private double remuneracion;
    private int empleadoId;

    public static int ultimoId;


    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleadoId= ++ultimoId;
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        return super.toString()+"\nremuneracion=" + remuneracion +
                ", empleadoId=" + empleadoId+
                ", remuneracion="+remuneracion;
    }
}
