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

    public String desplazasarce() {
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
        if(!this.tienePatas) {
            return true;
        }
        else {
            return false;
        }
    }

    public String mudarDePiel() {
        return "El reptil esta mudando de piel.";
    }

    public boolean esMasPeligroso(Reptil otro) {
        if(this.esVenenoso && !otro.isEsVenenoso()){
            return true;
        }
        else {
            return false;
        }
    }

    public void retirarVeneno() {
        this.esVenenoso = !isEsVenenoso();
    }

    @Override
    public String defecar() {
        return getNombre() + " defeca como un reptil.";
    }

    @Override
    public String toString() {
        return super.toString() + "Reptil{" +
                "esVenenoso=" + esVenenoso +
                ", tienePatas=" + tienePatas +
                '}';
    }

    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean isTienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }

}
