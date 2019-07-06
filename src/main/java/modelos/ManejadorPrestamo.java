package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;

public class ManejadorPrestamo {
    SQLite sqLite;
    ManejadorDeArchivos ma;

    public ManejadorPrestamo(SQLite sqLite) {
        this.sqLite = sqLite;
        ma = new ManejadorDeArchivos();
    }

    public void crearTabla() {
        String sql = ma.abrirArchivo("tabla_prestamo.sql");
        sqLite.ejecutarMiSQL(sql);
    }

    public void insertar(Prestamo prestamo) {
        String sql = ma.abrirArchivo("nuevo_prestamo.sql");
        sql=sql.replace("NRO_SOCIO",Integer.toString(prestamo.getNroSocio()));
        sql=sql.replace("ISBN",Integer.toString(prestamo.getISBN()));
        sql=sql.replace("FECHA",prestamo.getFecha());
        sqLite.ejecutarMiSQL(sql);
    }
}
