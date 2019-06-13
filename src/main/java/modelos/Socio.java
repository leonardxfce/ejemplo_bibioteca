package modelos;

public class Socio {
    int id;
    String apellido;
    String nombre;

    public void setId(int id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void guardar(){
        System.out.println("Guardado en la BD");
    }
}
