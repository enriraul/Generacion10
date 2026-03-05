import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;//select
import java.sql.Statement;


public class DreamsDB{
    /*
    user: admin
    psswd: root
    */
    private Connection conn;
    private String url="jdbc:postgresql://localhost:5433/dreams";
    private String usuario = "admin";
    private String contraseña = "root";

    public DreamsDB(){
        try {
            Class.forName("org.postgresql.Driver"); //Obliga al código a forzar cargar el driver mencionado, en este caso, postgres
            this.conn = DriverManager.getConnection(url,usuario, contraseña);
            System.out.println("Se estableció la conexión");
        } catch (ClassNotFoundException|SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarInventario(){
        String consulta = "select * from producto";
        try (
            Statement stmt = this.conn.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
        )
        {
            while (rs.next()) { 
                int idProducto = rs.getInt("idproducto");
                String nombre = rs.getString("nombre");
                String categoria = rs.getString("categoria");
                float precio = rs.getFloat("precio");
                int stock = rs.getInt("stock");
                String infoProducto = String.format("""
                ______________________________________
                idProducto: %s
                Nombre del producto: %s
                Categoria del producto: %s
                Precio: %f
                Disponibles: %d
                ______________________________________
                """, idProducto,nombre, categoria,precio, stock);
                System.out.println(infoProducto);
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}