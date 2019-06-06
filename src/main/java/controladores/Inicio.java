package controladores;

public class Inicio {
    public static void main(String[] args) {
        Routeador router = new Routeador();
        Peticion peticion = new Peticion();
        peticion.setComando("crear_libro");
        router.elegirComando(peticion);
    }
}
