package utilidades;

public class Saludador {
    String nombre;

    public Saludador(String nombre) {
        this.nombre = nombre;
    }

    public String darSaludo(){
        return "Hola " + nombre + ", buenos dias";
    }

}
