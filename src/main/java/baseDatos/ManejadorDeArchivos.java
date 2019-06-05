package baseDatos;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

class ManejadorDeArchivos {

    String paquete = "/src/main/java/baseDatos/";

    String abrirArchivo(String nombreDeArchivo) {
        String directorio = System.getProperty("user.dir");
        File archivo = new File(directorio + paquete + nombreDeArchivo);
        String archivoEnFormaDeTexto = null;
        try {
            archivoEnFormaDeTexto = FileUtils.readFileToString(archivo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return archivoEnFormaDeTexto;
    }
}
