package clases;

import enums.Hambre;
import enums.Higiene;
import enums.Salud;

import java.util.Scanner;
public class Reptil extends Animal {

    /// ATRIBUTOS ************************************************************************************************** ///

    private boolean esVenenoso;
    private boolean tienePatas;

    /// CONSTRUCTOR/ES ********************************************************************************************* ///

    public Reptil(String nombre, String especie, Hambre hambre, Salud salud, Higiene higiene, boolean esVenenoso, boolean tienePatas) {
        super(nombre, especie, hambre, salud, higiene);
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

    /// MÉTODOS **************************************************************************************************** ///

    @Override
    public void comer (){
        super.comer();
        System.out.println(
                getNombre() + " come comida para reptiles..."
        );
    }

    @Override
    public void enfermarse() {
        super.enfermarse();
        System.out.println("El reptil " + getNombre() + " enfermó...");
    }

    @Override
    public boolean ensuciarse() {
        boolean seEnsucio = super.ensuciarse();

        if (seEnsucio) {
            System.out.println("El reptil " + getNombre() + " se ensució...");
        }

        return seEnsucio;
    }

    public String desplazarse() {
        if(this.tienePatas) {
            return "El reptil se desplaza caminando";
        }
        else {
            return "El reptil se desplaza arrastrandose";
        }
    }

    public boolean esPeligroso() {
        return this.esVenenoso;
    }

    public boolean esSerpiente() {
        return !this.tienePatas;
    }

    public String mudarDePiel() {
        return "El reptil esta mudando de piel.";
    }

    public boolean esMasPeligroso(Reptil otro) {
       return this.esVenenoso && !otro.esVenenoso();
    }

    public void retirarVeneno() {
        this.esVenenoso = false;
    }

    @Override
    public String defecar() {
        return getNombre() + " defeca como un reptil.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nReptil{" +
                "esVenenoso=" + esVenenoso +
                ", tienePatas=" + tienePatas +
                '}';
    }

    public static boolean cargarEsVenenoso(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Es venenoso si/no: ");
        String op = scanner.next().toLowerCase();
        while(!op.equals("si") && !op.equals("no")){
            System.out.println("Ingresar uno de los valores si/no");
            System.out.print("Es venenoso: ");
        }
        boolean esVenenoso = true;

        if(op.equals("no")){
            esVenenoso = false;
        }
        return esVenenoso;
    }

    public static boolean CargarTienePatas(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Es venenoso si/no: ");

        String op = scanner.next().toLowerCase();
        while(!op.equals("si") && !op.equals("no")){
            System.out.println("Ingresar uno de los valores si/no");
            System.out.print("Es venenoso: ");
            op = scanner.nextLine().toLowerCase();
        }

        if(op.equals("no")){
            return false;
        }
        return true;
    }
    /// GETTERS Y SETTERS ****************************************************************************************** ///

    public boolean esVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean tienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }
}
