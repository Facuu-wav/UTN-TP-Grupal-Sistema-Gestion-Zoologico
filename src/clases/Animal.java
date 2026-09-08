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
       for(int i = 0 ; i < 4 ; ++i) {
           if (Hambre.getGrado() > i) {
                this.Hambre = enums.Hambre;
           }
       }
        return;
    }

    public void enfermarse() {
        this.Salud = enums.Salud.ENFERMO;
    }

    public void lastimarse(){
        this.Salud = enums.Salud.LASTIMADO;
    }

    //Si Animal tiene el Hambre en MUYALTO entonces su Salud cambia a DESNUTRIDO.
    public boolean Desnutrirse (){
        if(Hambre.getGrado() > 2) { //Hambre grado 2 = ALTO
            this.Salud = enums.Salud.DESNUTRIDO;
            return true;
        }
        return false;
    }

    //Si Animal tiene la Salud en LASTIMADO o en ENFERMO entonces Higiene pasa a SUCIO.
    public boolean ensuciarse() {
        if(Salud == enums.Salud.LASTIMADO || Salud == enums.Salud.ENFERMO){
            this.Higiene = enums.Higiene.SUCIO;
            return true;
        }
        return false;
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

    public void defecar(){

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
