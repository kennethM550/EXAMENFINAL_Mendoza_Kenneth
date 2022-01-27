
package modelo;

import java.util.Date;


public class Pasajero {
    private String tipoDocumento;
    private String nroDocumento;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;   

    public Pasajero(String tipoDocumento, String nroDocumento, String nombres, String apellidos, Date fechaNacimiento) {
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void comprar(Vuelo vuelo, char fila, int nroasiento){
        
    }
    
}
