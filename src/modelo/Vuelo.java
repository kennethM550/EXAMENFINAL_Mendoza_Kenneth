
package modelo;


public class Vuelo {
    private String codigo;
    private String fecha;
    private String hora;
    private int puerta;
    private boolean activo;
    
    private Aeropuerto aeropuerto;
    private Asiento asientos;

    public Vuelo(String codigo, String fecha, String hora, int puerta, boolean activo) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.puerta = puerta;
        this.activo = activo;
        
        this.aeropuerto = new Aeropuerto(hora, fecha, activo);
        
    }

    
    
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

