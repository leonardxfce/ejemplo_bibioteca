package modelos;

import baseDatos.SQLite;
import utilidades.ManejadorDeArchivos;



public class ManejadorPrestamos {

    SQLite sqLite;
    ManejadorDeArchivos ma;
    Prestamos prestamos;
    Libro libro;
    Socio socio;

    public ManejadorPrestamos(SQLite sqLite) {
        this.sqLite = sqLite;
        ma = new ManejadorDeArchivos();
    }

   
public void crearTabla() {
        String sql = ma.abrirArchivo("tabla_prestamo.sql");
        sqLite.ejecutarMiSQL(sql);
    }

    //public void Prestar(String fecha) {
        //String sql = ma.abrirArchivo("libro_por_isbn.sql");
        //  System.out.println("sql");
    //}

     public void insertar(Libro libro,Socio socio,Prestamos fecha) {
        String sql = ma.abrirArchivo("nuevo_presta.sql");
        
        sql = sql.replace("NOMBRE", libro.nombre);
        sql = sql.replace("ISBN", Integer.toString(libro.ISBN));
        sql = sql.replace("NOMBRE", socio.nombre);
        sql = sql.replace("FECHA", fecha.fecha);
         System.out.println(sql);
        sqLite.ejecutarMiSQL(sql);
    }
}
