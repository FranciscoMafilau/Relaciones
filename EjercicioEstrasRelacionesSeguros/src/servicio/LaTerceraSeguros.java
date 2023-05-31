
package servicio;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class LaTerceraSeguros {

    private final ArrayList<Poliza> listaDePolizas = new ArrayList();
    // private final ArrayList<Vehiculo> listaDeVehiculosSolos= new ArrayList();
    private final ArrayList<Cliente> listaDeClientesSolos = new ArrayList();
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private void crearCliente() {
	
        Cliente aux = new Cliente();
        System.out.println("Ingrese su nombre");
        aux.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        aux.setApellido(leer.next());
        System.out.println("Ingrese su dni");
        aux.setDNI(leer.nextInt());
        System.out.println("Ingrese su telefono");
        aux.setTelefono(leer.nextInt());
        System.out.println("Ingrese su email");
        aux.setEmail(leer.next());
        listaDeClientesSolos.add(aux);

    }

    private Vehiculo crearVehiculo() {
	System.out.println("\n\tIndividualice el vehiculo que desea asegurar");
        System.out.println("Ingrese marca del vehiculo ");
        String marca = leer.next();
        System.out.println("Ingrese  modelo del vehiculo ");
        String modelo = leer.next();
        System.out.println("Ingrese año del vehiculo ");
        Integer anio = leer.nextInt();
        System.out.println("Ingrese numero de motor del vehiculo ");
        Integer numMotor = leer.nextInt();
        System.out.println("Ingrese numero de chasis ");
        Integer numchasis = leer.nextInt();
        System.out.println("Ingrese color del vehiculo");
        String color = leer.next();
        System.out.println("Ingrese el tipo de vehiculo");
        String tipo = leer.next();
        return new Vehiculo(marca, modelo, anio, numMotor, numchasis, color, tipo);
    }

  /*  public void verListaVehiculos() {
        for (Vehiculo aux : listaDeVehiculosSolos) {
            System.out.println(aux.toString());
        }

    }*/

    public void verListaClientes() {
	System.out.println("\n\t Listado de Clientes de la Compañía");        
for (Cliente aux : listaDeClientesSolos) {
            System.out.println(aux.toString());
        }

    }

    public void MostrarListaPolizas() {
	
        for (Poliza aux : listaDePolizas) {
            System.out.println(aux.toString());
        }
    }

    public void Menu() {
        System.out.println("*******************************************************************");
	System.out.println("\n\t~Bienvenido a La Tercera Seguros~");
	System.out.println("\n\t ~Sistema OnLine de suscripción");
	System.out.println("\tLe solicitamos tenga la documentación del \n\tvehículo a su alcance para agilizar la tramitación");
	System.out.println("******************************************************************");	
int opcion;
        do {
            System.out.println("Ingrese la opcion deseada \n 1-Registrar cliente \n 2-Crear poliza \n"
                    + " 3-Ver lista de clientes registrados \n 4-Mostrar lista poliza  \n 5-Cambiar estado socio \n 0-Salir");
System.out.println("*******************************************************");
 opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    crearCliente();
                    break;
                case 2:
                    crearPoliza();
                    break; 
                case 3:
                    verListaClientes();
                    break;
                case 4:
                    MostrarListaPolizas();
                    break;
                case 5:
                    cambiarvigencia();
                    break;
                
                case 0:
                    System.out.println("Gracias por ser parte de la familia La Tercera Seguros");
                    break;

                default:
                    System.out.println("Opcion errónea");
            }

        } while (opcion != 0);
    }

    public void crearPoliza() {
        Poliza Polizaux=new Poliza();
        System.out.println("Ingrese DNI del cliente");
        Integer num = leer.nextInt();
        for (Cliente clienteAux : listaDeClientesSolos) {
            if (Objects.equals(clienteAux.getDNI(), num)) {
                Polizaux.setCliente(clienteAux);
                Polizaux.setVehiculo(crearVehiculo());
                System.out.println("¿Que opcion desea de seguros tercera?");
                System.out.println("\t1-Parcial \n \t2-Contra terceros \n\t 3-Total");
                num=leer.nextInt();
                Polizaux.opcionesDePoliza(num);
                Polizaux.setNroPoliza((int)(Math.random()*10000+1));
                listaDePolizas.add(Polizaux);
            } else{
             System.out.println("El cliente no existe");
         }

    }
  }
        
private void cambiarvigencia(){
     System.out.println("Ingrese DNI del cliente");
     Integer num = leer.nextInt();
     for (Poliza aux : listaDePolizas) {
        if(Objects.equals(aux.getCliente().getDNI(), num)){
            if(aux.isVigente()){
                aux.setVigente(false);
                System.out.println("El estado del cliente es ahora no deudor");
            }else{
                aux.setVigente(true);
                System.out.println("El estado del cliente es moroso");
            }
        }
    }
        
    
}

}
