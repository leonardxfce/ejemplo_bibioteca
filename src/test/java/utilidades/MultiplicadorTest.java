package utilidades;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicadorTest {
    @Test
    public void testMultiplicador(){
      Multiplicador c = new Multiplicador();
        boolean resultado = c.Multiplicador(0);
        boolean esperado = true;
        assertEquals(esperado, resultado);
    }
}
