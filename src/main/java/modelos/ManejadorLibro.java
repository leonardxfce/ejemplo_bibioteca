package modelos;

import utilidades.ManejadorDeArchivos;
import baseDatos.SQLite;

public class ManejadorLibro {

    SQLite sqLite;
    ManejadorDeArchivos ma;
    Libro libro;

    ManejadorLibro(){
        sqLite = new SQLite();
        ma = new ManejadorDeArchivos();
    }

    void crearTabla(){
        String sql = ma.abrirArchivo("libro.sql");
        sqLite.ejecutarMiSQL(sql);
    }
}
