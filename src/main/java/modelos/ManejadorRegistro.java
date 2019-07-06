package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;

public class ManejadorRegistro {

    SQLite sqLite;
    ManejadorDeArchivos manejador_archivos;
    Libro libro;
    Socio socio;
    Registro registro;

    public ManejadorRegistro(SQLite sqLite) {
        this.sqLite = sqLite;
        manejador_archivos = new ManejadorDeArchivos();
    }

    public void creacionDeRegistro() {
        String sql = manejador_archivos.abrirArchivo("creacionDeTablaRegistro.sql");
        sqLite.ejecutarMiSQL(sql);
    }

    public void insertarUnPrestamoEnElRegistro(Libro libro, Socio socio, Registro registro) {
        String sql = manejador_archivos.abrirArchivo("nuevoRegistro.sql");
        sql = sql.replace("J", String.valueOf(socio.getNro()));
        sql = sql.replace("B", Integer.toString(libro.getISBN()));
        sql = sql.replace("H", String.valueOf(registro.getFecha()));
        sqLite.ejecutarMiSQL(sql);
    }

}
