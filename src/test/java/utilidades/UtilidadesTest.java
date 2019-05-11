
package utilidades;

import org.junit.Test;
import static org.junit.Assert.*;

public class UtilidadesTest {
    
    @Test
    
    public void testDar4VocalesConLeonardo(){
        Utilidades util = new Utilidades();
        int resultado = util.contarVocalesDe("Leonardo");
        int esperado = 4;
        assertEquals(esperado, resultado);
        
        
    }
    
    
    
    
    
    
}
