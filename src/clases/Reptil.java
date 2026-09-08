package clases;

public class Reptil {
    private boolean esVenenoso;
    private boolean tienePatas;

    public Reptil(boolean esVenenoso, boolean tienePatas) {
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

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

    @Override
    public String toString() {
        return "\nReptil: " + "\nEs Venenoso: " + isEsVenenoso() + "\nTiene Patas: " + isTienePatas();
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


}
