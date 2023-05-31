
package servicio;


import entidades.Perro;
import entidades.Persona;
import java.util.List;
import java.util.Scanner;

public class Servicios {
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");

public Persona crearPersona() {
        Persona a = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        a.setNombre(leer.next());
        System.out.println("Ingrese apellido");
        a.setApellido(leer.next());
        // de la misma forma se ingresan los demas datos
        return a;

    }

    public Perro crearPerro() {
        Perro b = new Perro();
        System.out.println("Ingrese el nombre del perro");
        b.setNombre(leer.next());
        System.out.println("Ingrese raza");
        b.setRaza(leer.next());
        // de la misma forma se ingresan los demas datos
        return b;

    }
public void sistemaAdopcion(List<Persona>personas, List<Perro> perrosAAdoptar){
String respuesta; 
System.out.println("************SISTEMA DE ADOPCION*****************");
        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() + ""
 + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perrosAAdoptar) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adoptable = leer.next();
	  
            int ctrol = 0;
            for (int i = 0; i < perrosAAdoptar.size(); i++) {
                if (adoptable.equalsIgnoreCase(perrosAAdoptar.get(i).getNombre())) {
                    aux.setPerro(perrosAAdoptar.get(i));
                    ctrol++;
                    perrosAAdoptar.remove(i);
                }
            }
            if (ctrol == 0) {
                System.out.println("Ya ha sido adoptado");
//		System.out.println("Desea otra mascota?");
//		respuesta = leer.next();
//	    if(respuesta.equalsIgnoreCase("si")){
//	    sistemaAdopcion(personas, perrosAAdoptar);
//}else{
//    continue;
//}
         }
}

        System.out.println("***************************************************************");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " a adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }

        }
    }

}


