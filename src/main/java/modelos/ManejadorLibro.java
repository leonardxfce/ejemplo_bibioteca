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
        String sql = ma.abrirArchivo("tabla_libro.sql");
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

    public void prestarLibro(Libro libro, Socio socio){
        LibroPrestado libroPrestado = new LibroPrestado();
        libroPrestado.setFecha("13/06/2019");
        String sql = ma.abrirArchivo("libro_prestar.sql");
        sql = sql.replace("nroSocio", Integer.toString(socio.nro));
        sql = sql.replace("ISBN", Integer.toString(libro.ISBN));
        sql = sql.replace("fecha", libroPrestado.fecha);
        //System.out.println(sql);
        sqLite.ejecutarMiSQL(sql);
    }

    public void crearTablaLibro() {
        String sql = ma.abrirArchivo("tabla_prestarlibro.sql");
        sqLite.ejecutarMiSQL(sql);
    }
}
