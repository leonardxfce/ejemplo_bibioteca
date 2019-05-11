package numero;

import inicio.Consola;
import inicio.Visual;

public class AdivinarNumMagico {

    public static void main(String[] args) {
        Visual ll = new Visual();
        //Consola ll = new Consola();

        ll.escribir("---------------"
                + "\nNumero Magico"
                + "\n-------------");

        //  Scanner sc = new Scanner(System.in);
        NumeroMagico na = new NumeroMagico();
        na.crearNumeroAleatorio();

        //  int rdo = na.numero;
        //   int rdo = (int) (Math.random() * 100);
        int rdo = na.numero;
        for (int i = 1; i <= 5; i++) {
            Consola md = new Consola();

            md.escribir("--------------");
            md.escribir("Adivine el nro? = x ");
            Consola cd1 = new Consola();
            String a = cd1.leer();
            int b = Integer.parseInt(a);
            if (b == rdo) {
                md.escribir("Ganaste!!");
            }
            if (b > rdo) {
                md.escribir("Es menor");
            }
            if (b < rdo) {

                md.escribir("Es mayor");
            }

        }

        //Consola md1 = new Consola ();
        Visual md1 = new Visual();

        md1.escribir("PERDISTE... :(");

        Visual vv = new Visual();
        vv.escribir("El rdo es: " + rdo);
    }

}
