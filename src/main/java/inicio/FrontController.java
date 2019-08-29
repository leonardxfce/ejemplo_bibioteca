package inicio;

import com.google.gson.Gson;
import modelos.Libro;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FrontController extends HttpServlet {


    public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) throws IOException {
        respuesta.setContentType("application/json");
        PrintWriter out = respuesta.getWriter();
        Libro libro = new Libro();
        libro.setNombre("Los 3 mosqueteros");
        libro.setISBN(1);
        Gson gson = new Gson();
        String libroJSON = gson.toJson(libro);
        out.println(libroJSON);
    }

}