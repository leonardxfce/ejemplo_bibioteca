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
        
        //libro.setISBN(77);
        //ml.insertar(libro);
    
        //libro.setNombre("PEPITO");
       // libro.setISBN(55);
       // ml.borrar(libro);
       //libro.setNombre("Flavia");
       libro.setNombre("10000000000000000000000 años");
       libro.setISBN(27);
        ml.modificar(libro);
        
        ManejadorSocio ms = new ManejadorSocio(sqlite);
        ms.crearTabla();
        Socio socio = new Socio();
       // socio.setNombre("HB");
       // socio.setApellido("Simond");
       // ms.insertar(socio);
        socio.setNombre("Flavia");
        socio.setNombre("Estefania");
        socio.setApellido("Gregorio");
        //ms.insertar(socio);
        //ms.borrar(socio);
        ms.modificar(socio);
        sqlite.apagar();
        
    }
}
