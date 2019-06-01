package baseDatos;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Archivador {

    final String paquete = "/src/main/java/baseDatos/";

    public String abrirArchivo(String query) {
        String directorio = System.getProperty("user.dir");
        File archivo = new File(directorio + paquete + query);
        String archivoEnFormaDeTexto = null;
        try {
            archivoEnFormaDeTexto = FileUtils.readFileToString(archivo);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return archivoEnFormaDeTexto;
    }
}
