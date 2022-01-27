
package modelo;


public class Pais {
    private String codigo;
    private String nombre;
    private int indiceC;
    private Ciudad ciudades[];
    public Pais(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.indiceC = 0;
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

    public Ciudad[][] getCiudades(String codPais){
        Ciudad ciudad[][]=new Ciudad[this.indiceC][3];
        for (int i = 0; i < this.indiceC; i++) {
            
        }
        return ciudad;
    }
    
    
}
