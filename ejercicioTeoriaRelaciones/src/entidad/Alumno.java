
package entidad;


public class Alumno {
    private String nombre;
    private String Apellido;

    public Alumno() {
    }

    public Alumno(String nombre, String Apellido) {
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", Apellido=" + Apellido + '}';
    }
    
}
