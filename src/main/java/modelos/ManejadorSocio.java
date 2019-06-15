
package modelos;

import baseDatos.ManejadorDeArchivos;
import baseDatos.SQLite;

public class ManejadorSocio {
    
    SQLite sqLite;
    ManejadorDeArchivos ma;
    Socio socio;
    
     public ManejadorSocio(){
        sqLite = new SQLite("BaseDatos.db");
        ma = new ManejadorDeArchivos();
         sqLite.conectar();


    }

    public void crearTabla(){
        String sql = ma.abrirArchivo("socio.sql");
        sqLite.ejecutarMiSQL(sql);
        
    }
        public void insertarSocio(Socio socio){
        String nombre = socio.nombre;
        String apellido = socio.apellido;
          String sql = "INSERT INTO socio " +
                " VALUES (NULL," + 
                "'" + nombre + "'," +
                "'" + apellido + "'" +
                ")";
          
         //   System.out.println(sql);
        sqLite.ejecutarMiSQL(sql);
}
}