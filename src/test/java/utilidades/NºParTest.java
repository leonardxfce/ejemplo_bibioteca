
package utilidades;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NºParTest {
    
    
    @Test
    public void testDa4DevuelvePar(){
    
    NºPar nro = new NºPar();
    String resultado = nro.VerParidad(4);
    String esperado = "par";
    assertEquals(resultado, esperado);
    
    } 
    @Test
    public void testDa3DevuelvePar(){
    
    NºPar nro = new NºPar();
    String resultado = nro.VerParidad(3);
    String esperado = "impar";
    assertEquals(resultado, esperado);
    
}
    
        @Test
    public void testDaMenos1DevuelvePar(){
    
    NºPar nro = new NºPar();
    String resultado = nro.VerParidad(-1);
    String esperado = "impar";
    assertEquals(resultado, esperado);
    
}
}    
    
    

