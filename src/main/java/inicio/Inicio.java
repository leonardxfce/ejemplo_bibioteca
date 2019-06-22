package inicio;

import baseDatos.SQLite;
import modelos.Libro;
import modelos.Socio;
import modelos.ManejadorLibro;
import modelos.ManejadorSocio;

public class Inicio {
    public static void main(String[] args) {
        SQLite sqlite = new SQLite("ejemplo.db");
        sqlite.conectar();
        ManejadorLibro ml = new ManejadorLibro(sqlite);
        ml.crearTabla();
        Libro libro = new Libro();
        libro.setNombre("100 años de soledad");
        libro.setISBN(100);
        ml.insertar(libro);
        
        ManejadorSocio socios = new ManejadorSocio(sqlite);
        socios.crearTabla();
        Socio socio = new Socio();
        socio.setNombre("FreudS");
        socio.setApellido("Simond");
        socios.insertar(socio);
        sqlite.apagar();
        
    }
}
