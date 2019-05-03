package numero;

import java.util.*;

public class AdivinarNumMagico2 {

   
    

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
     
        System.out.println("Piensa en un numero...");
        System.out.println("Para saber si acerto ingrese ");
        System.out.println("(=) para saber que es igual");
        System.out.println("(+) para saber que es mayor");
        System.out.println("(-) para saber que es menor");
        String rta;
        NumeroMagico na = new NumeroMagico();
        na.crearNumeroAleatorio();
        int rdo = na.numero;
        do {
            System.out.println("Es este el nro?" + rdo);

            rta = leer.nextLine();
            if ("=".equals(rta)) {
                System.out.println("gane!!!!");
            }
            if ("+".equals(rta)) {
                na.crearNumeroMayor(rdo);
                 

            }
            if ("-".equals(rta)) {
                na.crearNumeroMenor(rdo);
            }
        } while (rta == "=");
    }

}
