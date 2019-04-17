package utilidades;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcuadoraNumerosEspecialesTest {

    @Test
    public void testDado2010devuelveFalso() {
        CalcuadoraNumerosEspeciales c = new CalcuadoraNumerosEspeciales();
        boolean resultado = c.calcular(2010);
        boolean esperado = false;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testDado2020devuelveVerdadero() {
        CalcuadoraNumerosEspeciales c = new CalcuadoraNumerosEspeciales();
        boolean resultado = c.calcular(2020);
        boolean esperado = true;
        assertEquals(esperado, resultado);
    }
}