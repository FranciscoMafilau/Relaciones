
package entidad;

import java.util.ArrayList;
import java.util.Scanner;


/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
*/
public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;
    ArrayList<Jugador> jugadores;

    public Jugador(int id, String nombre) {
	this.id = id;
	this.nombre = nombre;
    }

    public Jugador() {
        this.mojado = false;
        this.jugadores = new ArrayList();
    }

    public void crearJugadores(int cantidad) {
if (cantidad < 7 && cantidad > 0) {
            for (Integer i = 1; i < cantidad + 1; i++) {
                Jugador s = new Jugador(i , "Jugador " + i.toString());
                jugadores.add(s);
            }
        } else {
            crearJugadores(6);
        }
    }

    public boolean disparo(RevolverDeAgua r, Jugador j) {
        if (r.mojar()) {
            j.setMojado(true);
            return true;
        } else {
            r.siguienteChorro();
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id= " + id + ", Nombre= " + nombre + '}';
    }

}  