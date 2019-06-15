package modelos;

import baseDatos.ManejadorDeArchivos;
import baseDatos.SQLite;

public class ManejadorSocio {

    SQLite sqLite;
    ManejadorDeArchivos so;
    Socio Socio;

    ManejadorSocio() {
        sqLite = new SQLite();
        so = new ManejadorDeArchivos();
    }

    void crearTabla() {
        String sql = so.abrirArchivo("socio.sql");
        sqLite.ejecutarMiSQL(sql);
    }
}
