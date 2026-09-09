package clases;

import enums.Hambre;
import enums.Higiene;
import enums.Salud;
import enums.TipoPelaje;

public class Mamifero extends Animal{

    /// ATRIBUTOS ************************************************************************************************** ///

    private TipoPelaje pelaje;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Mamifero(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, TipoPelaje pelaje) {
        super(nombre, especie, hambre, salud, higiene);
        this.pelaje = pelaje;
    }

    /// MÉTODOS **************************************************************************************************** ///

    @Override
    public void comer (){
        System.out.println("El Mamifero Come...");
    }

    @Override
    public void enfermarse() {
        System.out.println("El Mamifero Enfermo...");
    }

    @Override
    public boolean ensuciarse() {
        //System.out.println("El Mamifero Ensucio...");
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "Mamifero{" +
                "pelaje=" + pelaje +
                '}';
    }

    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public TipoPelaje getPelaje() {
        return pelaje;
    }

    public void setPelaje(TipoPelaje pelaje) {
        this.pelaje = pelaje;
    }
}
