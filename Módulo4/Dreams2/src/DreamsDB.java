import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;//select
import java.sql.Statement;
import java.util.List;

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

/*
 private String Nombre;
    private Double Precio;
    private List<String> Categoria;
    private Integer Stock;

    idProducto SERIAL PRIMARY KEY,
    nombre varchar(50) NOT NULL,
    categoria text NOT NULL,
    precio numeric(10,2) NOT NULL,
    stock integer NOT NULL
 */

    public void ingresarProducto(String nombre, Double precio, List<String> categoria, Integer stock){
        String QsetProducto = "INSERT INTO producto(nombre, categoria, precio, stock) VALUES (?,?,?,?)";
        String categorias = "";
        for (String categoria_i : categoria) {
            categorias = categorias+categoria_i+",";
        }
        categorias = categorias.substring(0, categoria.size()-1);

        try(PreparedStatement pstmt = conn.prepareStatement(QsetProducto)){
            pstmt.setString(1,nombre);
            pstmt.setString(2,categorias);
            pstmt.setDouble(3, precio);
            pstmt.setInt(4, stock);
            int cambios = pstmt.executeUpdate();
            System.out.println("Se han realizado: "+cambios+" cambio(s)");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }  
    }
    /* Actividad: Crear el método que permita la creación de 
    nuevos clientes y la inserción en la base de datos 
    Finalización de la actividad: 9:55
    */
}