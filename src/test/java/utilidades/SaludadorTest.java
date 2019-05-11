package utilidades;

import org.junit.Test;

import static org.junit.Assert.*;

public class SaludadorTest {

    @Test
    
    public void testDeberiaDecirElNombreYBuenosDias() {
        
        //instancio el objeto
        Saludador s = new Saludador("Leonardo");
        //lo que devuelve la variable
        String resultado = s.darSaludo();
        //lo q espero q devuelva la variable
        String esperado = "Hola Leonardo, buenos dias";
        
        //es igual lo que espero al rdo?
        assertEquals(esperado,resultado);
    }
}