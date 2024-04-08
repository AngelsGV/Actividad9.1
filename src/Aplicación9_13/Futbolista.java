package Aplicación9_13;

class Futbolista  implements Comparable{
    //Atributos: Dni, nombre, edad, número de goles
    String dni, nombre;
    int edad, numeroGoles;
    //Constructor
    public Futbolista(String dni, String nombre, int edad, int numeroGoles){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }
    @Override
    public String toString(){
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
        if (o == null) return false;//si o nulo, false
        //Aquí he tenido problemas :)
        if (this != o) return false;
        Futbolista nuevoFut = (Futbolista) o;
        return dni.equals(nuevoFut);
        //Si falla, será esta parte del codigo --> Pues no, lo he probado fraccionado antes de adelantar y all OK.
    }

    @Override //me lo implementa IntelliJ por haberlo usado en eguals()
    public int compareTo(Object o) {
        return 0;
    }

}

