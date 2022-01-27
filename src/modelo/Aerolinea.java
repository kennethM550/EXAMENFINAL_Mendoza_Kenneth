
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
        Vuelo activos[]= null;
       
        return activos;
    }
    
    public Pasajero[] getPasajerosPorVuelo(){
        Pasajero pasajeros[]=null;
        
        return pasajeros;
    }
    
    public Vuelo[] getVuelosPorCiudad(){
        Vuelo vuelo[]=null;
        
        return vuelo;
        
    }
    
    public boolean ingresar(String nombre, String ruc){
        boolean result = false;
        if (this.nombre.equalsIgnoreCase(nombre) && this.ruc.equalsIgnoreCase(ruc)) {
            result=true;
        }
        return result;
    }
}
