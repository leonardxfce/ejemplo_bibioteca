package algo;

import modelos.Socio;
import utilidades.ManejadorDeArchivos;

public class Reemplazador {

    String insertarSocioSQL(Socio socio) {
        String sql = "INSERT INTO SOCIO VALUES (NULL, 'NOMBRE', 'APELLIDO', NRO);";
        int nro = socio.getNro();
        sql = sql.replace("NRO", String.valueOf(nro));
        sql = sql.replace("NOMBRE", socio.getNombre());
        sql = sql.replace("APELLIDO", socio.getApellido());
        return sql;
    }

    String borrarSocioSQL(Socio socio) {
        String sql = "DELETE FROM SOCIO WHERE NRO = NUMERO;";
        sql = sql.replace("NUMERO", String.valueOf(socio.getNro()));
        sql = sql.replace("nombre", socio.getNombre());
        sql = sql.replace("apellido", socio.getApellido());
        return sql;
    }

    String modificarSocioSQL(Socio socio){
        String sql = "UPDATE SOCIO SET APELLIDO = 'apellido', NOMBRE = 'nombre' WHERE NRO = numero;";
        sql = sql.replace("numero", String.valueOf(socio.getNro()));
        sql = sql.replace("nombre", socio.getNombre());
        sql = sql.replace("apellido", socio.getApellido());
        return sql;
    }

    String seleccionarSocioSQL(Socio socio){
        String sql = "SELECT * FROM SOCIO WHERE NRO = numero ;";
        sql = sql.replace("numero", String.valueOf(socio.getNro()));
        return sql;
    }
}
