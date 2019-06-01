package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLite {

    Connection conexion;
    String nombreArchivo;
    Statement statement;

    public SQLite(String rutaArchivo) {
        this.nombreArchivo = rutaArchivo;
    }

    public void conectar() {
        try {
            conexion = DriverManager.getConnection(this.nombreArchivo);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void crearTabla(String tabla) {
        try {
            statement = this.conexion.createStatement();
            statement.execute(tabla);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void apagar(){
        try {
            this.conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}