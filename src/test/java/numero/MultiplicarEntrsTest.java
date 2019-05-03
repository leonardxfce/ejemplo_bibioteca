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
public class MultiplicarEntrsTest {
    
   
    
   
    @Test
    public void testMultilicarEnterosPositivosYNegativos4_5() {
        System.out.println("MultilicarEnterosPositivosYNegativos");
        int num1 = 4;
        int num2 = 5;
        MultiplicarEntrs instance = new MultiplicarEntrs();
        int expResult = 20;
        int result = instance.MultilicarEnterosPositivosYNegativos(num1, num2);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testMultilicarEnterosPositivosYNegativosmenos4_5() {
        System.out.println("MultilicarEnterosPositivosYNegativos");
        int num1 = -4;
        int num2 = 5;
        MultiplicarEntrs instance = new MultiplicarEntrs();
        int expResult = -20;
        int result = instance.MultilicarEnterosPositivosYNegativos(num1, num2);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testMultilicarEnterosPositivosYNegativosmenos_negativos4_5() {
        System.out.println("MultilicarEnterosPositivosYNegativos");
        int num1 = -4;
        int num2 = -5;
        MultiplicarEntrs instance = new MultiplicarEntrs();
        int expResult = 20;
        int result = instance.MultilicarEnterosPositivosYNegativos(num1, num2);
        assertEquals(expResult, result);
       
    }
   
     @Test
    public void testMultilicarEnterosPositivosYNegativosmenos_negativos0() {
        System.out.println("MultilicarEnterosPositivosYNegativos");
        int num1 = 0;
        int num2 = 0;
        MultiplicarEntrs instance = new MultiplicarEntrs();
        int expResult = 0;
        int result = instance.MultilicarEnterosPositivosYNegativos(num1, num2);
        assertEquals(expResult, result);
       
    }
}
