package inicio;

import baseDatos.SQLite;
import modelos.Libro;
import modelos.ManejadorLibro;

public class Inicio {
    public static void main(String[] args) {
        SQLite sqlite = new SQLite("ejemplo.sqlite");
        sqlite.conectar();
        ManejadorLibro ml = new ManejadorLibro(sqlite);
        ml.crearTabla();
        Libro libro = new Libro();
        libro.setNombre("100 años de soledad");
        libro.setISBN(100);
        ml.insertar(libro);
        sqlite.apagar();
    }
}
