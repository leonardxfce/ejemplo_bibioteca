package baseDatos;

import java.sql.*;

public class SQLite {

    Connection conexion;
    String nombreArchivo;
    Statement consulta;
    String protocolo = "jdbc:sqlite:";

    public SQLite(String rutaArchivo) {
        this.nombreArchivo = rutaArchivo;
    }

    public SQLite() {

    }

    public void conectar() {
        try {
            conexion = DriverManager.getConnection(protocolo + this.nombreArchivo);
            this.ejecutarMiSQL(" PRAGMA encoding = 'UTF-8'; ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void crearTablaSocio() {
        String sql = " " +
                " CREATE TABLE " +
                " IF NOT EXISTS " +
                " SOCIOS " +
                " ( " +
                " ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " NOMBRE TEXT, " +
                " APELLIDO TEXT " +
                " ) ";
        this.ejecutarMiSQL(sql);
    }


    public void ejecutarMiSQL(String sql) {
        try {
            Statement consulta = conexion.createStatement();
            consulta.execute(sql);
            consulta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet obtenerDatos(String sql) {
        try {
            Statement consulta = conexion.createStatement();
            ResultSet datos = consulta.executeQuery(sql);
            datos.next();
            return datos;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    void insertarSocio() {
        try {
            String sql = "INSERT INTO SOCIOS VALUES(NULL,?,?)";
            PreparedStatement consulta = conexion.prepareStatement(sql);
            consulta.setString(1, "Leoanrdo");
            consulta.setString(2, "ARAOZ");
            consulta.execute();
            consulta.close();
        } catch (SQLException e) {
            e.printStackTrace();
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

    void insertarUnLibro() {
        try {
            consulta = this.conexion.createStatement();
            consulta.execute("INSERT INTO libro VALUES(NULL,'JUAN' ,100)");
            consulta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    void mostrarDatos() {
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

    void borrarDatosDeLaTabla() {
        try {
            consulta = this.conexion.createStatement();
            boolean a = consulta.execute("DELETE FROM libro");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void apagar() {
        try {
            this.conexion.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}