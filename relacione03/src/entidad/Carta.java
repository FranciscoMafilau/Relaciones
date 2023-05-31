
package entidad;


public class Carta {
    private enumPalos palo;/////trabaja con enum
    private Integer numero;

    public Carta() {
    }

    public Carta(enumPalos palo, Integer numero) {
	this.palo = palo;
	this.numero = numero;
    }

    public enumPalos getPalo() {
	return palo;
    }

    public void setPalo(enumPalos palo) {
	this.palo = palo;
    }

    public Integer getNumero() {
	return numero;
    }

    public void setNumero(Integer numero) {
	this.numero = numero;
    }

    @Override
    public String toString() {
	return "Carta{" + "Palo= " + palo + ", numero= " + numero + '}';
    }
 

}
