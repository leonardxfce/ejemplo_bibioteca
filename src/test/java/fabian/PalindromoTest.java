package fabian;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromoTest {

    @Test
    public void palabraEsPalindromo(){
        Palindromo palindromo = new Palindromo();
        String palabra = "menem";
        boolean resultado = palindromo.verificarSiLaPalabraEsPalindromo(palabra);
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }

    @Test
    public void palabraNoEsPalindromo(){
        Palindromo palindromo = new Palindromo();
        String palabra = "hola";
        boolean resultado = palindromo.verificarSiLaPalabraEsPalindromo(palabra);
        boolean esperado = false;
        assertEquals(resultado, esperado);
    }
}
