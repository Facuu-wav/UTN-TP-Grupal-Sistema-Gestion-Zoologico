package clases;

public class Reptil {

    /// ATRIBUTOS ************************************************************************************************** ///

    private boolean esVenenoso;
    private boolean tienePatas;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Reptil(boolean esVenenoso, boolean tienePatas) {
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

    /// MÉTODOS **************************************************************************************************** ///

    @Override
    public String toString() {
        return super.toString() + "Reptil{" +
                "esVenenoso=" + esVenenoso +
                ", tienePatas=" + tienePatas +
                '}';
    }

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
