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
public class NumeroBinarioTest {
    
    public NumeroBinarioTest() {
    }
    
  
    @Test
    public void testTransformarEntero2ABinario() {
        System.out.println("transformarEntero2_ABinario");
        int decimal = 2;
        NumeroBinario instance = new NumeroBinario();
        String resultado = instance.transformarEnteroABinario(decimal);
        String esperado = "10";
        assertEquals(esperado, resultado);
      
     
    }
     @Test
    public void testTransformarEntero4ABinario() {
        System.out.println("transformarEntero4_ABinario");
        int decimal = 4;
        NumeroBinario instance = new NumeroBinario();
        String resultado = instance.transformarEnteroABinario(decimal);
        String esperado = "100";
        assertEquals(esperado, resultado);
      
     
    }
     @Test
    public void testTransformarEntero8ABinario() {
        System.out.println("transformarEntero8_ABinario");
        int decimal = 8;
        NumeroBinario instance = new NumeroBinario();
        String resultado = instance.transformarEnteroABinario(decimal);
        String esperado = "1000";
        assertEquals(esperado, resultado);
      
     
    }
     @Test
    public void testTransformarEntero10ABinario() {
        System.out.println("transformarEntero10_ABinario");
        int decimal = 10;
        NumeroBinario instance = new NumeroBinario();
        String resultado = instance.transformarEnteroABinario(decimal);
        String esperado = "1010";
        assertEquals(esperado, resultado);
      
     
    }
     @Test
    public void testTransformarEntero7ABinario() {
        System.out.println("transformarEntero7_ABinario");
        int decimal = 7;
        NumeroBinario instance = new NumeroBinario();
        String resultado = instance.transformarEnteroABinario(decimal);
        String esperado = "111";
        assertEquals(esperado, resultado);
      
     
    }
    
}
