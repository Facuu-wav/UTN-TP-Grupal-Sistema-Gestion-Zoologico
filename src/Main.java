import clases.*;
import enums.*;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maximoAnimales = 20;
        Animal[] animales = new Animal[maximoAnimales];

        Cuidador[] cuidadores = new Cuidador[] {
                new Cuidador("Carlos Gómez", 35412890, 850000.0, Especialidad.MAMIFEROS),
                new Cuidador("Laura Martínez", 38923411, 890000.0, Especialidad.REPTILES),
                new Cuidador("Mariano Silva", 40123789, 820000.0, Especialidad.AVES)
        };

        // Mamíferos
        animales[0] = new Mamifero("Leonel", "León", Hambre.BAJA, Salud.SALUDABLE, Higiene.LIMPIO, TipoPelaje.CORTO);
        animales[1] = new Mamifero("Marta", "Oso Panda", Hambre.ALTA, Salud.DESNUTRIDO, Higiene.SUCIO, TipoPelaje.GRUESO);
        animales[2] = new Mamifero("Kira", "Pantera", Hambre.MEDIA, Salud.SALUDABLE, Higiene.LIMPIO, TipoPelaje.CORTO);
        animales[3] = new Mamifero("Rocco", "Rinoceronte", Hambre.BAJA, Salud.LASTIMADO, Higiene.SUCIO, TipoPelaje.SIN_PELO);

        // Aves
        animales[4] = new Ave("Pipo", "Pingüino", Hambre.ALTA, Salud.SALUDABLE, Higiene.LIMPIO, "Denso e impermeable", CapacidadVuelo.DEFECTUOSO);
        animales[5] = new Ave("Blu", "Guacamayo", Hambre.BAJA, Salud.ENFERMO, Higiene.SUCIO, "Colorido y brillante", CapacidadVuelo.OPTIMO);
        animales[6] = new Ave("Hedwig", "Lechuza", Hambre.MEDIA, Salud.SALUDABLE, Higiene.LIMPIO, "Blanco impecable", CapacidadVuelo.NO_VUELA);

        // Reptiles
        animales[7] = new Reptil("Coco", "Cocodrilo", Hambre.MUY_ALTA, Salud.SALUDABLE, Higiene.SUCIO, false, true);
        animales[8] = new Reptil("Sasha", "Cobra", Hambre.BAJA, Salud.LASTIMADO, Higiene.SUCIO, true, false);
        animales[9] = new Reptil("Igor", "Iguana", Hambre.MEDIA, Salud.SALUDABLE, Higiene.LIMPIO, false, true);


        //====================//
        //  INTERFAZ DE MENU  //
        //====================//

        boolean key = true;

        while (key) {

            System.out.println("+==========================+");
            System.out.println("|                          |");
            System.out.println("|   GESTION DE ZOOLOGICO   |");
            System.out.println("|                          |");
            System.out.println("+==========================+");

            System.out.println("1. Gestion de cuidadores.");
            System.out.println("2. Gestion de animales.");
            System.out.println("0. Salir.");

            System.out.println("Ingresar una opcion: ");

            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Error: debe ingresar un numero.");
            }

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    ClaseAuxiliar.mMenuCuidadores(
                            key,
                            opcion,
                            animales,
                            cuidadores
                    );
                    break;

                case 2:
                    Menu.MenuAnimales(
                            key,
                            opcion,
                            animales
                    );
                    break;

                case 0:
                    key = false;
                    break;

                default:
                    System.out.println("Debe ingresar una de las opciones.");
            }
        }

        scanner.close();
    }
}
