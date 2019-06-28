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
}