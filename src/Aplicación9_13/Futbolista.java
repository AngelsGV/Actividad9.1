package Aplicación9_13;

class Futbolista  implements Comparable{
    //Atributos: Dni, nombre, edad, número de goles
    String dni, nombre;
    int edad, numeroGoles;

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
    }
    @Override
    public boolean equals(){
        // En equals es boolean porque las respuestas que nos debe dar es si lo es o no.


    }

}
