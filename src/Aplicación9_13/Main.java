package Aplicación9_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una tabla de futbolistas con 5 futbolistas
        ArrayList<Futbolista> tablaFutbolistas = new ArrayList<>();
        tablaFutbolistas.add(new Futbolista("12345678A", "Lionel Messi", 34, 700));
        tablaFutbolistas.add(new Futbolista("98765432B", "Cristiano Ronaldo", 36, 760));
        tablaFutbolistas.add(new Futbolista("24681357C", "Neymar Jr", 29, 200));
        tablaFutbolistas.add(new Futbolista("13579246D", "Robert Lewandowski", 33, 550));
        tablaFutbolistas.add(new Futbolista("56789123E", "Kylian Mbappé", 23, 300));

        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Menú para seleccionar el tipo de ordenamiento
        while (true) {
            System.out.println("\nMenú de ordenamiento:");
            System.out.println("1. Ordenar por DNI");
            System.out.println("2. Ordenar por nombre");
            System.out.println("3. Ordenar por edad");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción seleccionada por el usuario
            int opcion = scanner.nextInt();

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    // Ordenar por DNI
                    Collections.sort(tablaFutbolistas);
                    System.out.println("\nTabla de futbolistas ordenada por DNI:");
                    break;
                case 2:
                    // Ordenar por nombre
                    Collections.sort(tablaFutbolistas, new Futbolista.ComparadorNombre());
                    System.out.println("\nTabla de futbolistas ordenada por nombre:");
                    break;
                case 3:
                    // Ordenar por edad
                    Collections.sort(tablaFutbolistas, new Futbolista.ComparadorEdad());
                    System.out.println("\nTabla de futbolistas ordenada por edad:");
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    // Opción inválida
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            // Mostrar la tabla de futbolistas ordenada
            for (Futbolista futbolista : tablaFutbolistas) {
                System.out.println(futbolista);
            }
        }
    }
}
