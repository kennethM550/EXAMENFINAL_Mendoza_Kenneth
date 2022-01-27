
package modelo;

public class PasajeroArreglo {
    private int indice;
    private Pasajero arregloP[];
    
    public PasajeroArreglo(int tamaño){
        this.indice = 0;
        this.arregloP=new Pasajero[tamaño];
    }
    
    public boolean agregar(Pasajero pasajero){
        boolean result=false;
        this.arregloP[this.indice]= pasajero;
        this.indice++;
        result = true;
        return result;
    }
    
    public boolean eliminar(Pasajero pasajero){
        boolean result=false;
        this.arregloP[this.indice]= this.arregloP[this.indice+1];
        this.indice--;
        result = true;
        return result;
    }
    
    public Pasajero getpasajero(String tipoDoc, String nroDoc){
        Pasajero result = null;
        for (int i = 0; i < this.arregloP.length; i++) {
            if (this.arregloP[i].getTipoDocumento().equals(tipoDoc)&&
                this.arregloP[i].getNroDocumento().equals(nroDoc)) {
                
                result=this.arregloP[i];
            }
          }
        return result;
    }
}
