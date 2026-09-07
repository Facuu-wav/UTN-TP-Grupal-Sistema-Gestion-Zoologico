package clases;
import enums.*;

public abstract class Animal {

    /// ATRIBUTOS ************************************************************************************************** ///

    private String  Nombre;
    private String  Especie;
    private Hambre  Hambre;
    private Salud   Salud;
    private Higiene Higiene;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Animal(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene) {
        this.Nombre  = nombre;
        this.Especie = especie;
        this.Hambre  = hambre;
        this.Salud   = salud;
        this.Higiene = higiene;
    }

    /// MÉTODOS **************************************************************************************************** ///

    public void comer (){

    }

    public void enfermarse (){

    }

    public void ensuciarse(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "Nombre='" + Nombre + '\'' +
                ", Especie='" + Especie + '\'' +
                ", Hambre=" + Hambre +
                ", Salud=" + Salud +
                ", Higiene=" + Higiene +
                '}';
    }

    /// GETTERS Y SETTERS ****************************************************************************************** ///
    
}
