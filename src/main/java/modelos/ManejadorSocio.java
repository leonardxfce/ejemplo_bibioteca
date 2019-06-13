
package modelos;

import baseDatos.ManejadorDeArchivos;
import baseDatos.SQLite;

public class ManejadorSocio {
    
    SQLite sqLite;
    ManejadorDeArchivos ma;
    Libro libro;
    
     ManejadorSocio(){
        sqLite = new SQLite();
        ma = new ManejadorDeArchivos();
    }

    void crearTabla(){
        String sql = ma.abrirArchivo("socio.sql");
        sqLite.ejecutarMiSQL(sql);
    }
    
}
