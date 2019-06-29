package algo;

import modelos.Socio;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReemplazadorTest {

    @Test
    public void insertarSocioSQL() {
        Reemplazador re = new Reemplazador();
        Socio so = new Socio();
        so.setApellido("Araoz");
        so.setNombre("Leonardo");
        so.setNro(100);
        String resultado = re.insertarSocioSQL(so);
        String esperado = "INSERT INTO SOCIO VALUES (NULL, 'Leonardo', 'Araoz', 100);";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testSeleccionarSocioSQL() {
        Reemplazador re = new Reemplazador();
        String resultado = re.seleccionarSocioSQL(100);
        String esperado = "SELECT * FROM SOCIO WHERE NRO = 100 LIMIT 1;";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testModificarSocioSQL() {
        Reemplazador re = new Reemplazador();
        String resultado = re.modificarSocioSQL(100);
        String esperado = "UPDATE SOCIO SET NOMBRE = 'Pedro' WHERE NRO = 100;";
        assertEquals(esperado, resultado);
    }

    @Test
    public void testEliminarSocioSQL() {
        Reemplazador re = new Reemplazador();
        String resultado = re.eliminarSocioSQL(100);
        String esperado = "DELETE FROM SOCIO WHERE NRO = 100";
        assertEquals(esperado, resultado);
    }
}