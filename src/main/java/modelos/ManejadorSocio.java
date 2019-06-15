/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import baseDatos.ManejadorDeArchivos;
import baseDatos.SQLite;

/**
 *
 * @author Vaio
 */
public class ManejadorSocio {
    SQLite sqLite;
    ManejadorDeArchivos ma;
    Libro libro;

    public ManejadorSocio(){
        sqLite = new SQLite();
        ma = new ManejadorDeArchivos();
        sqLite.conectar();
        
        
    }

     public void crearTabla(){
        String sql = ma.abrirArchivo("socio.sql");
        sqLite.ejecutarMiSQL(sql);
    }
    
      public void insertarSocio (Socio socio){
        String nombre = socio.nombre;
        String apellido = socio.apellido;
        String sql = "INSERT INTO socio "+
                "VALUES (NULL,"+
                "'"+nombre+"',"+""+apellido+" "+");";
        
        sqLite.ejecutarMiSQL(sql);
                
                
    }
    
}
