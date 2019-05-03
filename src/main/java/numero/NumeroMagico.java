/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero;

/**
 *
 * @author Vaio
 */
public class NumeroMagico {

    int numero;

    void crearNumeroAleatorio() {
        this.numero = (int) (Math.random() * 100);
    }
    int min = 0;
    int max = 100;

    void crearNumeroMayor(int decision) {
        this.max = decision - 1;
    }

    void crearNumeroMenor(int decision) {
        this.min = decision + 1;
    }
    String compararSiSonIguales(int numusuario) {

        if (numero == numusuario) {
            return "ganaste";
        }
        if (numero > numusuario) {
            return "es menor";
        }
        if (numero < numusuario) {
            return "es mayor";

        }
        return "a";
    }

}
