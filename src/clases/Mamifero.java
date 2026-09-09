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
        super.comer();
        System.out.println(
               getNombre() + " come comida para animales mamíferos..."
        );
    }

    @Override
    public void enfermarse() {
        super.enfermarse();
        System.out.println("El Mamifero enfermó...");
    }

    @Override
    public boolean ensuciarse() {
        boolean seEnsucio = super.ensuciarse();

        if (seEnsucio) {
            System.out.println("El mamífero " + getNombre() + " se ensució...");
        }

        return seEnsucio;
    }

    @Override
    public String defecar() {
        return getNombre() + " defeca como un mamifero.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nMamifero{" +
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
