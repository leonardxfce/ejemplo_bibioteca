package inicio;

import baseDatos.SQLite;
import modelos.Libro;
import modelos.ManejadorLibro;
import modelos.ManejadorSocio;
import modelos.Prestamo;
import modelos.Registro;
import modelos.Socio;

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
        
        Registro pr = new Registro(sqlite);
        pr.crearTabla();
        Prestamo prestam = new Prestamo();
        socio.setNro(13);
        libro.setISBN(100);
        prestam.setFecha("05/07/1997");
        pr.prestamo(libro,socio,prestam);
        
        sqlite.apagar();
    }
}
