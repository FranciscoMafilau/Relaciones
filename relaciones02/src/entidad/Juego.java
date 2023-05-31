package entidad;

import java.util.ArrayList;
import java.util.List;

/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.


• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class Juego {

    ArrayList<Jugador> jugadores;
    RevolverDeAgua rda;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua rda) {
        this.jugadores = jugadores;
        this.rda = rda;
    }

    public void ronda() {
        boolean juegoTerminado = false;
        do {
            for (Jugador j : jugadores) {
                if (j.disparo(rda, j)) {
                    System.out.println("El " + j.getNombre() + " se mojó. Ha finalizado el juego");
                    juegoTerminado = true;
                    break;
                } else {
                    System.out.println("El " + j.getNombre() + " se salvó, continúe el siguiente");
                    //System.out.println(rda);
                }
            }
        } while (!juegoTerminado);
    }
}