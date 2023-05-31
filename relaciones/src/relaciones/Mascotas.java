
package relaciones;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicio.Servicios;

public class Mascotas {
private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
*/

    public static void main(String[] args) {
        List<Persona> personas = new ArrayList();///arrays para contener personas
        List<Perro> perrosAAdoptar = new ArrayList();
      Servicios mejorAmigo = new Servicios();
      
      System.out.println("Ingrese cantidad de adoptantes:");
      int cant = leer.nextInt();
      System.out.println("Ingrese personas para lista de adoptantes: ");
        ///System.out.println("Se procedera a cargar dos personas en el sistema");
        for (int i = 0; i < cant; i++) {
	personas.add(mejorAmigo.crearPersona());///agrego las personas
        }

        System.out.println("*******************************");
        //System.out.println("Se procede a cargar dos perros en el sistema");
System.out.println("Ingrese cantidad de mascotas en adopción:");
   int cantP = leer.nextInt();
System.out.println("Ingrese lista de mascotas en adopción:");
        for (int i = 0; i < cantP; i++) {
	perrosAAdoptar.add(mejorAmigo.crearPerro()); //agrego perros
           
        }
	System.out.println("*************************");
	mejorAmigo.sistemaAdopcion(personas, perrosAAdoptar);
}
}
 
