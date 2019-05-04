package Lisa;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromoTest {
    @Test
    public void testDevuelveTrueParaAna() {
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.verificacion("ANA");
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testDevuelveFalseParaLisa() {
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.verificacion("LISA");
        boolean esperado = false;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testDevuelveFalseParaVacio() {
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.verificacion("");
        boolean esperado = false;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testDevuelveTrueParaAa() {
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.verificacion("AA");
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testDevuelveFalseParaA() {
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.verificacion("A");
        boolean esperado = false;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testDevuelveFalseParaAnanaConMayusMinus() {
        Palindromo palindromo = new Palindromo();
        boolean resultado = palindromo.verificacion("ANanA");
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }
}