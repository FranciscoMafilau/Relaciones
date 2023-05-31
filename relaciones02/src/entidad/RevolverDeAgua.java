
package entidad;

public class RevolverDeAgua {
   /*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/ 

private Integer posicionAct;
private Integer posicionAgua;

    public RevolverDeAgua() {

} 
/*
 llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
*/
    public void llenarRevolver() {
        this.posicionAct = ((int) (((Math.random() * 6)) + 1));
        this.posicionAgua = ((int) (((Math.random() * 6)) + 1));
    }
////mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar() {
        return posicionAct == posicionAgua;
    }
///siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro() {
        if (posicionAct < 6) {
            posicionAct += 1;
        } else {
            posicionAct = 1;
        }
    }

    public int getPosicionAct() {
        return posicionAct;
    }

    public void setPosicionAct(int posicionAct) {
        this.posicionAct = posicionAct;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Posicion Actual=" + posicionAct + ", Posicion del Agua=" + posicionAgua;
    }

}
    