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
        libro.setNombre("1000 años de soledad");
        libro.setISBN(77);
        ml.insertar(libro);
    
        libro.setNombre("HONGUITO");
        libro.setISBN(66);
        ml.insertar(libro);
        libro.setNombre("PEPITO");
        libro.setISBN(55);
        ml.borrar(libro);
        ml.modificar(libro);
        
        ManejadorSocio socios = new ManejadorSocio(sqlite);
        socios.crearTabla();
        Socio socio = new Socio();
        socio.setNombre("HB");
        socio.setApellido("Simond");
        socios.insertar(socio);
        
        socio.setNombre("Freud");
        socio.setApellido("Simond");
        socios.borrar(socio);
        
        sqlite.apagar();
        
    }
}
