

package utilidades;

class Utilidades {
    
     public int contarVocalesDe(String nbre) {
        int contador = 0;
        nbre = "Leonardo";

        String[] vocales = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < nbre.length(); i++) {
            for (int j = 0; j < nbre.length(); j++) {

                if (nbre.charAt(i) == (vocales[i].charAt(j))) {

                    contador++;
                }
            }
        }
        return contador;
        }
}
