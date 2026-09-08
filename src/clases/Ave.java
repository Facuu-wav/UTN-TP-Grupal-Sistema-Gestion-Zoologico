package clases;

import enums.Hambre;
import enums.Higiene;
import enums.Salud;

import enums.CapacidadVuelo;

public class Ave extends Animal{

    private String estadoPlumaje;
    private CapacidadVuelo capVuelo;

    public Ave(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, String estadoPlumaje, CapacidadVuelo capVuelo) {
        super(nombre, especie, hambre, salud, higiene);
        this.estadoPlumaje = estadoPlumaje;
        this.capVuelo = capVuelo;
    }

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


    @Override
    public void comer (){
        System.out.println("El Ave Come...");
    }

    @Override
    public void enfermarse() {
        System.out.println("El Ave Enfermo...");
    }

    @Override
    public void ensuciarse (){
        System.out.println("El Ave Ensucio...");
    }

}
