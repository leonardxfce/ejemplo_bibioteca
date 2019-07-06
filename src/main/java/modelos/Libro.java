package modelos;

public class Libro {
    String nombre;
    int ISBN;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setISBN(int isbn) {
        this.ISBN = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public int getISBN() {
        return ISBN;
    }

}

