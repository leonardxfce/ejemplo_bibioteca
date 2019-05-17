package batalla_naval;

import java.util.Scanner;

public class Vista {
    String tableroPrincipalVistaUsuario[][] = new String[10][10];

    public Vista(){
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                this.tableroPrincipalVistaUsuario[i][j]="0";
            }
        }
    }

    public void escribir(int opcion){

        switch (opcion){
            case 1:
                System.out.println("TIENES UNA FLOTA CON 5 FRAGATAS. DISTRUBUYELAS EN TU TERRITORIO.");
                break;
            case 2:
                System.out.println("TE HAN HUNDIDO UNA FRAGATA!");
                break;
            case 3:
                System.out.println("AGUA! AHORA ES TU TURNO");
                break;
            case 4:
                System.out.println("HAS PERDIDO!!!");
                break;
            case 5:
                System.out.println("YA COLOCÓ UNA FRAGATA!");
                break;
            case 6:
                System.out.println("Esta posicion ya esta ocupada!!!");
                break;
            case 7:
                System.out.println("AHORA TE TOCA HUNDIR LA FLOTA DE TU ENEMIGO");
                break;
            case 8:
                System.out.println("HA HUNDIDO UNA FRAGATA!");
                break;
            case 9:
                System.out.println("AGUA! ES TURNO DE TU OPONENTE");
                break;
            case 10:
                System.out.println("HAS GANADO!!!");
                break;
        }
    }

    public int ingresarColumna(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("INGRESE UNA COLUMNA: ");
        int columna = scanner.nextInt();
        return columna;
    }

    public int ingresarFila(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("INGRESE UNA FILA: ");
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
        System.out.println(tableroString);
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
        System.out.println(tableroString);
    }

}
