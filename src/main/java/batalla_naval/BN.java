package batalla_naval;

import java.util.Scanner;

public class BN {
    /*Vista vista;
    BatallaNaval batallaNaval;
    Scanner scanner;*/

    BN() {
        //Scanner scanner = new Scanner(System.in);
        BatallaNaval batallaNaval = new BatallaNaval();
        Vista vista = new Vista();
        vista.escribir(1);
        llenarTableroDePosicion(batallaNaval, vista);
        jugarJugador1(batallaNaval, vista);
        jugarJudadorPC(batallaNaval, vista);

    }

    public void jugarJudadorPC(BatallaNaval batallaNaval, Vista vista) {
        int aleatorioColumna;
        int aleatorioFila;
        do {
            aleatorioColumna = (int) (Math.random() * 9);
            aleatorioFila = (int) (Math.random() * 9);

            //System.out.println(aleatorioColumna + "" + aleatorioFila + "");//Para saber que numeros selecciono la maquina.
            if (!batallaNaval.VerificarSiLaPosicionEstaVacia(batallaNaval.tableroDePosicion, aleatorioColumna, aleatorioFila)) {
                batallaNaval.desocuparPosicion(batallaNaval.tableroDePosicion, aleatorioColumna, aleatorioFila);
                vista.escribir(2);
            } else {
                vista.escribir(3);
                jugarJugador1(batallaNaval, vista);

            }
        } while (!batallaNaval.verificarSiElTableroEstaVacio(batallaNaval.tableroDePosicion));
        vista.escribir(4);
    }


    public void llenarTableroDePosicion(BatallaNaval batallaNaval, Vista vista) {
        for (int i = 0; i < 5; i++) {
            int columna = vista.ingresarColumna();
            int fila = vista.ingresarFila();
            if (batallaNaval.VerificarSiLaPosicionEstaVacia(batallaNaval.tableroDePosicion, columna, fila)) {
                batallaNaval.ocuparPosicion(batallaNaval.tableroDePosicion, columna, fila);
                vista.escribir(5);
            } else {
                vista.escribir(6);
                i--;
            }
            vista.imprimirTableroInt(batallaNaval.tableroDePosicion);
        }
    }

    public void jugarJugador1(BatallaNaval batallaNaval, Vista vista) {
        vista.escribir(7);
        do {
            vista.imprimirTablero(vista.tableroPrincipalVistaUsuario);
            int columna = vista.ingresarColumna();
            int fila = vista.ingresarFila();
            if (!batallaNaval.VerificarSiLaPosicionEstaVacia(batallaNaval.tableroPrincipal, columna, fila)) {
                batallaNaval.desocuparPosicion(batallaNaval.tableroPrincipal, columna, fila);
                vista.escribir(8);
                vista.llenaPosicionConLetra(columna, fila, "X");
            } else {
                vista.escribir(9);
                vista.llenaPosicionConLetra(columna, fila, "A");
                jugarJudadorPC(batallaNaval, vista);

            }
        } while (!batallaNaval.verificarSiElTableroEstaVacio(batallaNaval.tableroPrincipal));
        vista.escribir(10);
    }

}
