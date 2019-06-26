/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;
/**
 *
 * @author Vaio
 */
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
        sql = sql.replace("APELLIDO", socio.apellido);
        sqLite.ejecutarMiSQL(sql);
    }
       public void borrar(Socio socio){
        String sql = ma.abrirArchivo("borrar_socio.sql");
        sql = sql.replace("NOMBRE", socio.nombre);
        sql = sql.replace("APELLIDO", socio.apellido);
        sqLite.ejecutarMiSQL(sql);
        
       }
       public void modificar (Socio socio){
        String sql = ma.abrirArchivo("actualizar_socio.sql");
        sql = sql.replace("VALOR5", socio.nombre);
        sql = sql.replace("VALOR6", socio.apellido);
        //System.out.println(sql);
        sqLite.ejecutarMiSQL(sql);   
    }
    
    
}
