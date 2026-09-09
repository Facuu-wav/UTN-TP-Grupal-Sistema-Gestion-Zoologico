package clases;
import enums.*;

public class Cuidador extends Persona {

    /// ATRIBUTOS ************************************************************************************************** ///

    private Especialidad especialidad;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Cuidador(String nombre, int dni, double salario, Especialidad especialidad) {
        super(nombre, dni, salario);
        especialidad = especialidad;
    }

    /// MÉTODOS **************************************************************************************************** ///

    public void alimentar(Animal animal) {
        if (puedeTratar(animal)) {
            animal.comer();
        } else {
            System.out.println(
                    "El cuidador "+ getNombre() + " no puede alimentar este tipo de animal."
            );
        }
    }

    public void vacunar(Animal animal) {

    }

    public void limpiarRecinto() {

    }

    public void curar(Animal animal) {

    }

    @Override
    public double aumentarSalario(double porcentaje) {
        double aumento = getSalario() * porcentaje / 100;
        setSalario(getSalario() + aumento);

        return getSalario();
    }

    private boolean puedeTratar(Animal animal) {

        return switch (especialidad) {
            case MAMIFEROS -> animal instanceof Mamifero;
            case REPTILES -> animal instanceof Reptil;
            case AVES -> animal instanceof Ave;
        };
    }

    @Override
    public String toString() {
        return super.toString() + "Cuidador{" +
                "Especialidad=" + especialidad +
                '}';
    }

    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        especialidad = especialidad;
    }
}
