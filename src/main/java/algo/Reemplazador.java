package algo;

import modelos.Socio;

public class Reemplazador {

    String insertarSocioSQL(Socio socio) {
        String sql = "INSERT INTO SOCIO VALUES (NULL, 'NOMBRE', 'APELLIDO', NRO);";
        sql = sql.replace("NRO", Integer.toString(socio.getNro()));
        sql = sql.replace("NOMBRE", socio.getNombre());
        sql = sql.replace("APELLIDO", socio.getApellido());
        return sql;
    }

    public String seleccionarSocioSQL(int numero) {
        String sql = "SELECT * FROM SOCIO WHERE NRO = NUMERO LIMIT 1;";
        sql = sql.replace("NUMERO", Integer.toString(numero));
        return sql;
    }

    public String modificarSocioSQL(int numero) {
        String sql = "UPDATE SOCIO SET NOMBRE = 'Pedro' WHERE NRO = NUMERO;";
        sql = sql.replace("NUMERO", Integer.toString(numero));
        return sql;
    }

    public String eliminarSocioSQL(int numero) {
        String sql = "DELETE FROM SOCIO WHERE NRO = NUMERO";
        sql = sql.replace("NUMERO", Integer.toString(numero));
        return sql;
    }
}
