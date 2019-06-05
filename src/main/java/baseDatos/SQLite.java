package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class SQLite {

    Connection conexion;
    String nombreArchivo;
    Statement statement;
    String protocolo = "jdbc:sqlite:";

    SQLite(String rutaArchivo) {
        this.nombreArchivo = rutaArchivo;
    }

    void conectar() {
        try {
            conexion = DriverManager.getConnection(protocolo + this.nombreArchivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void crearTabla(String tabla) {
        try {
            statement = this.conexion.createStatement();
            statement.execute(tabla);
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void apagar() {
        try {
            this.conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}