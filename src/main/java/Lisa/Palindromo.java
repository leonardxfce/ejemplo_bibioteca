package Lisa;

public class Palindromo {
    public boolean verificacion(String palabra) {
        palabra = palabra.toUpperCase();
        boolean verificacion = false;
        int indice = 0;
        int indiceUltimaPosicion = palabra.length() - 1;
        if (palabra.length() > 1) {
            do {
                if (palabra.charAt(indice) == palabra.charAt(indiceUltimaPosicion)) {
                    verificacion = true;
                    indice++;
                    indiceUltimaPosicion--;
                } else {
                    verificacion = false;
                }
            } while (verificacion && indice == palabra.length());
        }
        return verificacion;
    }

}
