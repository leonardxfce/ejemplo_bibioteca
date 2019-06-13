package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ManagerSocio {
       Statement consulta;
    Connection conexion;
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
}
