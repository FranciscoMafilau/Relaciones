
package cineMain;

import entidades.Cine;



public class Boleteria {

    
    public static void main(String[] args) {
	Cine hd = new Cine();
	hd.crearEspectador();
	hd.CrearPelicula();

	hd.ubicarVariosEspectadores();
    }
    
}
