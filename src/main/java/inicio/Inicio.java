package inicio;

import baseDatos.SQLite;
import modelos.Libro;
import modelos.Prestamos;
import modelos.ManejadorLibro;
import modelos.ManejadorSocio;
import modelos.ManejadorPrestamos;
import modelos.Socio;

public class Inicio {
    public static void main(String[] args) {
        SQLite sqlite = new SQLite("ejemplo4.db");
        sqlite.conectar();
        ManejadorLibro ml = new ManejadorLibro(sqlite);
        ml.crearTabla();
        Libro libro = new Libro();
        libro.setNombre("100 años de soledad");
        libro.setISBN(100);
        ml.insertar(libro);

        libro.setNombre("Pedro Urdemales");
        libro.setISBN(200);
        ml.insertar(libro);

        Libro x = ml.darUno(100);
        System.out.println(x);

        ManejadorSocio ms = new ManejadorSocio(sqlite);
        ms.crearTabla();
        Socio socio = new Socio();
        socio.setNombre("Pablito");
        socio.setApellido("Clavito");
        ms.insertar(socio);

        ManejadorPrestamos pr = new ManejadorPrestamos(sqlite);
        pr.crearTabla();
        Prestamos prestamos = new Prestamos();
        prestamos.setFecha("05/07/2019");
        pr.insertar(libro,socio,prestamos);
        sqlite.apagar();
    }
}
