package Aplicación9_13;
public class Main {
    public static void main(String[] args) {
        // Crear algunos futbolistas
        Futbolista fut1 = new Futbolista("11111111A", "Messi", 34, 780);
        Futbolista fut2 = new Futbolista("12345678B", "Cristiano Ronaldo", 36, 760);
        Futbolista fut3 = new Futbolista("15376483C", "Neymar", 29, 280);

        // Mostrar los detalles de los futbolistas
        System.out.println("Detalles de los futbolistas:");
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
    }
}