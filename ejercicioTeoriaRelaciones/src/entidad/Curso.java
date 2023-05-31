
package entidad;

import java.util.List;


public class Curso {
       private int año;
    private char division;
    private Profesor profesor;
    //private Alumno alumnos;
    private List<Alumno> alumnos;
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Curso() {
    }

    public Curso(int año, char division, Profesor profesor) {
        this.año = año;
        this.division = division;
        this.profesor = profesor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Curso{" + "a\u00f1o=" + año + ", division=" + division + ", profesor=" + profesor + ", alumnos=" + alumnos + '}';
    }

    
    
  

    public List<Alumno> getAlumnos() {
        return alumnos;
}

    public void setAlumnos(List<Alumno> alumnos) {
	this.alumnos = alumnos;
    }

}
