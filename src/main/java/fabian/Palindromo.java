package fabian;

import java.util.Scanner;

public class Palindromo {


    public static boolean verificarSiLaPalabraEsPalindromo(String palabra) {

        int cantidadDeCaracteres = palabra.length();
        String palabraInvertida = "";
        int i = cantidadDeCaracteres - 1;
        do {
            palabraInvertida += palabra.charAt(i);
            i--;
        } while (i != -1);

        if (palabra.equals(palabraInvertida)) {
            return true;
        } else {
            return false;
        }
    }
}
