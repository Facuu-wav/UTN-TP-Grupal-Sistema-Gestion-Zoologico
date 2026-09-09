package clases;

public abstract class Persona {

    /// ATRIBUTOS ************************************************************************************************** ///

    private static int    proxLegajo = 0;
    private        String nombre;
    private        int    dni;
    private        int    legajo;
    private        double salario;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Persona(String nombre, int dni, double salario) {
        this.nombre  = nombre;
        this.dni     = dni;
        this.legajo  = proxLegajo++;
        this.salario = salario;
    }

    /// MÉTODOS **************************************************************************************************** ///

    /*
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(getClass() != obj.getClass()) {
            return false;
        }

        if(obj instanceof Persona) {
            Persona otra = (Persona) obj;
            if(this.dni == otra.dni){
                return true;
            }
        }
        return false;
    }
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }

        Persona otra = (Persona)obj;

        return dni == otra.dni;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(dni);
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

    public static int cantidadPersonas() {
        return proxLegajo;
    }

    public String quejarseDelSueldo() {
        return (this.nombre + " dice que con $" + this.salario + " no le alcanza para nada");
    }

    public boolean tieneGanasDeTrabajar() {
        return false;
    }

    public String tomarCafe() {
        return "\nEl empleado " + this.nombre + " está tomando un café...";
    }

    public abstract double aumentarSalario(double porcentaje);

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