package baseDatos;

public class Inicio {
    public static void main(String[] args) {
        SQLite sqlite = new SQLite("ejemplo.db");
        sqlite.conectar();
        sqlite.crearTablaSocio();
        //sqlite.insertarUnSocio();
        sqlite.apagar();
    }
}
