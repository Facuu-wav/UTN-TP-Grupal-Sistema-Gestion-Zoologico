import clases.Animal;
import clases.Ave;
import clases.Mamifero;
import clases.Reptil;
import enums.*;

import java.util.Scanner;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    static void MenuCuidadores(boolean key, int opcion, Animal[] a) {

        System.out.println("+==========================+");
        System.out.println("|                          |");
        System.out.println("|   GESTION DE CUIDADORES   |");
        System.out.println("|                          |");
        System.out.println("+==========================+");

        System.out.println("1. Alimentar animales. ");
        System.out.println("2. Curar animales. ");
        System.out.println("0. Atrás.");

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
    }


//MENU DE ANIMALES**********************************************************************

    static void MenuAnimales (boolean key, int opcion, Animal[] a) {

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
        System.out.println("0. Atrás.");

        System.out.println("Ingresar una opción: ");

        while (!scanner.hasNextInt()) { //Evaluamos entrada segura de numero entero.
            scanner.nextLine(); //limpiamos buffer
            System.out.println("Error: debe ingresar un numero.");
        }
        opcion = scanner.nextInt();
        scanner.nextLine(); //limpiamos buffer

        switch (opcion) {
            case 1:
                while(key) {
                    Animal nuevo = cargarMamifero();
                    agregarAnimal(a, nuevo);
                    key = continuar(key);
                }
                key = true;
                break;

            case 2:
                while(key) {
                    Animal nuevo = cargarReptil();
                    agregarAnimal(a, nuevo);
                    key = continuar(key);
                }
                key = true;
                break;

            case 3:
                while(key) {
                    Animal nuevo = cargarAve();
                    agregarAnimal(a, nuevo);
                    key = continuar(key);
                }
                key = true;
                break;

            case 4: // mostrar todos
                for (Animal v : a) {
                    if (v != null) {
                        System.out.println(v);
                    }
                }
                break;

            case 5:
                while(key) {
                    System.out.println("Ingresa una ID:");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Error: Debe ingresar un numero.");
                        scanner.nextLine();
                    }

                    int idBuscado = scanner.nextInt();
                    scanner.nextLine();

                    for (Animal v : a) {
                        if (v != null && v.getId() == idBuscado) {
                            System.out.println(v);
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
    }

    public static Animal cargarMamifero() {
        System.out.println("CARGAR MAMÍFERO");

        System.out.print("Nombre: ");
        String nombre = limpCargaAtributos();

        System.out.print("Especie: ");
        String especie = limpCargaAtributos();

        Hambre hambre = cargarHambre();
        Salud salud = cargarSalud();
        Higiene higiene = cargarHigiene();
        TipoPelaje pelaje = cargarTipoPelaje();

        return new Mamifero(nombre, especie, hambre, salud, higiene, pelaje);
    }

    public static Animal cargarReptil() {
        System.out.println("CARGAR REPTIL");

        System.out.print("Nombre: ");
        String nombre = limpCargaAtributos();

        System.out.print("Especie: ");
        String especie = limpCargaAtributos();

        Hambre hambre = cargarHambre();
        Salud salud = cargarSalud();
        Higiene higiene = cargarHigiene();

        boolean esVenenoso = cargarBoolean("Es venenoso?");
        boolean tienePatas = cargarBoolean("Tiene patas?");

        return new Reptil(nombre, especie, hambre, salud, higiene, esVenenoso, tienePatas);
    }

    public static Animal cargarAve() {
        System.out.println("CARGAR AVE");

        System.out.print("Nombre: ");
        String nombre = limpCargaAtributos();

        System.out.print("Especie: ");
        String especie = limpCargaAtributos();

        Hambre hambre = cargarHambre();
        Salud salud = cargarSalud();
        Higiene higiene = cargarHigiene();
        CapacidadVuelo capacidadVuelo = cargarCapacidadVuelo();

        System.out.print("Estado del plumaje: ");
        String estadoPlumaje = limpCargaAtributos();

        return new Ave(nombre, especie, hambre, salud, higiene, estadoPlumaje, capacidadVuelo);
    }

//TERMINA METODO CARGARANIMAL********************************************************************************

    public static void agregarAnimal(Animal[] animales, Animal animal) {
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] == null) {
                animales[i] = animal;
                System.out.println("Animal cargado correctamente. ID: " + animal.getId());
                return;
            }
        }

        System.out.println("No hay espacio disponible para más animales.");
    }

    public static boolean continuar(boolean key){

        System.out.print("Continuar? sí / no: ");
        String continuar = scanner.next().toLowerCase();
        while (!continuar.equals("si") && !continuar.equals("no")) {
            System.out.println("Error: ingresar una de las opciones");
            System.out.print("Continuar? si / no: ");
            continuar = scanner.next().toLowerCase();
        }
        if (continuar.equals("no")) {
            key = false;
        }
        return key;
    }

    public static String limpCargaAtributos() {

        return scanner.nextLine()
                .trim()
                .toUpperCase()
                .replace(" ", "_");
    }

    public static int cargarEntero() {

        while (!scanner.hasNextInt()) {
            System.out.println("Error: debe ingresar un número entero.");
            scanner.nextLine();
        }

        int numero = scanner.nextInt();
        scanner.nextLine();

        return numero;
    }

    public static boolean cargarBoolean(String mensaje) {

        System.out.print(mensaje + " si/no: ");
        String respuesta = limpCargaAtributos();

        while (!respuesta.equals("SI") && !respuesta.equals("NO")) {
            System.out.println("Error: ingresar SI o NO.");
            System.out.print(mensaje + " si/no: ");
            respuesta = limpCargaAtributos();
        }

        return respuesta.equals("SI");
    }

    /// MÉTODOS DE CARGA DE ENUMS ********************************************************************************* ////

    public static Hambre cargarHambre() {

        System.out.println("Nivel de hambre:");
        System.out.println("0. BAJA");
        System.out.println("1. MEDIA");
        System.out.println("2. ALTA");
        System.out.println("3. MUY ALTA");

        System.out.print("Ingresa un nro:");
        int grado = cargarEntero();

        switch (grado) {
            case 0:
                return Hambre.BAJA;

            case 1:
                return Hambre.MEDIA;

            case 2:
                return Hambre.ALTA;

            case 3:
                return Hambre.MUY_ALTA;

            default:
                System.out.println("Error: debe ingresar un valor entre 0 y 3");
                return cargarHambre();
        }
    }

    public static Salud cargarSalud() {
        System.out.println("NIVELES DE SALUD:");
        System.out.println("0. DESNUTRIDO");
        System.out.println("1. ENFERMO");
        System.out.println("2. SALUDABLE");
        System.out.println("3. LASTIMADO");

        System.out.print("Ingresa un nro:");
        int grado = cargarEntero();

        switch (grado) {
            case 0:
                return Salud.DESNUTRIDO;

            case 1:
                return Salud.ENFERMO;

            case 2:
                return Salud.SALUDABLE;

            case 3:
                return Salud.LASTIMADO;

            default:
                System.out.println("Error: debe ingresar un valor entre 0 y 3");
                return cargarSalud();
        }
    }

    public static Higiene cargarHigiene() {
        System.out.println("NIVELES DE HIGIENE:");
        System.out.println("0. LIMPIO");
        System.out.println("1. SUCIO");

        System.out.print("Ingresa un nro:");
        int grado = cargarEntero();

        switch (grado) {
            case 0:
                return Higiene.LIMPIO;

            case 1:
                return Higiene.SUCIO;

            default:
                System.out.println("Error: debe ingresar un valor entre 0 y 1");
                return cargarHigiene();
        }
    }

    public static CapacidadVuelo cargarCapacidadVuelo() {
        System.out.println("CAPACIDADES DE VUELO:");
        System.out.println("0. OPTIMO");
        System.out.println("1. DEFECTUOSA");
        System.out.println("2. NO VUELA");

        System.out.print("Ingresa un nro:");
        int grado = cargarEntero();

        switch (grado) {
            case 0:
                return CapacidadVuelo.OPTIMO;

            case 1:
                return CapacidadVuelo.DEFECTUOSO;
            case 2:
                return CapacidadVuelo.NO_VUELA;

            default:
                System.out.println("Error: debe ingresar un valor entre 0 y 2");
                return cargarCapacidadVuelo();
        }
    }

    public static TipoPelaje cargarTipoPelaje() {
        System.out.println("TIPOS DE PELAJE:");
        System.out.println("0. CORTO");
        System.out.println("1. LARGO");
        System.out.println("2. RIZADO");
        System.out.println("3. GRUESO");
        System.out.println("4. LANOSO");
        System.out.println("5. LISO");
        System.out.println("6. SIN PELO");

        System.out.print("Ingresa un nro:");
        int grado = cargarEntero();

        switch (grado) {
            case 0:
                return TipoPelaje.CORTO;
            case 1:
                return TipoPelaje.LARGO;
            case 2:
                return TipoPelaje.RIZADO;
            case 3:
                return TipoPelaje.GRUESO;
            case 4:
                return TipoPelaje.LANOSO;
            case 5:
                return TipoPelaje.LISO;
            case 6:
                return TipoPelaje.SIN_PELO;

            default:
                System.out.println("Error: debe ingresar un valor entre 0 y 6");
                return cargarTipoPelaje();
        }
    }

    public static Especialidad cargarEspecialidad() {
        System.out.println("ESPECIALIDADES:");
        System.out.println("0. MAMÍFEROS");
        System.out.println("1. REPTILES");
        System.out.println("2. AVES");

        System.out.print("Ingresa un nro:");
        int grado = cargarEntero();

        switch (grado) {
            case 0:
                return Especialidad.MAMIFEROS;

            case 1:
                return Especialidad.REPTILES;

            case 2:
                return Especialidad.AVES;

            default:
                System.out.println("Error: debe ingresar un valor entre 0 y 2");
                return cargarEspecialidad();
        }
    }
}