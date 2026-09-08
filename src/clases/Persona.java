package clases;

public abstract class Persona {
    private String nombre;
    private String dni;
    private int legajo;
    private double salario;

    public Persona(String nombre, String dni, int legajo, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
