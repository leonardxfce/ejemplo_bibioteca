/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumeroMagicoTest {

    public NumeroMagicoTest() {
    }

    @Test
    public void testCompararSiSonIguales() {
        System.out.println("compararSiSonIguales");
        int numusuario = 4;
        NumeroMagico instance = new NumeroMagico();
        instance.numero = 4;
        String esperado = "ganaste";
        String result = instance.compararSiSonIguales(numusuario);
        assertEquals(esperado, result);
    }

    @Test
    public void testCompararSiEsMenor() {
        System.out.println("compararSiEsMenor");
        int numusuario = 2;
        NumeroMagico instance = new NumeroMagico();
        instance.numero = 4;
        String esperado = "es menor";
        String result = instance.compararSiSonIguales(numusuario);
        assertEquals(esperado, result);
    }

    @Test
    public void testCompararSiEsMayor() {
        System.out.println("compararSiEsMayor");
        int numusuario = 7;
        NumeroMagico instance = new NumeroMagico();
        instance.numero = 4;
        String esperado = "es mayor";
        String result = instance.compararSiSonIguales(numusuario);
        assertEquals(esperado, result);
    }

}
