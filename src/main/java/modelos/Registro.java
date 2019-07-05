package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;

public class Registro {
    SQLite sqLite;
    ManejadorDeArchivos ma;
    Socio socio;
    Libro libro;

    public Registro(SQLite sqLite) {
        this.sqLite = sqLite;
        ma = new ManejadorDeArchivos();
    }
    public void crearTabla() {
        String sql = ma.abrirArchivo("tabla_Prestar_Libro.sql");
        sqLite.ejecutarMiSQL(sql);
    }   
    public void prestamo(Libro libro, Socio socio, Prestamo prestam) {
        String sql = ma.abrirArchivo("nuevo_Prestamo_Libro.sql");
        sql = sql.replace("NRO", Integer.toString(socio.nro));
        sql = sql.replace("ISBN", Integer.toString(libro.ISBN));
        sql = sql.replace("FECHA", prestam.fecha);
        sqLite.ejecutarMiSQL(sql);
    }
}
