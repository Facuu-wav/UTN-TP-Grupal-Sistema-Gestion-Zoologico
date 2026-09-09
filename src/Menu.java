import java.util.Scanner;

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
        System.out.println("2. Vacunar animales. ");
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

        static void MenuAnimales (int opcion){
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
    }
