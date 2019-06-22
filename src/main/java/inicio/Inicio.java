package inicio;

import baseDatos.SQLite;
import modelos.Libro;
import modelos.ManejadorLibro;
import modelos.ManejadorSocio;
import modelos.Socio;

public class Inicio {
    public static void main(String[] args) {
        SQLite sqlite = new SQLite("ejemplo.sqlite");
        sqlite.conectar();
        ManejadorLibro ml = new ManejadorLibro(sqlite);
        ml.crearTabla();
        Libro libro = new Libro();
        libro.setNombre("un perro roto");
        libro.setISBN(100);
        ml.insertar(libro);
        
        ManejadorSocio ms = new ManejadorSocio(sqlite);
        ms.crearTabla();
        Socio socio = new Socio();
        socio.setNombre("Martin");
        socio.setApellido("Araoz");
        ms.insertar(socio);
        sqlite.apagar();
    }
}
