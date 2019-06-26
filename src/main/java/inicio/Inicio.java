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
        libro.setNombre("SOLCITO");
        libro.setISBN(123);
        ml.insertar(libro);
        ml.modificarLibrito(libro);
        
        ManejadorSocio ms = new ManejadorSocio(sqlite);
        ms.crearTabla();
        Socio socio = new Socio();
        socio.setNombre("Martin");
        socio.setApellido("Araoz");
        Socio socio2 = new Socio();
        socio2.setNombre("Pedro");
        socio2.setApellido("Sa");
        ms.insertar(socio);
        ms.insertar(socio2);
        
       
       ms.borrarSocio(socio,socio2);
        sqlite.apagar();
    }
}
