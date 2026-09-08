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

    public void comer() {

    }

    public void enfermarse() {

    }

    public void ensuciarse() {

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

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public Hambre getHambre() {
        return Hambre;
    }

    public void setHambre(Hambre hambre) {
        Hambre = hambre;
    }

    public Salud getSalud() {
        return Salud;
    }

    public void setSalud(Salud salud) {
        Salud = salud;
    }

    public Higiene getHigiene() {
        return Higiene;
    }

    public void setHigiene(Higiene higiene) {
        Higiene = higiene;
    }
}
