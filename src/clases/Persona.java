package clases;

import enums.Hambre;
import enums.Higiene;
import enums.Salud;

public class Persona extends Animal{
        private static int ContLegajo = 0;

    private String Nombre;
    private int DNI;
    private int Legajo;
    private double Salario;

    //constructor
    public Persona(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, String nombre1, int DNI, double salario) {
        super(nombre, especie, hambre, salud, higiene);
        this.Nombre = nombre1;
        this.DNI = DNI;
        this.Legajo = ContLegajo + 1;
        this.Salario = salario;
    }

    //getters
    public String getNombre() {
        return Nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public int getLegajo() {
        return Legajo;
    }

    public double getSalario() {
        return Salario;
    }

    //setters

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setSalario(double salario) {
        this.Salario = salario;
    }

    //metodos

}
