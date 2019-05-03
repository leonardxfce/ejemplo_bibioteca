package numero;

import java.util.Scanner;

public class AdivinarNumMagico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumeroMagico na = new NumeroMagico();
        na.crearNumeroAleatorio();
        int rdo = na.numero;
        //   int rdo = (int) (Math.random() * 100);

        for (int i = 1; i <= 5; i++) {
            System.out.println("---------------");
            System.out.println("Numero Magico");

            System.out.println("--------------");
            System.out.println("Adivine el nro? = x ");
            int nro = sc.nextInt();

            if (nro == rdo) {
                System.out.println("Ganaste!!");
            }
            if (nro > rdo) {
                System.out.println("Es menor");
            }
            if (nro < rdo) {

                System.out.println("Es mayor");
            }

        }
        System.out.println("PERDISTE... :(");
        System.out.println("El resultado es: " + rdo);
    }

}
