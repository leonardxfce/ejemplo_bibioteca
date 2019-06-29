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
        libro.setISBN(200);
        ml.insertar(libro);

        libro.setNombre("Mr Pickles");
        libro.setISBN(300);
        ml.insertar(libro);

        Libro x = ml.darUno(300);
        System.out.println(x);

        ManejadorSocio ms = new ManejadorSocio(sqlite);
        ms.crearTabla();
        Socio socio = new Socio();
        socio.setNombre("Percebe");
        socio.setApellido("Papa");
        socio.setNro(1);
        ms.insertar(socio);
        Socio z = ms.darUno(1);
        System.out.println(z);
        

        sqlite.apagar();
    }
}
