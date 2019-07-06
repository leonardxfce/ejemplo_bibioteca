package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;

public class ManejadorSocio {

    SQLite sqLite;
    ManejadorDeArchivos ma;
    Socio socio;

    public ManejadorSocio(SQLite sqLite) {
        this.sqLite = sqLite;
        ma = new ManejadorDeArchivos();
    }

    public void crearTabla() {
        String sql = ma.abrirArchivo("tabla_socio.sql");
        sqLite.ejecutarMiSQL(sql);
    }

    public void insertar(Socio socio) {
        String sql = ma.abrirArchivo("nuevo_socio.sql");
        sql = sql.replace("NRO", Integer.toString(socio.nro));
        sql = sql.replace("NOMBRE", socio.nombre);
        sql = sql.replace("APELLIDO", socio.apellido);
        sqLite.ejecutarMiSQL(sql);
    }

}
