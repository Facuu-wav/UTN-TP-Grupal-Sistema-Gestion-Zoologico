package clases;

import enums.*;

public class Cuidador extends Persona {
    private Especialidad Especialidad;

    //cpnstructor
    public Cuidador(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, String nombre1, int DNI, double salario, Especialidad especialidad) {
        super(nombre, especie, hambre, salud, higiene, nombre1, DNI, salario);
        this.Especialidad = especialidad;
    }

    //getters
    public Especialidad getEspecialidad() {
        return Especialidad;
    }

    //setters
    public void setEspecialidad(Especialidad especialidad) {
        Especialidad = especialidad;
    }


    //metodos

    public void ALimentar (){
    }

    public void Vacunar (){

    }

    public void Limpiar (){

    }

}
