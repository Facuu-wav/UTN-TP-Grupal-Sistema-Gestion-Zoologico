package clases;
import enums.*;

public class Cuidador extends Persona {

    /// ATRIBUTOS ************************************************************************************************** ///

    private Especialidad Especialidad;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Cuidador(String nombre, int dni, int legajo, double salario, Especialidad especialidad) {
        super(nombre, dni, legajo, salario);
        Especialidad = especialidad;
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
