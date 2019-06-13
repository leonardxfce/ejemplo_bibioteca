package utilidades;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class paroimparTest {
    @Test
    public void TestimparOparV(){
        paroimpar c = new  paroimpar();
       boolean resultado = c.paroimpar(4);
       boolean esperado = true;
        assertEquals(esperado, resultado); 
        
        
    }

    
}
