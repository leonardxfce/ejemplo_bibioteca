/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Vaio
 */
public class ManagerSocio {
    
    Connection conexion;
    String nombreArchivo;
    Statement consulta;
    String protocolo = "jdbc:sqlite:";

    ManagerSocio(String rutaArchivo) {
        this.nombreArchivo = rutaArchivo;
    }
    void insertarSocio() {
        try {
            String sql = "INSERT INTO SOCIOS VALUES(NULL,'Leonardo','Araos')";
            PreparedStatement consulta = conexion.prepareStatement(sql);
          
            consulta.execute();
            consulta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
