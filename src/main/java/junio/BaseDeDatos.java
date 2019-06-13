package junio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDeDatos {

    String protocolo = "jdbc:sqlite:"; //Enmysql jdbc:mysql:
    String nombreDeLaBD = "pepito.db"; //"localhost/consultorio"

    BaseDeDatos() {
        //DriverManager para obtener la conexion
        try {
            Connection conexion = DriverManager.getConnection(protocolo + nombreDeLaBD);
            //obtener el cuadro para escribir consultas
            Statement consulta = conexion.createStatement();
            String sql = " CREATE TABLE IF NOT EXISTS libros ( \n "
                    + " id INT PRIMARY KEY, \n"
                    + " nombre TEXT \n "
                    + " ); \n";
            consulta.execute(sql);
            consulta.close();
            System.out.println("TABLA CREADA");
            String sql2 = "INSERT INTO libros VALUES(NULL,'Principito')";

            consulta.execute(sql2);
            String sql3 = "SELECT * FROM libros";
            ResultSet tabla = consulta.executeQuery(sql3); //ResulSet =tabla de resultados q muestra //query= "pedir datos" 
            tabla.next();
            int z = tabla.getInt("id"); //pedir a la tabla el objeto q esta en "id"
            System.out.println(z);
            
        } catch (Exception e) {
                e.printStackTrace();
            }
    }

}
