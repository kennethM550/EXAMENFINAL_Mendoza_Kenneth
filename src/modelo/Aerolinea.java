
package modelo;


public class Aerolinea {
    private String nombre;
    private String ruc;
    
    private Vuelo arregloV[];

      
    public Aerolinea(String nombre, String ruc) {
        this.nombre = nombre;
        this.ruc = ruc;
        
    }
    
    
    
    public Vuelo[] getVueloActivos(){
        Vuelo activos[]= new Vuelo[];
       
    }
    
    public Pasajero[] getPasajerosPorVuelo(){
        
    }
    
    public Vuelo[] getVuelosPorCiudad(){
        
        
    }
}
