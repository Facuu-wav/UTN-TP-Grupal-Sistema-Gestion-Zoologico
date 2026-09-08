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

        return ;
    }

    public void vacunar() {

    }

    public void limpiarRecinto() {

    }

    public void curar(){

    }



    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public Especialidad getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        Especialidad = especialidad;
    }

    @Override
    public double aumentarSalario(double porcentaje) {
        setSalario((getSalario() * porcentaje) / 100);
        return getSalario();
    }
}
