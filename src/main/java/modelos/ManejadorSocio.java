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
        String sql = ma.abrirArchivo("socio.sql");
        sqLite.ejecutarMiSQL(sql);
    }

    public void insertar(Socio socio) {
        String sql = ma.abrirArchivo("nuevo_socio.sql");
        sql = sql.replace("NOMBRE", socio.nombre);
        sql = sql.replace("APELLIDO",socio.apellido);
        sql = sql.replace("nro",Integer.toString(socio.nro));

        sqLite.ejecutarMiSQL(sql);
    }

}
