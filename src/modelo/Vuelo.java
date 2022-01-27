
package modelo;


public class Vuelo {
    private String codigo;
    private String fecha;
    private String hora;
    private int puerta;
    private boolean activo;
    private Asiento asientos[];

    
    public boolean venderAsiento(Pasajero p, int nroasiento, char fila){
        
    }
    
    public Asiento[] asientosDisponibles(){
        
    }
    
    public boolean reservarAsiento(int nroAsiento, char fila){
         boolean result = false;
        
        return result;
    }
    
    public boolean cancelarAsiento(int nroAsiento, char fila){
         boolean result = false;
        
        return result;
    }
    
    public String getCiudadSalida(){
        
    }
    
    public String getCiudadLlegada(){
        
    }
    
    public String getAeropuetoSalida(){
        
    }
    
    public String getAeropuertoLlegada(){
        
    }
    
    public Pasajeros[] getListaPasajeros(){
        
    }
}

