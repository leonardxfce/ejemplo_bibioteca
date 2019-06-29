package algo;

import modelos.Socio;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReemplazadorTest {

    @Test
    public void insertarSocioSQL() {
        Reemplazador re =  new Reemplazador();
        Socio so =  new Socio();
        so.setApellido("Araoz");
        so.setNombre("Leonardo");
        so.setNro(100);
        String resultado = re.insertarSocioSQL(so);
        String esperado = "INSERT INTO  SOCIO VALUES (NULL, 'Leonardo', 'Araoz', 100);";
        assertEquals(esperado,resultado);
    }
    @Test
     
    public void borrarSocioSQL() {
        Reemplazador re =  new Reemplazador();
        Socio so =  new Socio();
        so.setNombre("Leonarño");
        so.setNro(100);
        String resultado = re.borrarSocioSQL(so);
        String esperado = "DELETE FROM SOCIO WHERE NRO = 100 AND APELLIDO = 'Leonarño';";
        assertEquals(esperado,resultado);
    }
     @Test
     
    public void seleccionarSocioSQL() {
        Reemplazador re =  new Reemplazador();
        Socio so =  new Socio();
        so.setNro(10);
        String resultado = re.seleccionarSocioSQL(so);
        String esperado ="SELECT * FROM  SOCIO WHERE NRO = 10 LIMIT 1;" ;
        assertEquals(esperado,resultado);
    }
     public void actualizarSocioSQL() {
        Reemplazador re =  new Reemplazador();
        Socio so =  new Socio();
        so.setNombre("Flavia");
        String resultado = re.actualizarSocioSQL(so);
        String esperado ="UPDATE SOCIO SET NOMBRE = 'Leonardo' WHERE NOMBRE = 'Flavia';";
        assertEquals(esperado,resultado);
    }
}