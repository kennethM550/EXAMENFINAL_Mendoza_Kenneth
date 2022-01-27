
package modelo;


public class Aeropuerto {
    private String nombre;
    private String direccion;
    private boolean estado;

    public Aeropuerto(String nombre, String direccion, boolean estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean suspender(){
        boolean result=false;
        return result;
    }
    
    public boolean activar(){
        boolean result=false;
        return result;
    }
}
