package baseDatos;

import modelos.Libro;
import modelos.Socio;
import modelos.ManejadorLibro;
import modelos.ManejadorSocio;

public class Inicio {

    public static void main(String[] args) {

        ManejadorDeArchivos ma = new ManejadorDeArchivos();
        String sqlDeTablaLibro = ma.abrirArchivo("libro.sql");
        ManejadorLibro mLibro = new ManejadorLibro();
        mLibro.crearTabla();
        Libro librito = new Libro();
        librito.setISBN(1000);
        librito.setNombre("PepitoHurdeMales");
        mLibro.insertarLibro(librito);

        ManejadorDeArchivos socios = new ManejadorDeArchivos();
        String sqlDeTablaSocio = socios.abrirArchivo("socio.sql");
        ManejadorSocio mSocio = new ManejadorSocio();
        mSocio.crearTabla();
        Socio Nsocios = new Socio();
        Nsocios.setNombre("Flavia");
        Nsocios.setApellido("Gregorio");
        

    }
}
