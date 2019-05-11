package inicio;

import java.util.Scanner;

 public class Consola implements GUI {

    @Override
    public void escribir(String mensaje) {
        System.out.println(mensaje);
    }

    public String leer() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }
}
