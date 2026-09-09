package clases;
import enums.*;

public class Cuidador extends Persona {

    /// ATRIBUTOS ************************************************************************************************** ///

    private Especialidad especialidad;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Cuidador(String nombre, int dni, double salario, Especialidad especialidad) {
        super(nombre, dni, salario);
        this.especialidad = especialidad;
    }

    /// MÉTODOS **************************************************************************************************** ///

    public void alimentar(Animal animal) {
        if (puedeTratar(animal)) {
            System.out.println(
                    "El cuidador " + getNombre() + " está alimentando al animal " + animal.getNombre() + "."
            );
            animal.comer();

        } else {
            System.out.println(
                    "El cuidador " + getNombre() + " no puede alimentar al animal " + animal.getNombre() + " porque no es su especialidad."
            );
        }
    }

    public void vacunar(Animal animal) {
        if (puedeTratar(animal)) {
            System.out.println(
                    "El cuidador " + getNombre() + " está vacunando al animal " + animal.getNombre() + "."
            );
            animal.setSalud(Salud.SALUDABLE);
        } else {
            System.out.println(
                    "El cuidador " + getNombre() + " no puede vacunar al animal " + animal.getNombre() + " porque no es su especialidad."
            );
        }
    }

    public void curar(Animal animal) {
        if (puedeTratar(animal)) {
            System.out.println(
                    "El cuidador " + getNombre() + " está curando a " + animal.getNombre() + "."
            );
            animal.setSalud(Salud.SALUDABLE);
        } else {
            System.out.println(
                    "El cuidador " + getNombre() + " no puede curar a " + animal.getNombre() + " porque no es su especialidad."
            );
        }
    }

    public void limpiarAnimal(Animal animal) {
        if (puedeTratar(animal)) {
            System.out.println("El cuidador " + getNombre() + " está limpiando al animal " + animal.getNombre() + ".");
            animal.setHigiene(Higiene.LIMPIO);
        } else {
            System.out.println("El cuidador " + getNombre() + " no puede limpiar al animal " + animal.getNombre() + " porque no es su especialidad.");
        }
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
        this.especialidad = especialidad;
    }
}
