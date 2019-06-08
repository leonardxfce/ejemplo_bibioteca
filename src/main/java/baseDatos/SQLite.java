package baseDatos;

import java.sql.*;

class SQLite {

    Connection conexion;
    String nombreArchivo;
    Statement consulta;
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

    // en SQL viene el codigo para crear la tabla
    void crearTabla(String sql) {
        try {
            consulta = this.conexion.createStatement();
            consulta.execute(sql);
            consulta.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void insertarUnLibro(){
        try {
            consulta = this.conexion.createStatement();
            consulta.execute("INSERT INTO libro VALUES(NULL,'JUAN' ,100)");
            consulta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void mostrarDatos(){
        try {
            consulta = this.conexion.createStatement();
            ResultSet tabla = consulta.executeQuery("SELECT * FROM libro");
            tabla.next();
            System.out.println(tabla.getInt("id"));
            System.out.println(tabla.getString("nombre"));
            System.out.println(tabla.getInt("ISBN"));
            tabla.close();
            consulta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void borrarDatosDeLaTabla(){
        try {
            consulta = this.conexion.createStatement();
            boolean a = consulta.execute("DELETE FROM libro");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void apagar() {
        try {
            this.conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Cuando manejamos elementos
    // externos al codigo: BD, servidores, UI
    // es muy dificil hacer test
    // unitario => integracion => acceptacion
}