package utilidades;

public class Multiplicador {
    public boolean Multiplicador(int numero){
        boolean multiP = (numero * 5 == 20);
        boolean multiN = (numero * 5 == -20);
        return (multiP || multiN);
    }
}
