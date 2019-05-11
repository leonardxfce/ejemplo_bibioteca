package batalla_naval;

import java.util.Scanner;

public class BN {
    Vista vista;
    BatallaNaval batallaNaval;
    Scanner scanner;

    BN() {
        Scanner scanner = new Scanner(System.in);
        BatallaNaval batallaNaval = new BatallaNaval();
        Vista vista = new Vista();
        System.out.println("TIENES UNA FLOTA CON 5 FRAGATAS. DISTRUBUYELAS EN TU TERRITORIO.");
        llenarTableroDePosicion(scanner, batallaNaval, vista);
        jugarJugador1(scanner, batallaNaval, vista);
        jugarJudadorPC(scanner, batallaNaval, vista);

    }

    public void jugarJudadorPC(Scanner scanner, BatallaNaval batallaNaval, Vista vista) {
        int aleatorioColumna;
        int aleatorioFila;
        do {
            aleatorioColumna = (int) (Math.random() * 9);
            aleatorioFila = (int) (Math.random() * 9);
            System.out.println(aleatorioColumna + "" + aleatorioFila + "");//Para saber que numeros selecciono la maquina.
            if (!batallaNaval.VerificarSiLaPosicionEstaVacia(batallaNaval.tableroDePosicion, aleatorioColumna, aleatorioFila)) {
                batallaNaval.desocuparPosicion(batallaNaval.tableroDePosicion, aleatorioColumna, aleatorioFila);
                System.out.println("TE HAN HUNDIDO UNA FRAGATA!");
            } else {
                System.out.println("AGUA! AHORA ES TU TURNO");
                jugarJugador1(scanner, batallaNaval, vista);

            }
        } while (!batallaNaval.verificarSiElTableroEstaVacio(batallaNaval.tableroDePosicion));
        System.out.println("HAS PERDIDO!!!");

    }


    public void llenarTableroDePosicion(Scanner scanner, BatallaNaval batallaNaval, Vista vista) {
        for (int i = 0; i < 1; i++) {
            System.out.print("INGRESE UNA COLUMNA: ");
            int columna = scanner.nextInt();
            System.out.print("INGRESE UNA FILA: ");
            int fila = scanner.nextInt();
            if (batallaNaval.VerificarSiLaPosicionEstaVacia(batallaNaval.tableroDePosicion, columna, fila)) {
                batallaNaval.ocuparPosicion(batallaNaval.tableroDePosicion, columna, fila);
                System.out.println("YA COLOCÓ UNA FRAGATA!");
            } else {
                System.out.println("Esta posicion ya esta ocupada!!!");
                i--;
            }
            vista.imprimirTableroInt(batallaNaval.tableroDePosicion);
            //batallaNaval.imprimirTablero(batallaNaval.tableroDePosicion);
        }
        //Mostrar tablero creado
        //String tableroDePosicionString = batallaNaval.imprimirTablero(batallaNaval.tableroDePosicion);
        //JOptionPane.showMessageDialog(null,"\n" + tableroDePosicionString);
    }

    public void jugarJugador1(Scanner scanner, BatallaNaval batallaNaval, Vista vista) {
        System.out.println("AHORA TE TOCA HUNDIR LA FLOTA DE TU ENEMIGO");
        do {
            vista.imprimirTablero(vista.tableroPrincipalVistaUsuario);
            System.out.print("INGRESE UNA COLUMNA: ");
            int columna = scanner.nextInt();
            System.out.print("INGRESE UNA FILA: ");
            int fila = scanner.nextInt();
            if (!batallaNaval.VerificarSiLaPosicionEstaVacia(batallaNaval.tableroPrincipal, columna, fila)) {
                batallaNaval.desocuparPosicion(batallaNaval.tableroPrincipal, columna, fila);
                System.out.println("HA HUNDIDO UNA FRAGATA!");
                vista.llenaPosicionConLetra(columna, fila, "X");
            } else {
                //System.out.println("NO HABIA NINGUNA FRAGATA, INGRESE OTRA POSICION");
                System.out.println("AGUA! ES TURNO DE TU OPONENTE");
                vista.llenaPosicionConLetra(columna, fila, "A");
                jugarJudadorPC(scanner, batallaNaval, vista);

            }
        } while (!batallaNaval.verificarSiElTableroEstaVacio(batallaNaval.tableroPrincipal));
        System.out.println("HAS GANADO!!!");
    }

}
