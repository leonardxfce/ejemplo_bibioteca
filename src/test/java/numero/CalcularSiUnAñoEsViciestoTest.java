/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vaio
 */
public class CalcularSiUnAñoEsViciestoTest {
    
    public CalcularSiUnAñoEsViciestoTest() {
    }
    
    

   
  @Test
    public void testDado2010devuelveFalso() {
        CalcularSiUnAñoEsViciesto c = new CalcularSiUnAñoEsViciesto();
        boolean resultado = c.calcular(2010);
        boolean esperado = false;
        assertEquals(esperado, resultado);
    }
@Test
    public void testDado2000devuelveFalso() {
        CalcularSiUnAñoEsViciesto c = new CalcularSiUnAñoEsViciesto();
        boolean resultado = c.calcular(2000);
        boolean esperado = true;
        assertEquals(esperado, resultado);
    }


    @Test
    public void testDado1000devuelveFalse() {
        CalcularSiUnAñoEsViciesto c = new CalcularSiUnAñoEsViciesto();
        boolean resultado = c.calcular(1000);
        boolean esperado = false;
        assertEquals(esperado, resultado);
    }

    
    
}
