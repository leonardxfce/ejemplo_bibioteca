package inicio;

import baseDatos.SQLite;
import modelos.Libro;
import modelos.ManejadorLibro;
import modelos.ManejadorSocio;
import modelos.Socio;

public class Inicio {
    public static void main(String[] args) {
        SQLite sqlite = new SQLite("ejemplo.db");
        sqlite.conectar();
        ManejadorLibro ml = new ManejadorLibro(sqlite);
        ml.crearTabla();
        Libro libro = new Libro();
        libro.setNombre("100 años de soledad");
        libro.setISBN(1);
        ml.insertar(libro);

        libro.setNombre("Pedro Urdemales");
        libro.setISBN(2);
        ml.insertar(libro);

        Libro x = ml.darUno(1);
        System.out.println(x);

        ManejadorSocio ms = new ManejadorSocio(sqlite);
        ms.crearTabla();
        Socio socio = new Socio();
        socio.setNombre("Pablito");
        socio.setApellido("Clavito");
        socio.setNro(1);
        ms.insertar(socio);
        
        socio.setNombre("Flavia");
        socio.setApellido("Gregorio");
        socio.setNro(2);
        ms.insertar(socio);
        
        Socio ResultDeSocio = ms.darUno(1);
        System.out.println(ResultDeSocio);


        sqlite.apagar();
    }
}
