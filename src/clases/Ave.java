package clases;

import enums.Hambre;
import enums.Higiene;
import enums.Salud;
import enums.CapacidadVuelo;

public class Ave extends Animal{

    /// ATRIBUTOS ************************************************************************************************** ///

    private String estadoPlumaje;
    private CapacidadVuelo capVuelo;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Ave(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, String estadoPlumaje, CapacidadVuelo capVuelo) {
        super(nombre, especie, hambre, salud, higiene);
        this.estadoPlumaje = estadoPlumaje;
        this.capVuelo = capVuelo;
    }

    /// MÉTODOS **************************************************************************************************** ///

    @Override
    public void comer(){
        System.out.println("El Ave Come...");
    }

    @Override
    public void enfermarse() {
        System.out.println("El Ave Enfermo...");
    }

    @Override
    public boolean ensuciarse(){
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Ave{" +
                "estadoPlumaje='" + estadoPlumaje + '\'' +
                ", capVuelo=" + capVuelo +
                '}';
    }

    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public String getEstadoPlumaje() {
        return estadoPlumaje;
    }

    public void setEstadoPlumaje(String estadoPlumaje) {
        this.estadoPlumaje = estadoPlumaje;
    }

    public CapacidadVuelo getCapVuelo() {
        return capVuelo;
    }

    public void setCapVuelo(CapacidadVuelo capVuelo) {
        this.capVuelo = capVuelo;
    }
}
