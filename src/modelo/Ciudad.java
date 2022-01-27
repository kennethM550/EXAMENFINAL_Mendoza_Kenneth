
package modelo;


public class Ciudad {
    private String codigo;
    private String nombre;
    private Aeropuerto aeropuerto;
    private int indiceC;

    public Ciudad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public Aeropuerto getAeropuertos(String codCiudad){
        return aeropuerto;
    }
}
