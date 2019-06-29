package algo;

import modelos.Socio;

public class Reemplazador {

    String insertarSocioSQL(Socio socio){
        String sql ="INSERT INTO SOCIO VALUES (NULL, 'Leonardo', 'Araoz', 100);";
        sql = sql.replace("NRO", Integer.toString(socio.nro));
        sql = sql.replace("NOMBRE", socio.nombre);
        sql = sql.replace("APELLIDO",socio.apellido);        
        return sql;
        
    }
    String borrarSocioSQL(Socio socio){
        String sql = "DELETE FROM SOCIO WHERE NOMBRE = 'NOMBRE2' AND APELLIDO = 'APELLIDO2';";
        sql = sql.replace("NRO", Integer.toString(socio.nro));
        sql = sql.replace("NOMBRE2", socio.nombre);
        sql = sql.replace("APELLIDO2",socio.apellido);
        
        return sql;
    }
    String modificarSocioSQL(Socio socio){
        String sql = "UPDATE SOCIO SET NOMBRE = 'NOMBRE2' WHERE APELLIDO = 'APELLIDO2';";
        sql = sql.replace("NRO", Integer.toString(socio.nro));
        sql = sql.replace("NOMBRE2", socio.nombre);
        sql = sql.replace("APELLIDO2",socio.apellido);
        return sql;
    }
      String seleccionarSocioSQL(Socio socio){
        String sql = "SELECT FROM SOCIO WHERE NOMBRE = 'NOMBRE2' AND APELLIDO = 'APELLIDO2';";
        sql = sql.replace("NRO", Integer.toString(socio.nro));
        sql = sql.replace("NOMBRE2", socio.nombre);
        sql = sql.replace("APELLIDO2",socio.apellido);
        return sql;
    }
}
