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
        String esperado = "INSERT INTO SOCIO VALUES (NULL, 'Leonardo', 'Araoz', 100);";
        assertEquals(esperado,resultado);
    }
  
    @Test
     public void borrarSocioSQL() {
        Reemplazador re =  new Reemplazador();
        Socio so =  new Socio();     
        so.setApellido("Araoz");
        so.setNombre("Leonardo");
        so.setNro(100);
        String resultado = re.borrarSocioSQL(so);
        String esperado = "DELETE FROM SOCIO WHERE NOMBRE = 'Leonardo' AND APELLIDO = 'Araoz';";
        assertEquals(esperado,resultado);
    }
     @Test
     public void modificarSocioSQL(){
        Reemplazador re =  new Reemplazador();
        Socio so =  new Socio();     
        so.setApellido("Araoz");
        so.setNombre("Leonardo");
        so.setNro(100);
        String resultado = re.modificarSocioSQL(so);
        String esperado = "UPDATE SOCIO SET NOMBRE = 'Leonardo' WHERE APELLIDO = 'Araoz';";
        assertEquals(esperado,resultado);
     }
     @Test
         public void seleccionarSocioSQL(){
        Reemplazador re =  new Reemplazador();
        Socio so =  new Socio();     
        so.setApellido("Araoz");
        so.setNombre("Leonardo");
        so.setNro(100);
        String resultado = re.seleccionarSocioSQL(so);
        String esperado = "SELECT FROM SOCIO WHERE NOMBRE = 'Leonardo' AND APELLIDO = 'Araoz';";
        assertEquals(esperado,resultado);
     }
     
}