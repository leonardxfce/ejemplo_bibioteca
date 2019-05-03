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
public class NumParTest {
    
    public NumParTest() {
    }
    
    
  
    @Test
    public void SaberSi4EsPar(){
       NumPar x = new NumPar();
       String resultado = x.ElNumeroEs(4);
       String esperado = "par";
       assertEquals(resultado,esperado);
   }
    @Test
    public void SaberSi5EsPar(){
       NumPar x = new NumPar();
       String resultado = x.ElNumeroEs(5);
       String esperado = "impar";
       assertEquals(resultado,esperado);
   }
    
    @Test
    public void SaberSi6EsPar(){
       NumPar x = new NumPar();
       String resultado = x.ElNumeroEs(6);
       String esperado = "par";
       assertEquals(resultado,esperado);
   }
    
    @Test
    public void SaberSi7EsPar(){
       NumPar x = new NumPar();
       String resultado = x.ElNumeroEs(7);
       String esperado = "impar";
       assertEquals(resultado,esperado);
   }
    
    @Test
    public void SaberSi8EsPar(){
       NumPar x = new NumPar();
       String resultado = x.ElNumeroEs(8);
       String esperado = "par";
       assertEquals(resultado,esperado);
   }
    
    @Test
    public void SaberSi10EsPar(){
       NumPar x = new NumPar();
       String resultado = x.ElNumeroEs(10);
       String esperado = "par";
       assertEquals(resultado,esperado);
   }
    
    
    
}
