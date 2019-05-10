package inicio;

public class Inicio {
    public static void main(String[] args) {
        GUI consola =  new Consola();
        Menu menu = new Menu(consola);
        menu.jugar();
    }
}
