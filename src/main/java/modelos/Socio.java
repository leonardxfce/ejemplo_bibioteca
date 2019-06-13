
package modelos;


public class Socio {
    int nro_socio;
    String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public void setNro_socio(int nro_socio) {

        this.nro_socio = nro_socio;
    }
    public void guardar(){
        
        System.out.println("Socio guardado");
    }
    
}
