package baseDatos;
import modelos.Libro;
import modelos.ManejadorLibro;
public class Inicio {
    public static void main(String[] args) {
      ManejadorLibro miLibro = new ManejadorLibro();
      miLibro.crearTabla();
      
      Libro Librito = new Libro();
      Librito.setISBN(1000);
      Librito.setNombre("El pato");
      miLibro.insertarLibro(Librito);
    }
}
