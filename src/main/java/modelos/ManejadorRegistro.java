
package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;

public class ManejadorRegistro {
    SQLite sqLite;
    ManejadorDeArchivos ma;
    Registro registro;
    public ManejadorRegistro(SQLite sqLite) {
        this.sqLite = sqLite;
        ma = new ManejadorDeArchivos();
    }
     public void crearTabla() {
        String sql = ma.abrirArchivo("registro.sql");
         sqLite.ejecutarMiSQL(sql);
         //System.out.println(sql);
    }

    public void PrestarUnLibro(Registro registro) {
        String sql = ma.abrirArchivo("prestar_un_libro.sql");
        sql = sql.replace("nro", Integer.toString(registro.nro));
        sql = sql.replace("ISBN", Integer.toString(registro.ISBN));
        sql = sql.replace("fecha", registro.fecha);
  
        
        sqLite.ejecutarMiSQL(sql);
        
        //
       //System.out.println(sql);
    }

  
    
}
