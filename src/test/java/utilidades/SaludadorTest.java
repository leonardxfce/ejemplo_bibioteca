package utilidades;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaludadorTest {

    @Test
    public void testDeberiaDecirElNombreYBuenosDias() {
        Saludador s = new Saludador("Leonardo");
        String resultado = s.darSaludo();
        String esperado = "Hola Leonardo, buenos dias";
        assertEquals(esperado,resultado);
    }
}