import clases.Animal;
import clases.Ave;
import clases.Mamifero;
import clases.Reptil;
import  enums.*;


import java.util.Locale;
import java.util.Scanner;

public class Menu {



    static void MenuCuidadores(boolean key, int opcion, Animal[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+==========================+");
        System.out.println("|                          |");
        System.out.println("|   GESTION DE CUIDADORES   |");
        System.out.println("|                          |");
        System.out.println("+==========================+");

        System.out.println("1. Alimentar animales. ");
        System.out.println("2. Curar animales. ");
        System.out.println("0. Atras.");

        System.out.println("Ingresar una opcion: ");

        while (!scanner.hasNextInt()) { //Evaluamos entrada segura de numero entero.
            scanner.nextLine(); //limpiamos buffer
            System.out.println("Error: debe ingresar un numero.");
        }
        opcion = scanner.nextInt();
        scanner.nextLine(); //limpiamos buffer

        switch (opcion) {
            case 1:
                //no definido

                break;
            case 2://no definido

                break;
            case 0: ;
                break;
            default:
                System.out.println("Debe ingresar una de las opciones.");
        }
        scanner.close();
    }


//MENU DE ANIMALES**********************************************************************
    static void MenuAnimales (boolean key, int opcion, Animal[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+==========================+");
        System.out.println("|                         |");
        System.out.println("|   GESTION DE ANIMALES   |");
        System.out.println("|                         |");
        System.out.println("+=========================+");

        System.out.println("1. Cargar mamifero. ");
        System.out.println("2. Cargar reptil. ");
        System.out.println("3. Cargar ave. ");
        System.out.println("4. Mostrar todos.");
        System.out.println("5. Buscar por ID. ");
        System.out.println("6. Listar por tipo. ");
        System.out.println("0. Atras.");

        System.out.println("Ingresar una opcion: ");

        while (!scanner.hasNextInt()) { //Evaluamos entrada segura de numero entero.
            scanner.nextLine(); //limpiamos buffer
            System.out.println("Error: debe ingresar un numero.");
        }
        opcion = scanner.nextInt();
        scanner.nextLine(); //limpiamos buffer

        switch (opcion) {
            case 1:
                while(key) {
                    CargarMamifero();

                    key = continuar(key);
                }

                key = true;
                break;
            case 2:
                while(key) {
                    CargarReptil();

                    key = continuar(key);
                }

                key = true;
                break;
            case 3:
                while(key) {
                    CargarAve();
                    key = continuar(key);
                }
                
                key = true;
                break;
            case 4:



                break;
            case 5:
                while(key) {
                    System.out.println("Ingresar id:");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Error: debe ingresar un nuemero.");
                        scanner.nextLine();
                    }
                    int idBuscado = scanner.nextInt();

                    for (Animal v : a) {
                        if (v != null && v.getId() == idBuscado) {
                            System.out.println(v.toString());
                        }
                    }

                    key = continuar(key);
                }
                key = true;
                break;
            case 0:

                break;
            default:
                System.out.println("Debe ingresar una de las opciones.");
        }
        scanner.close();
    }

    public static Animal CargarMamifero() {
        Animal aux = obtenerAtributosPadre();


        Animal mamifero = new  Mamifero(
                aux.getNombre()
                ,aux.getEspecie()
                ,aux.getHambre()
                ,aux.getSalud()
                ,aux.getHigiene()
                ,TipoPelaje.cargarPelaje()
        );
        return mamifero;
    }
    public static Animal CargarReptil() {
        Scanner scanner = new Scanner(System.in);
        Animal aux = obtenerAtributosPadre();

        Animal reptil = new Reptil(
                aux.getNombre()
                ,aux.getEspecie()
                ,aux.getHambre()
                ,aux.getSalud()
                ,aux.getHigiene()
                ,Reptil.cargarEsVenenoso()
                ,Reptil.CargarTienePatas()
        );
        return reptil;
    }

    public static Animal CargarAve() {
        Scanner scanner = new Scanner(System.in);
        Animal aux = obtenerAtributosPadre();

        String estadoPelaje = scanner.nextLine();
        Animal ave = new Ave(
                aux.getNombre()
                ,aux.getEspecie()
                ,aux.getHambre()
                ,aux.getSalud()
                ,aux.getHigiene()
                ,estadoPelaje
                ,CapacidadVuelo.cargarCapacidadDeVuelo()
        );
        return ave;
    }

    public static boolean continuar(boolean key){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Continuar? s/n: ");
        String continuar = scanner.next().toLowerCase();
        while (!continuar.equals("si") && !continuar.equals("no")) {
            System.out.println("Error: ingresar una de las opciones");
            System.out.print("Continuar? s/n: ");
            continuar = scanner.next().toLowerCase();
        }
        if (continuar.equals("no")) {
            key = false;
        }
        scanner.close();
        return key;
    }

    public static Animal obtenerAtributosPadre(){
        System.out.print("Nombre: ");
        String nombre = enums.CapacidadVuelo.limpCargaAtributos() ;

        System.out.print("Especie: ");
        String especie = enums.CapacidadVuelo.limpCargaAtributos();

        return new Mamifero(nombre
                ,especie
                ,Hambre.cargarHambre()
                ,Salud.cargarSalud()
                ,Higiene.cargarHigiene()
                ,null);
    }

//TERMINA METODO CARGARANIMAL********************************************************************************
}
