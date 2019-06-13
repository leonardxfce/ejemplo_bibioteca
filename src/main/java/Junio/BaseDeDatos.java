package Junio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {
    String protocolo = "jdbc:sqlite:";
    String nombreDeLaBD = "pepito.db";

    BaseDeDatos() {
        try {
            //DriverManager para obtener la conexion
            Connection conexion = DriverManager.getConnection(protocolo + nombreDeLaBD);
            //Obtener el cuadradito para escribir consultas
            Statement consulta = conexion.createStatement();
            String sql = " CREATE TABLE IF NOT EXISTS libros( \n" +
                    "id INT PRIMARY KEY, \n" +
                    "nombre TEXT \n" +
                    "); \n";
            consulta.execute(sql);
            String sql2 = "INSERT INTO libros VALUES(1,'Principito');";
            consulta.execute(sql2);
            System.out.println("INSERTO UN LIBRO");
        } catch (Exception e) {
            System.out.println("FALLO");
        }
    }
//

    //

    void insertarSocio(){
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(protocolo + nombreDeLaBD);
            Statement consulta = conexion.createStatement();
            consulta.execute("INSERT INTO SOCIOS VALUES('Roberto','Rodriguez')");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void crearTabalSocio(){
        String sql = "" +
                "CREATE TABLE " +
                "IF NOT EXISTS SOCIOS " +
                "( " +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT ," +
                "NOMBRE TEXT ," +
                "APELLIDO TEXT " +
                ") ";
        this.ejecutarMiSQL(sql);
    }

    void ejecutarMiSQL(String sql) {
        try {
            Connection conexion = DriverManager.getConnection(protocolo + nombreDeLaBD);
            Statement consulta = conexion.createStatement();
            consulta.execute(sql);
            consulta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void insertarUnSocio(){

    }
}
