package batalla_naval;
import inicio.GUI;
import java.util.Scanner;

public class Vista {
    String tableroPrincipalVistaUsuario[][] = new String[10][10];
    GUI vistaGUI;

    public void mostrarPorPantalla(int opcion){

        switch (opcion){
            case 1:

               vistaGUI.escribir("TIENES UNA FLOTA CON 5 FRAGATAS. DISTRUBUYELAS EN TU TERRITORIO.");
                break;
            case 2:
                vistaGUI.escribir("TE HAN HUNDIDO UNA FRAGATA!");
                break;
            case 3:
                vistaGUI.escribir("AGUA! AHORA ES TU TURNO");
                break;
            case 4:
                vistaGUI.escribir("HAS PERDIDO!!!");
                break;
            case 5:
                vistaGUI.escribir("YA COLOCÓ UNA FRAGATA!");
                break;
            case 6:
                vistaGUI.escribir("Esta posicion ya esta ocupada!!!");
                break;
            case 7:
                vistaGUI.escribir("AHORA TE TOCA HUNDIR LA FLOTA DE TU ENEMIGO");
                break;
            case 8:
                vistaGUI.escribir("HA HUNDIDO UNA FRAGATA!");
                break;
            case 9:
                vistaGUI.escribir("AGUA! ES TURNO DE TU OPONENTE");
                break;
            case 10:
                vistaGUI.escribir("HAS GANADO!!!");
                break;
        }
    }

    public int ingresarColumna(){
        Scanner scanner = new Scanner(System.in);
        vistaGUI.escribir("INGRESE UNA COLUMNA: ");
        int columna = scanner.nextInt();
        return columna;
    }

    public int ingresarFila(){
        Scanner scanner = new Scanner(System.in);
        vistaGUI.escribir("INGRESE UNA FILA: ");
        int fila = scanner.nextInt();
        return fila;
    }

    public void llenaPosicionConLetra(int columna, int fila, String letra){
        this.tableroPrincipalVistaUsuario[columna][fila]=letra;
    }


    public void imprimirTablero(String tablero[][]) {
        String letrasTablero[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String tableroString = "  0 1 2 3 4 5 6 7 8 9\n";
        tableroString += "____________________\n";//Falta agregar un + atras del =
        for (int i = 0; i < 10; i++) {
            tableroString += letrasTablero[i] + "|";
            for (int j = 0; j < 10; j++) {
                tableroString += tablero[i][j] + " ";
            }
            tableroString += "\n";
        }
        vistaGUI.escribir(tableroString);
    }

    public void imprimirTableroInt(int tablero[][]) {
        String letrasTablero[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String tableroString = "  0 1 2 3 4 5 6 7 8 9\n";
        tableroString += "____________________\n";
        for (int i = 0; i < 10; i++) {
            tableroString += letrasTablero[i] + "|";
            for (int j = 0; j < 10; j++) {
                tableroString += tablero[i][j] + " ";
            }
            tableroString += "\n";
        }
        vistaGUI.escribir(tableroString);
    }

}
