/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junio;

import java.sql.DriverManager;
import java.sql.Connection;

import java.sql.Statement;

/**
 * +
 *
 * @author Vaio
 */
public class BaseDeDatos {

    String protocolo = "jdbc:sqlite:";
    String nombreDeLaDB = "juanito.db";
    //cuando manejamos

    BaseDeDatos() {
        //driver para obtener la coneccion
        try {
            Connection conexion = DriverManager.getConnection(protocolo + nombreDeLaDB);
            //obtener el cuadradito para obtene consultas
            Statement consulta = conexion.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS libros (\n"
                    + "id int PRIMARY KEY, \n"
                    + "nombre TEXT \n"
                    + ");\n";
            consulta.execute(sql);
            String sql2 = "INSERT INTO libros VALUES(1,'Principito')";
            consulta.execute(sql2);

        
            System.out.println("INSERTO UN LIBRO");
            System.out.println("Fallo");
            consulta.execute(sql2);
            String sql3 = "SELECT * FROM libros";
           
        } catch (Exception e) {
            
        }
    }

}
