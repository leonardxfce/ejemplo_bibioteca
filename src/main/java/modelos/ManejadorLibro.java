package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;


public class ManejadorLibro {

    SQLite sqLite;
    ManejadorDeArchivos ma;
    Libro libro;

    public ManejadorLibro(SQLite sqLite) {
        this.sqLite = sqLite;
        ma = new ManejadorDeArchivos();
    }

    public void crearTabla() {
        String sql = ma.abrirArchivo("libro.sql");
        sqLite.ejecutarMiSQL(sql);
    }

    public void insertar(Libro libro) {
        String sql = ma.abrirArchivo("nuevo_libro.sql");
        sql = sql.replace("NOMBRE", libro.nombre);
        sql = sql.replace("ISBN", Integer.toString(libro.ISBN));
        sqLite.ejecutarMiSQL(sql);
    }
    public void borrar(Libro libro){
        String sql = ma.abrirArchivo("borrar_libro.sql");
        sql = sql.replace("NOMBRE", libro.nombre);
        sql = sql.replace("VALOR1", Integer.toString(libro.ISBN));
        //System.out.println(sql);
       sqLite.ejecutarMiSQL(sql);
    }
    public void modificar (Libro libro){
     String sql = ma.abrirArchivo("actualizar_libro.sql");
        sql = sql.replace("VALOR3", libro.nombre);
        sql = sql.replace("VALOR4", Integer.toString(libro.ISBN));
        //System.out.println(sql);
        sqLite.ejecutarMiSQL(sql);   
    }
    
}
