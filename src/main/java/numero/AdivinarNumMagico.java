package numero;
import inicio.Consola;
import java.util.Scanner;
import inicio.Visual;

public class AdivinarNumMagico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumeroMagico na = new NumeroMagico();
        Visual cd = new Visual();
        //Consola cd = new Consola();
        
        na.crearNumeroAleatorio();
        
        
         
        int rdo = na.numero;
        //   int rdo = (int) (Math.random() * 100);

        for (int i = 1; i <= 5; i++) {
            cd.escribir(
                         "Numero Magico"

                       
                        +"\nAdivine el nro? = x ");
           String a = cd.leer();
           int nro = Integer.parseInt(a);
            
            if (nro == rdo) {
                cd.escribir("Ganaste!!");
            }
            if (nro > rdo) {
                cd.escribir("Es menor");
            }
            if (nro < rdo) {

                cd.escribir("Es mayor");
            }
            //KIS repeticiones de if
            //SOC dividir las funciones en vista 
        }
       cd.escribir("PERDISTE... :("+"\n El resultado es: " + rdo);
    }

}
