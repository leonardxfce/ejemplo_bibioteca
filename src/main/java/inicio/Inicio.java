package inicio;

import baseDatos.SQLite;
import modelos.Libro;
import modelos.ManejadorRegistro;
import modelos.Registro;
import modelos.Socio;

public class Inicio {

    public static void main(String[] args) {
        SQLite sqlite = new SQLite("ejemplo.db");
        sqlite.conectar();

        ManejadorRegistro manejadorDelRegistro = new ManejadorRegistro(sqlite);
        Registro registro = new Registro();
        Socio socio = new Socio();
        Libro libro = new Libro();
        manejadorDelRegistro.creacionDeRegistro();
        socio.setNro(23);
        libro.setISBN(100);
        registro.setFecha("13/06/2019"); 
        manejadorDelRegistro.insertarUnPrestamoEnElRegistro(libro, socio, registro);
        
        socio.setNro(87);
        libro.setISBN(250);
        registro.setFecha("14/06/2019"); 
        manejadorDelRegistro.insertarUnPrestamoEnElRegistro(libro, socio, registro);
        sqlite.apagar();
    }
}
