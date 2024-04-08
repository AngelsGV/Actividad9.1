package Aplicación9_13;
import java.util.Comparator;

class Futbolista implements Comparable {
    //Atributos: Dni, nombre, edad, número de goles
    String dni, nombre;
    int edad, numeroGoles;

    //Constructor
    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles; //No empieza en 0 porque va por temporada, es decir, son los que son.
    }

    //Getters i Setters
    public String getDni() {
        return dni;
    }
    public String getNombre(){
        return nombre;
    }

    @Override
    public String toString() {//Sirve para poder mostrar los datos
        return "DNI: " + dni + " Nombre: " + nombre + " Edad: " + edad + " Número de goles: " + numeroGoles + "\n";
        //el \n del final es para que cada futbolista vaya en una línea distinta :) (como en el libro Resuelto9.7)
        // tmb se puede hacer como String cad;
        // cad = ....;
        // return cad; --> Simplifico codigo como lo tengo
    }

    @Override
    public boolean equals(Object o) { //pag 262 --> otras maneras de hacerlo
        // En equals es boolean porque las respuestas que nos debe dar es si lo es o no.
        if (this == o) return true; //si dni de o es el dni introducido, ok
        // if (o == null) return false;//si o nulo, false
        //Aquí he tenido problemas :)
        if (this != o) return false;
        Futbolista nuevoFut = (Futbolista) o;
        return dni.equals(nuevoFut.getDni());
        //Si falla, será esta parte del codigo --> Pues no, lo he probado fraccionado antes de adelantar y all OK.
    }

    //  @Override //me lo implementa IntelliJ por haberlo usado en eguals()
    //      public int compareTo(Object o) {
    //  return 0;
    //  }
    //Interfaz comparable --> Pag 289
    @Override
    public int compareTo(Object fut) { //No hace falta crear una interfaz a parte porque ya están implementadas en Objeto por defecto.
        Futbolista otroFutbolista = (Futbolista) fut;
        return this.dni.compareTo(otroFutbolista.getDni());
    }

    //Comparator--> pag 293
    //Para listados ordenados de manera creciente

    public class ComparadorNombre implements Comparator {
        @Override
        public int compare(Object fut1, Object fut2) {
            String nombre1 = ((Futbolista) fut1).getNombre();
            String nombre2 = ((Futbolista) fut2).getNombre();
            return nombre1.compareTo(nombre2);
            //La única solució que he vist. usar compareTo() per el String
        }
    }
    public class ComparadorEdad implements Comparator {
        @Override
        //Este si que el he fet com me diu el llibre
        public int compare(Object fut1, Object fut2){
        return  ((Futbolista) fut1).edad - ((Futbolista) fut2).edad;
        }
    }
}

