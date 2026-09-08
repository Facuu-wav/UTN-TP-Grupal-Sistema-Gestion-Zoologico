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
    /// MÉTODOS **************************************************************************************************** ///

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

    @Override
    public int hashCode() {
        return super.hashCode();
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

    public int cantidadPersonas() {
        return this.cantLegajo;
    }

    public String quejarseDelSueldo() {
        return (this.nombre + "dice que con $" + this.salario + " no le alcanza para nada");
    }

    public boolean tieneGanasDeTrabajar() {
        return false;
    }

    public String tomarCafe() {
        return "\nEl empleado " + " esta tomando un cafe...";
    }

    public abstract double aumentarSalario(double porcentaje);

}
