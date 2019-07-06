package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;

import java.sql.ResultSet;
import java.sql.SQLException;

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
        //System.out.println(sql);
        sqLite.ejecutarMiSQL(sql);
    }

    public void insertar(Libro libro) {
        String sql = ma.abrirArchivo("nuevo_libro.sql");
        sql = sql.replace("NOMBRE", libro.nombre);
        sql = sql.replace("ISBN", Integer.toString(libro.ISBN));
        sqLite.ejecutarMiSQL(sql);
    }

    public Libro darUno(int ISBN) {
        String sql = ma.abrirArchivo("libro_por_isbn.sql");
        sql = sql.replace("ID", Integer.toString(ISBN));
        ResultSet datos = sqLite.obtenerDatos(sql);
        libro = new Libro();
        try {
            libro.setNombre((String) datos.getObject("nombre"));
            libro.setISBN((Integer) datos.getObject("ISBN"));
            return libro;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
