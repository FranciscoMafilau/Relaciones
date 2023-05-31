package entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Cine {
    private Espectador[][] asientos = new Espectador[8][6];
    private ArrayList<Espectador> listaDeEspectadores =new ArrayList();
    private Pelicula pelicula;
    private Integer precioEntrada;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cine() {
        this.precioEntrada=100;
        this.pelicula=new Pelicula();
    }
     
    public void crearEspectador(){
        System.out.println("Ingrese cuantos espectadores desea crear ");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            Espectador aux = new Espectador();
            System.out.println("Ingrese nombre del espectador");
            String nombre=leer.next();
            aux.setNombre(nombre);
            aux.setDineroDisponible((int)(Math.random()*700+1));
            aux.setEdad((int)(Math.random()*65+1));
            listaDeEspectadores.add(aux);
            System.out.println(aux);
        }
        
    }
    public void CrearPelicula(){
        System.out.println("Ingrese el nombre de la pelicula");{
        String nombre= leer.next();
        pelicula.setTitulo(nombre);
        pelicula.setEdadMinina(15);
        pelicula.setDirector("pepe");
        pelicula.setDuracion(170);
    }
    }
    public void UbicarEspectadores(Espectador aux){
        int i,j;
        do {
            i = (int) (Math.random() * 8);
            j = (int) (Math.random() * 6);
        } while (asientos[i][j] != null);
  
        if(100<aux.getDineroDisponible() && aux.getEdad()>=pelicula.getEdadMinina()){
            asientos[i][j]=aux;
            
            
        }else{
            System.out.println("El espectador no tiene edad suficiente o le falta dinero para la entrada");
        }
        
    }
    
    public void ubicarVariosEspectadores(){  
        for (Espectador aux : listaDeEspectadores) {
            UbicarEspectadores(aux);
        }
       
         /* for (int i = 0; i < listaDeEspectadores.size(); i++) {
            UbicarEspectadores();
        }
        */
    }
    
    public Espectador[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Espectador[][] asientos) {
        this.asientos = asientos;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Cine(Pelicula pelicula, Integer precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
    }

    public void MostrarAsientos(){
        for (int i = 7; i >=0; i--) {
            for (int j = 0; j < 6; j++) {
                    switch (j) {
                        case 0: 
                            if(asientos[i][j]==null){
                                System.out.print((i+1) + "A    |");
                            }else{
                                System.out.print((i+1) + "A X  |");
                            }
                            break;
                        case 1:
                            if(asientos[i][j]==null){
                                System.out.print((i+1) + "B    |");
                            }else{
                                System.out.print((i+1) + "B X  |");
                            }
                            break;
                        case 2:
                            if(asientos[i][j]==null){
                                System.out.print((i+1) + "C    |");
                            }else{
                                System.out.print((i+1) + "C X  |");
                            }
                            break;
                        case 3:
                            if(asientos[i][j]==null){
                                System.out.print((i+1) + "D    |");
                            }else{
                                System.out.print((i+1) + "D X  |");
                            }
                            break;
                        case 4:
                            if(asientos[i][j]==null){
                                System.out.print((i+1)+ "E    |");
                            }else{
                                System.out.print((i+1) + "E X  |");
                            }
                            break;
                        case 5:
                            if(asientos[i][j]==null){
                                System.out.print((i+1) + "F    |");
                            }else{
                                System.out.print((i+1) + "F X  |");
                            }
                            break;
   
                } 
                
                
                System.out.print("");
            }
            System.out.println("");
        }
    }
    @Override
    public String toString() {
        return "Cine{" + "asientos=" + asientos + ", pelicula=" + pelicula + ", precioEntrada=" + precioEntrada + '}';
    }
    
    

}
