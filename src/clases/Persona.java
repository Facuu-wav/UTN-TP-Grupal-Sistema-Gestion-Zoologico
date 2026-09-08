package clases;

public abstract class Persona {

    /// ATRIBUTOS ************************************************************************************************** ///

    private static int    cantLegajo = 0;
    private        String nombre;
    private        int    dni;
    private        int    legajo;
    private        double salario;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Persona(String nombre, int dni, int legajo, double salario) {
        this.nombre  = nombre;
        this.dni     = dni;
        this.legajo  = cantLegajo++;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", legajo=" + legajo +
                ", salario=" + salario +
                '}';
    }

    /// MÉTODOS **************************************************************************************************** ///


    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
