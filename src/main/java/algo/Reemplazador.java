package algo;

import modelos.Socio;


public class Reemplazador {
    

    String insertarSocioSQL(Socio socio){
        String sql = "INSERT INTO  SOCIO VALUES (NULL, 'NOMBRE', 'APELLIDO', NRO);";
   
        sql = sql.replace("NOMBRE", socio.getNombre());
        sql = sql.replace("APELLIDO",socio.getApellido());
        sql = sql.replace("NRO", Integer.toString(socio.getNro()));
        return sql;
    }
    
    String borrarSocioSQL(Socio socio){
        String sql  = "DELETE FROM SOCIO WHERE NRO = valor1 AND APELLIDO = 'valor2';";
        sql = sql.replace("valor2", socio.getNombre());
        sql = sql.replace("valor1", Integer.toString(socio.getNro()));
        return sql;
    }
    String seleccionarSocioSQL(Socio socio){
        String sql = "SELECT * FROM  SOCIO WHERE NRO = valor4 LIMIT 1;";
        sql = sql.replace("valor4", Integer.toString(socio.getNro()));
         return sql;
    }
     String actualizarSocioSQL(Socio socio){
        String sql = "UPDATE SOCIO SET NOMBRE = 'Leonardo' WHERE NOMBRE = valor6";
        sql = sql.replace("valor6", socio.getNombre());
        return sql;
    }
    

}
