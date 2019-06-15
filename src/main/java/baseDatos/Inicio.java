package baseDatos;

import modelos.Libro;
import modelos.ManejadorLibro;
import modelos.ManejadorSocio;
import modelos.Socio;

public class Inicio {
    public static void main(String[] args) {
        /*ManejadorLibro mLibro = new ManejadorLibro();
        mLibro.crearTabla();

        Libro librito = new Libro();
        librito.setISBN(1000);
        librito.setNombre("PepitoHurdeMales");

        mLibro.insertarLibro(librito);*/

        ManejadorSocio mSocio = new ManejadorSocio();
        mSocio.crearTabla();

        Socio socio = new Socio();
        socio.setNombre("Fabian");
        socio.setApellido("Maysen");

        mSocio.insertarSocio(socio);
    }
}
