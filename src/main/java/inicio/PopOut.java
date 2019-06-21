package inicio;

import javax.swing.*;

public class PopOut implements UserInterface {
    @Override
    public void escribir(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @Override
    public String leer() {
        return JOptionPane.showInputDialog(null);
    }
}
