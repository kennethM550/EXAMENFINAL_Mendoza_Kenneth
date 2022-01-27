
package modelo;


public class Asiento {
    private int nroAsiento;
    private char fila;
    private String estado;
    
    private Pasajero pasajero;

    public boolean reservarAsiento(){
        boolean result = false;
        
        return result;
    }
    public boolean cancelarAsiento(){
        boolean result = false;
        
        return result;
    }
    public boolean venderAsiento(){
          boolean result = false;
        
        return result;
        
    }
    
     public int getNroAsiento() {
        return nroAsiento;
    }

    public void setNroAsiento(int nroAsiento) {
        this.nroAsiento = nroAsiento;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
