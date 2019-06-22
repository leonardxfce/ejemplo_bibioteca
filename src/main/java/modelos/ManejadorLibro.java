package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;

public class ManejadorLibro {

    SQLite sqLite;
    ManejadorDeArchivos ma;
    Libro libro;

    public ManejadorLibro(SQLite sqLite) {
        this.sqLite = sqLite;
        ma = new ManejadorDeArchivos();
    }

    public void crearTabla() {
        String sql = ma.abrirArchivo("libro.sql");
        sqLite.ejecutarMiSQL(sql);
    }

    public void insertar(Libro libro) {
        String sql = ma.abrirArchivo("nuevo_libro.sql");
        sql = sql.replace("NOMBRE", libro.nombre);
        sql = sql.replace("ISBN", Integer.toString(libro.ISBN));
      
        sqLite.ejecutarMiSQL(sql);
    }
}
