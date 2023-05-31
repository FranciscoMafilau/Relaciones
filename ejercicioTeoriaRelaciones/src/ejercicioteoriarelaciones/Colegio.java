
package ejercicioteoriarelaciones;

import entidad.Alumno;
import entidad.Curso;
import entidad.Profesor;
import java.util.ArrayList;


public class Colegio {

   
    public static void main(String[] args) {
	  
        
        Profesor profesor = new Profesor();
        profesor.setNombre("Pablo");
        profesor.setApellido("Albrecht");
        Curso curso = new Curso();
        curso.setProfesor(profesor);
        
        
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Jose");
        alumno1.setApellido("Perez");
        ArrayList<Alumno> alumnos = new ArrayList();
        alumnos.add(alumno1);
        curso.setAlumnos(alumnos);
        
      //  for(Alumno aux : alumnos ) {
       //     System.out.println(aux.toString);
      //  }
            
      System.out.println(curso.toString());   
         // System.out.println(curso.getAlumnos().toString());
    
    }  
    }
    

