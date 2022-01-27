
package modelo;


public class AeropuertoArreglo {
    private int indice;
    private Aeropuerto arregloA[];
    
    public AeropuertoArreglo(int tamaño){
        this.indice=0;
        this.arregloA=new Aeropuerto[tamaño];
    }
    
    public boolean agregar(Aeropuerto a){
        boolean result = false;
        return result;
    }
    
    public Aeropuerto getAeropuerto(Pais pais){
        Aeropuerto result = null;
        return result;
    }
    
    public Aeropuerto getAeropuerto(Ciudad ciudad){
        Aeropuerto result = null;
        return result;
    }
}
