
package model;

public class Empleado {
    private String DNI;
    private String nombre;
    private String apellido;
    private double sueldoBase;

    public Empleado() {
    }

    public Empleado(String DNI, String nombre, String apellido, double sueldoBase) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    public String mostrarInfo() {
        return "El empleado "+getNombre()+" "+getApellido()+" gana "+getSueldoBase();
    }
    
}
