package clases;
import enums.*;

public abstract class Animal {

    /// ATRIBUTOS ************************************************************************************************** ///

    private static int siguienteid = 0;
    private int id;
    private String  nombre;
    private String  especie;
    private Hambre  hambre;
    private Salud   salud;
    private Higiene higiene;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Animal(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene) {
        this.id = siguienteid++;
        this.nombre  = nombre;
        this.especie = especie;
        this.hambre  = hambre;
        this.salud   = salud;
        this.higiene = higiene;
    }

    /// MÉTODOS **************************************************************************************************** ///

    public void comer() {
        this.hambre = this.hambre.menosHambre();
    }

    public void enfermarse() {
        this.salud = Salud.ENFERMO;
    }

    //Si Animal tiene la Salud en LASTIMADO o en ENFERMO entonces Higiene pasa a SUCIO.
    public boolean ensuciarse() {
        if(salud == Salud.LASTIMADO || salud == Salud.ENFERMO){
            this.higiene = Higiene.SUCIO;
            return true;
        }
        return false;
    }

    public void lastimarse() {
        this.salud = Salud.LASTIMADO;
    }

    // revisar
    //Si Animal tiene el Hambre en MUY_ALTO entonces su Salud cambia a DESNUTRIDO.
    public boolean desnutrirse (){
        if(this.hambre.getGrado() > 2) { //Hambre grado 2 = ALTO
            this.salud = Salud.DESNUTRIDO;
            return true;
        }
        return false;
    }

    public abstract String defecar();

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
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Hambre getHambre() {
        return hambre;
    }

    public void setHambre(Hambre hambre) {
        this.hambre = hambre;
    }

    public Salud getSalud() {
        return salud;
    }

    public void setSalud(Salud salud) {
        this.salud = salud;
    }

    public Higiene getHigiene() {
        return higiene;
    }

    public void setHigiene(Higiene higiene) {
        this.higiene = higiene;
    }

    public int getId() {
        return id;
    }
}
