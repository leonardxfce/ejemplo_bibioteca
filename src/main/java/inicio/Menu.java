package inicio;

class Menu {

    boolean mantenerJuego;
    String comando;
    GUI gui;
    String[] opciones = {
            "1: Modo de prueba",
            "0: Salir",
    };

    Menu(GUI interfazDeUsuario) {
        gui = interfazDeUsuario;
    }

    void jugar() {
        mantenerJuego = true;
        gui.escribir("Bienvenido, eliga su juego:");
        do {
            gui.escribir(darOpciones());
            comando = gui.leer();
            switch (comando) {
                case "1":
                    gui.escribir("Usted eligio uno.");
                    break;
                case "0":
                    gui.escribir("Adios. :( ");
                    mantenerJuego = false;
                    break;
                default:
                    gui.escribir("Opcion incorrecta, intente de nuevo.");
                    break;
            }
        } while (mantenerJuego);
    }

    private String darOpciones() {
        return String.join("\n", opciones);
    }
}