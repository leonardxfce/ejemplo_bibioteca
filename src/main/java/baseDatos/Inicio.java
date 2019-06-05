package baseDatos;

public class Inicio {
    public static void main(String[] args) {
        ManejadorDeArchivos manejardorDeArchivos = new ManejadorDeArchivos();
        String query = manejardorDeArchivos.abrirArchivo("libro.sql");
        SQLite sqlite = new SQLite("ejemplo.db");
        sqlite.conectar();
        sqlite.crearTabla(query);
        sqlite.apagar();
    }
}
