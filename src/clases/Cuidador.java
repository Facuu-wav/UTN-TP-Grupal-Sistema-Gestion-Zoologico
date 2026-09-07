package clases;
import enums.*;

public class Cuidador extends Persona {

    /// ATRIBUTOS ************************************************************************************************** ///

    private Especialidad Especialidad;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Cuidador(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, String nombre1, int DNI, double salario, Especialidad especialidad) {
        super(nombre, especie, hambre, salud, higiene, nombre1, DNI, salario);
        this.Especialidad = especialidad;
    }

    /// MÉTODOS **************************************************************************************************** ///

    public void alimentar() {
    }

    public void vacunar() {

    }

    public void limpiar() {

    }

    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public Especialidad getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        Especialidad = especialidad;
    }
}
