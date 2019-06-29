package algo;

import modelos.Socio;

public class Reemplazador {

    public String insertarSocioSQL(Socio socio) {
        String sql = "INSERT INTO SOCIO VALUES (NULL, 'Q', '#', P);";
        sql = sql.replace("Q", socio.getNombre());
        sql = sql.replace("#", socio.getApellido());
        sql = sql.replace("P", Integer.toString(socio.getNro()));

        return sql;
    }

    public String borrarSocioSQL(Socio socio) {
        String sql = "DELETE FROM SOCIO WHERE NRO='X' AND APELLIDO='#'";
        sql = sql.replace("#", socio.getApellido());
        sql = sql.replace("X", Integer.toString(socio.getNro()));
        return sql;
    }

    public String seleccionarSocioSQL(Socio socio) {
        String sql = "SELECT * FROM SOCIO WHERE NRO='X';";
        sql = sql.replace("X", Integer.toString(socio.getNro()));
        return sql;
    }
      public String modificarSocioSQL(Socio socio) {
        String sql = "UPDATE SOCIO SET NOMBRE='Q' WHERE NRO='X';";
        sql = sql.replace("Q", socio.getNombre());
        sql = sql.replace("X", Integer.toString(socio.getNro()));
        return sql;
    }
}
