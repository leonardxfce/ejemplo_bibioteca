package inicio;

import java.util.Scanner;

class Consola implements UserInterface {

    @Override
    public void escribir(String mensaje) {
        System.out.println(mensaje);
    }

    public String leer() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
}
