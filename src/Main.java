import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);






        boolean key = true;


        while (key) {
            System.out.println("+==========================+");
            System.out.println("|                          |");
            System.out.println("|   GESTION DE ZOOLOGICO   |");
            System.out.println("|                          |");
            System.out.println("+==========================+");

            System.out.println("1. Gestion de cuidadores. ");
            System.out.println("2. Gestion de animales. ");
            System.out.println("0. Salir.");


            System.out.println("Ingresar una opcion: ");

            while(!scanner.hasNextInt()){ //Evaluamos entrada segura de numero entero.
                scanner.nextLine(); //limpiamos buffer
                System.out.println("Error: debe ingresar un numero.");
            }
            int opcion = scanner.nextInt();
            scanner.nextLine(); //limpiamos buffer

            switch (opcion){
                case 1:


                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Debe ingresar una de las opciones.");
            }

        }
    }
}
