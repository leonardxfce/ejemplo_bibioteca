package baseDatos;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Archivador {

    final String paquete = "/src/main/java/baseDatos/";

    public String abrirArchivo(String query) {
        String x = System.getProperty("user.dir");
        File archivo = new File(x + paquete + query);
        String string = null;
        try {
            string = FileUtils.readFileToString(archivo);
        } catch (IOException e) {
            System.out.println("Error" + e.toString());
        }
        return string;
    }
}
