package newpackage;

import java.util.ArrayList;
import java.util.Scanner;
import teoriacolecciones.Profesor;


public class TeoriaColecciones {

   
    public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	Profesor profesor = new Profesor();
	profesor.setNombre("Hugo");
	profesor.setApellido("Gonzalez");

	System.out.println(profesor.toString());


//	Curso c = new Curso();
//	c.setProfesor(profesor);
//	System.out.println(profesor.toString());
//	System.out.println(c.toString());
//	System.out.println("********************");
//	Alumno al = new Alumno();
//	al.setNombre("juan");
//	al.setApellido("Perez");
//	
//	ArrayList<Alumno> alumnos = new ArrayList();
//	alumnos.add(al);
//	c.setAlumnos(alumnos);
////	for (Alumno alumno : alumnos) {
////	    System.out.println(alumno.toString());
////	}

	
    }
    
}
