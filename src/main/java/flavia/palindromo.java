/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flavia;

/**
 *
 * @author leonardlxde
 */
public class palindromo {

    boolean palindromo(String palabra) {
        int x = palabra.length();
        for (int i = 0; i <= palabra.length(); i++) {

            if (palabra.charAt(i) == palabra.charAt(x - 1)) {
                return true;
            }else{
                return false;
            }
           

        }

        return false;
    }

}
