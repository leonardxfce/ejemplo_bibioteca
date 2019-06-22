package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;

public class ManejadorSocio {

    SQLite sqLite;
    ManejadorDeArchivos ms;
    Socio socio;

    public ManejadorSocio(SQLite sqLite) {
        this.sqLite = sqLite;
        ms = new ManejadorDeArchivos();
    }

    public void crearTabla() {
        String sql = ms.abrirArchivo("socio.sql");
        sqLite.ejecutarMiSQL(sql);
    }

    public void insertar(Socio socio) {
        String sql = ms.abrirArchivo("nuevo_socio.sql");
        sql = sql.replace("NOMBRE", socio.nombre);
        sql = sql.replace("APELLIDO", socio.apellido);
        sqLite.ejecutarMiSQL(sql);
        
    }

}
