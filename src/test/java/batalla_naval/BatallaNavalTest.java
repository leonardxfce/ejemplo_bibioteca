package batalla_naval;

import org.junit.Test;

import static org.junit.Assert.*;

public class BatallaNavalTest {
    @Test
    public void testTableroVacio() {
        BatallaNaval batallaNaval = new BatallaNaval();
        int tablero[][] = new int[10][10];
        boolean resultado = batallaNaval.verificarSiElTableroEstaVacio(tablero);
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testTableroCon1PosicionLlena() {
        BatallaNaval batallaNaval = new BatallaNaval();
        int tablero[][] = new int[10][10];
        tablero[0][9] = 1;
        boolean resultado = batallaNaval.verificarSiElTableroEstaVacio(tablero);
        boolean esperado = false;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testVerificarSiPosicionEstaVacia() {
        BatallaNaval batallaNaval = new BatallaNaval();
        int tablero[][] = new int[10][10];
        boolean resultado = batallaNaval.VerificarSiLaPosicionEstaVacia(tablero, 0, 5);
        boolean esperado = true;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testVerificarSiPosicionEstaOcupada() {
        BatallaNaval batallaNaval = new BatallaNaval();
        int tablero[][] = new int[10][10];
        tablero[0][5] = 1;
        boolean resultado = batallaNaval.VerificarSiLaPosicionEstaVacia(tablero, 0, 5);
        boolean esperado = false;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testOcuparPosicion() {
        BatallaNaval batallaNaval = new BatallaNaval();
        batallaNaval.ocuparPosicion(batallaNaval.tableroDePosicion, 0, 5);
        boolean resultado = batallaNaval.VerificarSiLaPosicionEstaVacia(batallaNaval.tableroDePosicion, 0, 5);
        boolean esperado = false;
        assertEquals(resultado, esperado);
    }

    @Test
    public void testDesocuparPosicion() {
        BatallaNaval batallaNaval = new BatallaNaval();
        batallaNaval.ocuparPosicion(batallaNaval.tableroDePosicion, 0, 5);
        batallaNaval.desocuparPosicion(batallaNaval.tableroDePosicion, 0, 5);
        boolean resultado = batallaNaval.VerificarSiLaPosicionEstaVacia(batallaNaval.tableroDePosicion, 0, 5);
        boolean esperado = true;
        assertEquals(resultado, esperado);
    }
}