package teoriacolecciones;


import java.util.ArrayList;
import teoriacolecciones.Profesor;


public class Curso {
   
private int anio;
private char division;
private Profesor profesor;
private ArrayList<Alumno> alumnos;

    public Curso() {
    }

    public Curso(int anio, char division, Profesor profesor) {
	this.anio = anio;
	this.division = division;
	this.profesor = profesor;
    }

    public int getAnio() {
	return anio;
    }

    public void setAnio(int anio) {
	this.anio = anio;
    }

    public char getDivision() {
	return division;
    }

    public void setDivision(char division) {
	this.division = division;
    }

    public Profesor getProfesor() {
	return profesor;
    }

    public void setProfesor(Profesor p) {
	this.profesor = p;
    }

    public ArrayList<Alumno> getAlumnos() {
	return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
	this.alumnos = alumnos;
    }


    @Override
    public String toString() {
	return "Curso{" + "anio=" + anio + ", division=" + division + ", profesor=" + profesor + '}';
    }
}

