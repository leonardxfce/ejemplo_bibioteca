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

        Prestamo prestamo = new Prestamo();
        prestamo.setNroSocio(11);
        prestamo.setISBN(300);
        prestamo.setFecha("05/07/2019");
        ManejadorPrestamo mp = new ManejadorPrestamo(sqlite);
        mp.crearTabla();
        mp.insertar(prestamo);

        sqlite.apagar();
    }
}
