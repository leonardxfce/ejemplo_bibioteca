package modelos;

import baseDatos.ManejadorDeArchivos;
import baseDatos.SQLite;

public class ManejadorLibro {

    SQLite sqLite;
    ManejadorDeArchivos ma;
    Libro libro;

    public ManejadorLibro(){
        sqLite = new SQLite();
        ma = new ManejadorDeArchivos();
        sqLite.conectar();
    }

    public void crearTabla(){
        String sql = ma.abrirArchivo("libro.sql");
           sqLite.ejecutarMiSQL(sql);
           
        
    }
    
    public void insertarLibro (Libro libro){
        String nombre = libro.nombre;
        int ISBN = libro.ISBN;
        String sql = "INSERT INTO libro "+
                "VALUES (NULL,"+
                "'"+nombre+"',"+""+ISBN+" "+");";
        
        sqLite.ejecutarMiSQL(sql);
                
                
    }
}
