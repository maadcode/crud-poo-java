
package model;

public class Administrador extends Empleado {
    private int tiempo;

    public Administrador() {
    }

    public Administrador(String DNI, String nombre, String apellido, double sueldoBase) {
        super(DNI, nombre, apellido, sueldoBase);
    }

    public Administrador(int tiempo, String DNI, String nombre, String apellido, double sueldoBase) {
        super(DNI, nombre, apellido, sueldoBase);
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public double calcularAumento() {
        double aumento;
        if(getTiempo() < 1) {
            aumento = 0;
        }
        else if(getTiempo() >= 1 && getTiempo() <= 3) {
            aumento = 0.1 * this.getSueldoBase();
        } else {
            aumento = 0.2 * this.getSueldoBase();
        }
        return aumento;
    }
    
}
