package controladores;

public class Routeador {

    String comandoSolictado;
    Comando comando;

    void elegirComando(Peticion peticion) {
        comandoSolictado = peticion.darComando();
        switch (comandoSolictado) {
            case "crear_socio":
                comando = new CrearSocio();
                break;
            case "crear_libro":
                comando = new CrearLibro();
                break;
            default:
                comando = null;
        }
        comando.ejecutar(peticion);
    }
}
