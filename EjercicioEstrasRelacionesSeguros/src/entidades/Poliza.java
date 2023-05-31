/*
 Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.).
 */
package entidades;


public class Poliza {
    
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer nroPoliza;
    private String fechainicio;
    private String fechafin;
    private Integer cantCuotas;
    private String formaPago;
    private boolean vigente;
    private Integer montoTotal;
    private boolean granizo;
    private Integer maximoGranizo;
    private String tipoDeCobertura;

    @Override
    public String toString() {
        return "Poliza{" + "cliente=" + cliente + ", vehiculo=" + vehiculo + ", nroPoliza=" + nroPoliza + ", fechainicio=" + fechainicio + ", fechafin=" + fechafin + ", cantCuotas=" + cantCuotas + ", formaPago=" + formaPago + ", montoTotal=" + montoTotal + ", granizo=" + granizo + ", maximoGranizo=" + maximoGranizo + ", tipoDeCobertura=" + tipoDeCobertura + '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    
    public Integer getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(Integer nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }
     
    
            
    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Integer montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    public Integer getMaximoGranizo() {
        return maximoGranizo;
    }

    public void setMaximoGranizo(Integer maximoGranizo) {
        this.maximoGranizo = maximoGranizo;
    }

    public String getTipoDeCobertura() {
        return tipoDeCobertura;
    }

    public void setTipoDeCobertura(String tipoDeCobertura) {
        this.tipoDeCobertura = tipoDeCobertura;
    }

    public void opcionesDePoliza(int x) {
        switch (x) {
            case 1:
                this.fechainicio="2023-06-01";
                this.fechafin="2027-06-01";
                this.cantCuotas=60;
                this.formaPago="contado";
                this. montoTotal=1000000;
                this.granizo=false;
                this.maximoGranizo=0;
                this.tipoDeCobertura="parcial";
                break;
            case 2:
                this.fechainicio="2023-06-01";
                this.fechafin="2033-06-01";
                this.cantCuotas=120;
                this.formaPago="paypal";
                this. montoTotal=5000000;
                this.granizo=true;
                this.maximoGranizo=500000;
                this.tipoDeCobertura="contra terceros";
                break;
            case 3:
                this.fechainicio="2023-06-01";
                this.fechafin="2038-06-01";
                this.cantCuotas=180;
                this.formaPago="cheques";
                this. montoTotal=10000000;
                this.granizo=true;
                this.maximoGranizo=1000000;
                this.tipoDeCobertura="total";
                break;

        }

    }

    public Poliza() {

    }

    public Poliza(Cliente cliente, Integer nroPoliza, String fechainicio, String fechafin, Integer cantCuotas, String formaPago, Integer montoTotal, boolean granizo, Integer maximoGranizo, String tipoDeCobertura) {
        this.cliente = cliente;
        this.nroPoliza = nroPoliza;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.cantCuotas = cantCuotas;
        this.formaPago = formaPago;
        this.montoTotal = montoTotal;
        this.granizo = granizo;
        this.maximoGranizo = maximoGranizo;
        this.tipoDeCobertura = tipoDeCobertura;
    }

}
