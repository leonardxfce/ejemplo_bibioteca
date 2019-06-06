package controladores;

import java.util.HashMap;
import java.util.Map;

public class Peticion {

    String comando;

    String darComando() {
        return this.comando;
    }

    // arreglar para ser dinamico
    Map darDatos() {
        Map x = new HashMap();
        x.put("nombre", "100 años de soldead");
        x.put("ISBN", 1007);
        return x;
    }

    void setComando(String comando) {
        this.comando = comando;
    }
}
