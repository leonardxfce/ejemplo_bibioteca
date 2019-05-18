package numero;

import java.util.Scanner;

public class AdivinarNumMagico {
    
    public AdivinarNumMagico(){
        
    }

    public void jugarNumeroMagico() {

        Scanner sc = new Scanner(System.in);
        
        NumeroMagico nAleatorio = new NumeroMagico();
        nAleatorio.crearNumeroAleatorio();
        int numeroMagico = nAleatorio.numero;
        //   int rdo = (int) (Math.random() * 100);

        for (int i = 1; i <= 5; i++) {
            System.out.println("---------------");
            System.out.println("Numero Magico");

            System.out.println("--------------");
            System.out.println("Adivine el nro? = x ");
            int numeroUsuario = sc.nextInt();

            if (numeroUsuario == numeroMagico) {
                System.out.println("Ganaste!!");
            }
            if (numeroUsuario > numeroMagico) {
                System.out.println("Es menor");
            }
            if (numeroUsuario < numeroMagico) {

                System.out.println("Es mayor");
            }

        }
        System.out.println("PERDISTE... :(");
        System.out.println("El resultado es: " + numeroMagico);
    }

}
