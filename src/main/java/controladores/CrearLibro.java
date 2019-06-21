package controladores;

import modelos.Libro;

import java.util.Map;

public class CrearLibro implements Comando {
    @Override
    public void ejecutar(Peticion peticion) {

        Map map = peticion.darDatos();
        Libro libro = new Libro();

        String nombre = (String) map.get("nombre");
        int ISBN = (Integer) map.get("ISBN");

        libro.setNombre(nombre);
        libro.setISBN(ISBN);
    }
}
