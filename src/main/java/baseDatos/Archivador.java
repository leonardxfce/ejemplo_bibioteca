package baseDatos;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Archivador {

    public String abrirArchivo(){
        String x= System.getProperty("user.dir");
        File archivo =  new File(x+"/src/main/java/baseDatos/libro.sql");
        String string = null;
        try {
            string = FileUtils.readFileToString(archivo);
        } catch (IOException e) {
            System.out.println("Error" + e.toString());
        }
        return string;
    }
}
