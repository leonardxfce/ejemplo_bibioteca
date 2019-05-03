package numero;

public class NumeroBinario {

    String transformarEnteroABinario(int decimal) {
        int modulo;
        String binario = "";

        while (decimal > 0) {
            modulo = (decimal % 2);
            binario = modulo + binario;
            decimal = decimal / 2;

        }
        return binario;
    }

}
/**
 * Scanner leer = new Scanner ( System . in); int decimal, modulo, aux;
 *
 * System.out.println ( " Escriba un numero " ); decimal = leer.nextInt();
 *
 * String binario= "";
 *
 *
 * aux = decimal; while(decimal > 0){ modulo= (decimal%2); binario = modulo +
 * binario; decimal = decimal /2;
 *
 * }
 *
 *
 *
 * System.out.println("el numero binario es: "+binario );
 */
