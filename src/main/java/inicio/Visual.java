
package inicio;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Visual implements GUI {

    @Override
    public void escribir(String mensaje) {
        JOptionPane.showInputDialog(null, mensaje);
    }

    @Override
    public String leer() {
    return JOptionPane.showInputDialog("");
    }

}

