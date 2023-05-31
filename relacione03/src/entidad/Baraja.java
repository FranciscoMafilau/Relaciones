package entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baraja {

    ArrayList<Carta> mazonuevo;/////trabaja con carta
    ArrayList<Carta> repartir;
    private Scanner leer = new Scanner(System.in);

    public Baraja() {
	this.mazonuevo = new ArrayList<>();
	this.repartir = new ArrayList<>();
    }

    public void crearMazo() {
	for (enumPalos palo : enumPalos.values()) {/////al usar el enum va a recorrer los 4 elementos 10 veces
	    for (int i = 1; i < 13; i++) {
		Carta c = new Carta(palo, i);////este objeto va a contener el mazo
		if(i !=8 && i !=9){////para introducir el 10, 11 y 12 
		mazonuevo.add(c);
}
		
	    }
	}
    }
// barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
	Collections.shuffle(mazonuevo);
    }
/*
siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
*/
    public Carta siguienteCarta() {
	Carta c = mazonuevo.get(0);
	repartir.add(c);
	mazonuevo.remove(0);
	if(mazonuevo.size() == 0){
	    System.out.println("no hay más cartas");
}
	return c;
    }
/*
darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
*/
    public void repartirCartas() {

	System.out.println("Cuántas cartas se dan?");
	int cant = leer.nextInt();
	if (cant > this.mazonuevo.size()) {
	    System.out.println("no alcanzan las cartas");
	} else {
	    for (int i = 0; i < cant; i++) {
		System.out.println("Repartiendo " + siguienteCarta());
	    }
	}
    }
/*
cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
*/
    public void cartasMonton() {
	System.out.println("el pozo de descarte es =");
	for (Carta carta : repartir) {
	    System.out.println(carta);
	  
	}  System.out.println("**********");
	    System.out.println(mazonuevo.size());
    }
/*
mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/
    public void mostrarBaraja() {
	for (Carta carta : mazonuevo) {
	    System.out.println(carta);
	    
	}System.out.println("*****************");
	    System.out.println(mazonuevo.size());
    }
}
