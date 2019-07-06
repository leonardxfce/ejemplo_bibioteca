package inicio;

import baseDatos.SQLite;
import modelos.*;

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

        libro.setNombre("Pedro Urdemales");
        libro.setISBN(202);
        ml.insertar(libro);

        Libro x = ml.darUno(100);
        System.out.println(x);

        ManejadorSocio ms = new ManejadorSocio(sqlite);
        ms.crearTabla();
        Socio socio = new Socio();
        socio.setNombre("Pablito");
        socio.setApellido("Clavito");
        socio.setNro(36);
        ms.insertar(socio);

        //
        ml.crearTablaLibro();
        ml.prestarLibro(libro, socio);
        //
        sqlite.apagar();
    }
}
