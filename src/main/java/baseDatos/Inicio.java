package baseDatos;

public class Inicio {
    public static void main(String[] args) {
        SQLite sqlite = new SQLite("ejemplo.sqlite");
        ManejadorDeArchivos ma = new ManejadorDeArchivos();
        String sqlDeTablaLibro = ma.abrirArchivo("libro.sql");
        String sqlDeTablaSocio = ma.abrirArchivo("socio.sql");
        sqlite.conectar();
        sqlite.ejecutarMiSQL(sqlDeTablaLibro);
        sqlite.ejecutarMiSQL(sqlDeTablaSocio);
        sqlite.apagar();
    }
}
