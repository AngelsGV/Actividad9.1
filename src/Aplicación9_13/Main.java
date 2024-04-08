package Aplicación9_13;

import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.sort;//me lo ha puesto IntelliJ

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//vamos a tener que introducir datos
        // Creamos una tabla de futbolistas con 5 futbolistas.
        //He intentado otra forma de crear la tabla más facilmente
        ArrayList<Futbolista> tablaFutbolistas = new ArrayList<>();

        tablaFutbolistas.add(new Futbolista("11111111A", "Messi", 34, 300));
        tablaFutbolistas.add(new Futbolista("22222222B", "Ronaldo", 36, 900));
        tablaFutbolistas.add(new Futbolista("333333333C", "Neymar ", 29, 200));
        tablaFutbolistas.add(new Futbolista("444444444D", "Piqué", 33, 670));
        tablaFutbolistas.add(new Futbolista("555555555E", "Casillas", 45, 100000));

        while (true) {
            System.out.println("\n Menú:");
            System.out.println("1. Ordenar por DNI");
            System.out.println("2. Ordenar por nombre");
            System.out.println("3. Ordenar por edad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    // Ordenar por DNI
                    sort(tablaFutbolistas);
                    System.out.println("\nTabla ordenada por DNI:");
                    break;
                case 2:
                    // Ordenar por nombre
                    sort(tablaFutbolistas, new Futbolista.ComparadorNombre());
                    System.out.println("\nTabla ordenada por nombre:");
                    break;
                case 3:
                    // Ordenar por edad
                    sort(tablaFutbolistas, new Futbolista.ComparadorEdad());
                    System.out.println("\nTabla ordenada por edad:");
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    // Opción inválida
                    System.out.println("Opción erronéa. Por favor, seleccione otra.");
                    break;
            }

            // Mostrar la tabla de futbolistas ordenada
            for (Futbolista futbolista : tablaFutbolistas) {
                System.out.println(futbolista);
            }
        }
    }
}
