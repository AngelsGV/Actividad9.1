package Aplicación9_13;
public class Main {
    public static void main(String[] args) {
        // Crear algunos futbolistas
        Futbolista fut1 = new Futbolista("11111111A", "Messi", 34, 780);
        Futbolista fut2 = new Futbolista("12345678B", "Cristiano Ronaldo", 36, 760);
        Futbolista fut3 = new Futbolista("15376483C", "Neymar", 29, 280);

        // Mostrar datos
        System.out.println("Futbolistas:");
        System.out.println(fut1);
        System.out.println(fut2);
        System.out.println(fut3);

        // Comparar dos futbolistas
        System.out.println("\nComparando dos futbolistas:");
        if (fut1.equals(fut2)) {
            System.out.println("El futbolista 1 es igual al futbolista 2");
        } else {
            System.out.println("El futbolista 1 no es igual al futbolista 2");
        }
        // Interfaz Comparable por el DNI
        System.out.println("\nOrdenando futbolistas por DNI:");
        //fut1 va antes que fut2
        if (fut1.compareTo(fut2) < 0) { //esto se hace porque devuelve un numero entero.
            System.out.println("El futbolista 1 tiene un número de DNI anterior al futbolista 2");
        //fut1 va después que fut2
        } else if (fut1.compareTo(fut2) > 0) {
            System.out.println("El futbolista 1 tiene un número DNI posterior al futbolista 2");
        } else {
            //fut1 es igual a fut2
            System.out.println("Los futbolistas tienen el mismo DNI");
    }
}
}