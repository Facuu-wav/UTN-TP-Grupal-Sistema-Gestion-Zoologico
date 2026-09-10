import clases.Animal;
import clases.Mamifero;
import enums.*;

import java.util.Scanner;

public class Menu {

    static void MenuCuidadores(int opcion) {
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
            case 0:
                opcion -= 1;
                break;
            default:
                System.out.println("Debe ingresar una de las opciones.");
        }
    }

    static void MenuAnimales (int opcion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+==========================+");
        System.out.println("|                         |");
        System.out.println("|   GESTION DE ANIMALES   |");
        System.out.println("|                         |");
        System.out.println("+=========================+");

        System.out.println("1. Cargar animal. ");
        System.out.println("2. Lista por raza. ");
        System.out.println("3. Lista por tipo. ");
        System.out.println("3. Buscar por ID. ");
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

                break;
            case 2://no definido

                break;
            case 0:
                opcion -= 1;
                break;
            default:
                System.out.println("Debe ingresar una de las opciones.");
        }
    }

    public static Animal CargarAnimal() {
        String nombre = limpCargaAtributos() ;

        String especie = limpCargaAtributos();

        Hambre hambre = Hambre.valueOf(limpCargaAtributos());

        Salud salud = Salud.valueOf(limpCargaAtributos());

        Higiene higiene = Higiene.valueOf(limpCargaAtributos());

        TipoPelaje tipoPelaje = TipoPelaje.valueOf(limpCargaAtributos());


        Animal mamifero = new  Mamifero(
                nombre
                ,especie
                ,hambre
                ,salud
                ,higiene
                ,tipoPelaje
        );


        return mamifero;
    }

    public static String limpCargaAtributos(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().
                trim(). //quitamos espacio de los extremos
                        toUpperCase(). // ponemos en mayusculas la entrada de datos
                        replace(" ", "_"); //reemplazamos espacio por barras bajas.;
    }


}
