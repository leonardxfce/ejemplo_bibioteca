package clasedehoy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class basededatos {
    String protocolo = "jdbc:sqlite:";
    String nombreDeLaBD = "pepe.db";
    
  basededatos(){
      try{
      Connection conexion = DriverManager.getConnection(protocolo + nombreDeLaBD);
      //obtener el cuadradito para obtener consultas
      Statement consulta = conexion.createStatement(); 
      String sql = "CREATE TABLE IF NOT EXISTs Libros (id INT PRIMARY KEY, nombre TEXT)";
      consulta.execute(sql);
      String sql2 = "INSERT INTO Libros VALUES(NULL,'Principito')";
      consulta.execute(sql2);
          System.out.println("INSERTO UN LIBRO");
          String sql3 = "SELECT * FROM Libros";
          ResultSet rs = consulta.executeQuery(sql3);
          rs.next();
          int z = rs.getInt("id");
      System.out.println("TABLA CREADA");
      } catch(Exception e){
              e.printStackTrace();
              }
  }
}
