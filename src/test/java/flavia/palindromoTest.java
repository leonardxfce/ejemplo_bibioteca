/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flavia;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leonardlxde
 */
public class palindromoTest {
    
    public palindromoTest() {
    }
    
   

    
    @Test
    public void testPalindromo1() {
        System.out.println("palindromo1");
        String palabra = "ana";
        palindromo instance = new palindromo();
        boolean expResult = true;
        boolean result = instance.palindromo(palabra);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testPalindromo2() {
        System.out.println("palindromo2");
        String palabra = "neuquen";
        palindromo instance = new palindromo();
        boolean expResult = true;
        boolean result = instance.palindromo(palabra);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testPalindromo3() {
        System.out.println("palindromo2");
        String palabra = "menem";
        palindromo instance = new palindromo();
        boolean expResult = true;
        boolean result = instance.palindromo(palabra);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testPalindromo4() {
        System.out.println("palindromo4");
        String palabra = "juan";
        palindromo instance = new palindromo();
        boolean expResult = false;
        boolean result = instance.palindromo(palabra);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testPalindromo5() {
        System.out.println("palindromo4");
        String palabra = "    ";
        palindromo instance = new palindromo();
        boolean expResult = true;
        boolean result = instance.palindromo(palabra);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testPalindromo6() {
        System.out.println("palindromo4");
        String palabra = "          ";
        palindromo instance = new palindromo();
        boolean expResult = true;
        boolean result = instance.palindromo(palabra);
        assertEquals(expResult, result);
        
    }
    
}
