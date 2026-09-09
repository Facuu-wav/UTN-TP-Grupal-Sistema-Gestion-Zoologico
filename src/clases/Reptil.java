package clases;

import enums.Hambre;
import enums.Higiene;
import enums.Salud;

public class Reptil extends Animal {

    /// ATRIBUTOS ************************************************************************************************** ///

    private boolean esVenenoso;
    private boolean tienePatas;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Reptil(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, boolean esVenenoso, boolean tienePatas) {
        super(nombre, especie, hambre, salud, higiene);
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

    /// MÉTODOS **************************************************************************************************** ///

    @Override
    public void comer (){
        super.comer();
        System.out.println(
                getNombre() + " come comida para reptiles..."
        );
    }

    @Override
    public void enfermarse() {
        super.enfermarse();
        System.out.println("El reptil " + getNombre() + " enfermó...");
    }

    @Override
    public boolean ensuciarse() {
        boolean seEnsucio = super.ensuciarse();

        if (seEnsucio) {
            System.out.println("El reptil " + getNombre() + " se ensució...");
        }

        return seEnsucio;
    }

    public String desplazarse() {
        if(this.tienePatas) {
            return "El reptil se desplaza caminando";
        }
        else {
            return "El reptil se desplaza arrastrandose";
        }
    }

    public boolean esPeligroso() {
        return this.esVenenoso;
    }

    public boolean esSerpiente() {
        return !this.tienePatas;
    }

    public String mudarDePiel() {
        return "El reptil esta mudando de piel.";
    }

    public boolean esMasPeligroso(Reptil otro) {
       return this.esVenenoso && !otro.esVenenoso();
    }

    public void retirarVeneno() {
        this.esVenenoso = false;
    }

    @Override
    public String defecar() {
        return getNombre() + " defeca como un reptil.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nReptil{" +
                "esVenenoso=" + esVenenoso +
                ", tienePatas=" + tienePatas +
                '}';
    }

    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public boolean esVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean tienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }
}
