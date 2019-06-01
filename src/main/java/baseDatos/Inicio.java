package baseDatos;

public class Inicio {
    public static void main(String[] args) {

        System.out.println("Abrir Archivo de SQL");
        Archivador archivador = new Archivador();
        String query = archivador.abrirArchivo();

        System.out.println("Crear tabla libro");
        SQLite sqlite = new SQLite("jdbc:sqlite:ejemplo.db");
        sqlite.conectar();
        sqlite.crearTabla(query);
        sqlite.apagar();
    }
}
