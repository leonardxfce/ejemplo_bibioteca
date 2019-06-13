
package utilidades;
import static org.junit.Assert.*;
import org.junit.Test;

public class UtilidadTest {
    @Test

        public void testDar3VocalesConFABIAN(){
        Utilidad util = new Utilidad();
        int resultado = util.contarVocalesDe("FABIAN");
        int esperado = 3;
        assertEquals(esperado,resultado);
    }
}
