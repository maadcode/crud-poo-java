
package model;

public class Vendedor extends Empleado {
    private double totalMondoVendido;
    private String sede;
    private double comision;

    public Vendedor() {
    }

    public Vendedor(String DNI, String nombre, String apellido, double sueldoBase) {
        super(DNI, nombre, apellido, sueldoBase);
    }

    public Vendedor(double totalMondoVendido, String sede, double comision, String DNI, String nombre, String apellido, double sueldoBase) {
        super(DNI, nombre, apellido, sueldoBase);
        this.totalMondoVendido = totalMondoVendido;
        this.sede = sede;
        this.comision = comision;
    }

    public double getTotalMondoVendido() {
        return totalMondoVendido;
    }

    public void setTotalMondoVendido(double totalMondoVendido) {
        this.totalMondoVendido = totalMondoVendido;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    public double calcularBonifacion() {
        return getTotalMondoVendido()*getComision();
    }    

}
