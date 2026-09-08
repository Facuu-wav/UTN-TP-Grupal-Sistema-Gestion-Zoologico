package clases;
import enums.*;

public abstract class Animal {

    /// ATRIBUTOS ************************************************************************************************** ///

    private String  nombre;
    private String  especie;
    private Hambre  hambre;
    private Salud   salud;
    private Higiene higiene;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Animal(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene) {
        this.nombre  = nombre;
        this.especie = especie;
        this.hambre  = hambre;
        this.salud   = salud;
        this.higiene = higiene;
    }

    /// MÉTODOS **************************************************************************************************** ///

    public void comer() {
       for(int i = 0 ; i < 4 ; ++i) {
           if (Hambre.getGrado() > i) {
                this.hambre = enums.Hambre;
           }
       }
    }

    public void enfermarse() {
        this.salud = enums.Salud.ENFERMO;
    }

    public void lastimarse(){
        this.salud = enums.Salud.LASTIMADO;
    }

    //Si Animal tiene el Hambre en MUYALTO entonces su Salud cambia a DESNUTRIDO.
    public boolean Desnutrirse (){
        if(Hambre.getGrado() > 2) { //Hambre grado 2 = ALTO
            this.salud = enums.Salud.DESNUTRIDO;
            return true;
        }
        return false;
    }

    //Si Animal tiene la Salud en LASTIMADO o en ENFERMO entonces Higiene pasa a SUCIO.
    public boolean ensuciarse() {
        if(salud == enums.Salud.LASTIMADO || salud == enums.Salud.ENFERMO){
            this.higiene = enums.Higiene.SUCIO;
            return true;
        }
        return false;
    }

    public void defecar(){

    }

    @Override
    public String toString() {
        return "Animal{" +
                "Nombre='" + nombre + '\'' +
                ", Especie='" + especie + '\'' +
                ", Hambre=" + hambre +
                ", Salud=" + salud +
                ", Higiene=" + higiene +
                '}';
    }

    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        especie = especie;
    }

    public Hambre getHambre() {
        return hambre;
    }

    public void setHambre(Hambre hambre) {
        hambre = hambre;
    }

    public Salud getSalud() {
        return salud;
    }

    public void setSalud(Salud salud) {
        salud = salud;
    }

    public Higiene getHigiene() {
        return higiene;
    }

    public void setHigiene(Higiene higiene) {
        higiene = higiene;
    }
}
