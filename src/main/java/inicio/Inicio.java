package inicio;

import baseDatos.SQLite;
import modelos.Libro;
import modelos.ManejadorLibro;
import modelos.ManejadorRegistro;
import modelos.ManejadorSocio;
import modelos.Socio;
import modelos.Registro;

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
        socio.setNro(12);
        ms.insertar(socio);
        
       
        ManejadorRegistro mr = new ManejadorRegistro(sqlite);
        mr.crearTabla();
        Registro registro = new Registro();
        registro.setNro(12);
        registro.setISBN(200);
        registro.setFecha("05/07/2019");
        mr.PrestarUnLibro(registro);
        sqlite.apagar();
    }
}
