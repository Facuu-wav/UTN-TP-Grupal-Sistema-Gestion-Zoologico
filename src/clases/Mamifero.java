package clases;

import enums.Hambre;
import enums.Higiene;
import enums.Salud;
import enums.TipoPelaje;

public class Mamifero extends Animal{

    private TipoPelaje pelaje;


    public Mamifero(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, TipoPelaje pelaje) {
        super(nombre, especie, hambre, salud, higiene);
        this.pelaje = pelaje;
    }

    public TipoPelaje getPelaje() {
        return pelaje;
    }

    public void setPelaje(TipoPelaje pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public void comer (){
        System.out.println("El Mamifero Come...");
    }

    @Override
    public void enfermarse() {
        System.out.println("El Mamifero Enfermo...");
    }

    @Override
    public void ensuciarse (){
        System.out.println("El Mamifero Ensucio...");
    }
}
