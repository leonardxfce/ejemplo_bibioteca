package batalla_naval;

import java.util.Scanner;

public class BatallaNaval {
    int tableroDePosicion[][] = new int[10][10];
    int tableroPrincipal[][] = new int[10][10];
    String letrasTablero[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public BatallaNaval() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroDePosicion[i][j] = 0;
                tableroPrincipal[i][j] = 0;
            }
        }
        llenarTableroPrincipal(tableroPrincipal);
    }

    public boolean verificarSiElTableroEstaVacio(int[][] tablero) {
        boolean estaVacio = true;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (tablero[i][j] == 1) {
                    estaVacio = false;
                }
            }
        }
        return estaVacio;
    }

    public boolean VerificarSiLaPosicionEstaVacia(int[][] tablero, int colunma, int fila) {
        boolean posicionVacia;
        if (tablero[colunma][fila] == 0) {
            posicionVacia = true;
        } else {
            posicionVacia = false;
        }
        return posicionVacia;
    }

    public void ocuparPosicion(int[][] tableroDePosicion, int columna, int fila) {
        tableroDePosicion[columna][fila] = 1;
    }


    public void desocuparPosicion(int[][] tableroDePosicion, int columna, int fila) {
        tableroDePosicion[columna][fila] = 0;
    }

    public void llenarTableroPrincipal(int tablero[][]) {
        int aleatorioColumna;
        int aleatorioFila;
        for (int i = 0; i < 5; i++) {
            aleatorioColumna = (int) (Math.random() * 9);
            aleatorioFila = (int) (Math.random() * 9);
            if (tablero[aleatorioColumna][aleatorioFila] == 0) {
                tablero[aleatorioColumna][aleatorioFila] = 1;
            } else {
                i--;
            }
        }

    }

}
