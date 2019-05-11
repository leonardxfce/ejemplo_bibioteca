package batalla_naval;

public class Vista {
    String tableroPrincipalVistaUsuario[][] = new String[10][10];

    public Vista(){
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                this.tableroPrincipalVistaUsuario[i][j]="0";
            }
        }
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
