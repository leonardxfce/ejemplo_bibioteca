/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Vaio
 */
public class Visual implements GUI {

    @Override
    public void escribir(String mensaje) {
         JOptionPane.showMessageDialog(null,mensaje); 
    }

    @Override
    public String leer() {
        return JOptionPane.showInputDialog(" "); //To change body of generated methods, choose Tools | Templates.
    }
   
 
    
}
    

