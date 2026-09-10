import java.util.Scanner;
import clases.*;

import enums.*;

public class ClaseAuxiliar {

    static Scanner scanner = new Scanner(System.in);

    static void mMenuCuidadores(boolean key, int opcion, Animal[] a, Cuidador[] c) {

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
                while(key) {
                    for (Animal i : a) {
                        if (i.getHambre() != Hambre.BAJA) {
                            for (Cuidador j : c) {
                                j.alimentar(i);
                            }
                        }
                    }

                    key = Menu.continuar(key);
                }

                key = true;
                break;
            case 2:
                while(key){
                    for(Animal i : a){
                        if(i.getSalud() == Salud.DESNUTRIDO || i.getSalud() == Salud.ENFERMO || i.getSalud() == Salud.LASTIMADO){
                            for(Cuidador j : c){
                                j.curar(i);
                            }
                        }
                    }

                    key = Menu.continuar(key);
                }

                key = true;
                break;
            case 0: ;
                break;
            default:
                System.out.println("Debe ingresar una de las opciones.");
        }
    }

}
