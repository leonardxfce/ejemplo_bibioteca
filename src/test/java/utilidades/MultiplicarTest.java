
package utilidades;

import org.junit.Test;

import static org.junit.Assert.*;
public class MultiplicarTest {
    
     @Test
    
    public void test1VerResultados (){
        
        Multiplicar m = new Multiplicar ();
        
        int resultado = m.MultiplicarPyN(4,5);
        int esperado = (20);
        assertEquals(resultado, esperado);
        
        
    }
    
         @Test
    
    public void test2VerResultados (){
        
        Multiplicar m = new Multiplicar ();
        
        int resultado = m.MultiplicarPyN(-4,5);
        int esperado = (-20);
        assertEquals(resultado, esperado);
        
        
}    
        public void test3VerResultados (){
        
        Multiplicar m = new Multiplicar ();
        
        int resultado = m.MultiplicarPyN(-4,-5);
        int esperado = (20);
        assertEquals(resultado, esperado);
        
        
}
            
        public void test4VerResultados (){
        
        Multiplicar m = new Multiplicar ();
        
        int resultado = m.MultiplicarPyN(0,0);
        int esperado = (0);
        assertEquals(resultado, esperado);
        
        
}
}
