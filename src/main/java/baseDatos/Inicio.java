package baseDatos;

import modelos.Libro;
import modelos.ManejadorLibro;
import modelos.ManejadorSocio;
import modelos.Socio;

public class Inicio {

    public static void main(String[] args) {

        ManejadorLibro miLibro = new ManejadorLibro();
        miLibro.crearTabla();
        Libro librito = new Libro();
        librito.setISBN(1000);
        librito.setNombre("PepitoHurdeMales");
        miLibro.insertarLibro(librito);
        
        ManejadorSocio miSocio = new ManejadorSocio();
        miSocio.crearTabla();
        Socio sc = new Socio();
        sc.setNombre("Laura");
        sc.setApellido("Garcia");
        miSocio.insertarSocio(sc);

    }
}
