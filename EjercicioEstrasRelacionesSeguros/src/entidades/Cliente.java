

package entidades;


public class Cliente {
  private String nombre;
  private String apellido;
  private Integer DNI;
  private Integer telefono;
  private String email;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, Integer DNI, Integer telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + nombre + ",\n Apellido=" + apellido + ", DNI=" + DNI + ",\n Telefono=" + telefono + ",\n Email=" + email + '}';
    }
  
  
  
  
}
