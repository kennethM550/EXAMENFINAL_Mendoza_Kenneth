
package modelo;


public class PaisArreglo {
    private int indice;
    private Pais pais[];
    
    public PaisArreglo(int tamaño){
        this.indice = 0;
        this.pais = new Pais[tamaño];
    }
    
    public boolean agregar(Pais pais){
        boolean result = false;
        this.pais[this.indice]=pais;
        this.indice++;
        result = true;
        return result;
    }
    
    public boolean eliminar(Pais pais){
        boolean result = false;
        this.pais[this.indice]=pais;
        this.indice--;
        result = true;
        return result;
    }
    
    public Pais getPais(String codigo){
        Pais result = null;
        for (int i = 0; i < this.pais.length; i++) {
            if (this.pais[i].getCodigo().equals(codigo)) {
                
                result=this.pais[i];
            }
          }
        return result;
    }
}

