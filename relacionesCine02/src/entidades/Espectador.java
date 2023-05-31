

package entidades;


public class Espectador {
       private Integer edad;
       private String nombre;
       private Integer dineroDisponible;

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Integer dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    public Espectador() {
    }

    public Espectador(Integer edad, String nombre, Integer dineroDisponible) {
        this.edad = edad;
        this.nombre = nombre;
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" + "edad=" + edad + ", nombre=" + nombre + ", dineroDisponible=" + dineroDisponible + '}';
    }
       
       
}
