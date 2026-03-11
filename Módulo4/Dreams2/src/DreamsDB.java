import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;//select
import java.sql.Statement;
import java.util.ArrayList;
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
        String consulta = "select * from producto"; //"select * from producto where id = "+indId; 
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

    //validarCliente

    public void ingresarCliente(String nombre, String correo, String rol){
    // query para insertar un nuevo cliente en la tabla cliente
        String QsetCliente = "INSERT INTO cliente(nombre, correo, rol) VALUES(?, ?, ?)";

        try (PreparedStatement pstmt = this.conn.prepareStatement(QsetCliente);)
        {
            pstmt.setString(1, nombre);
            pstmt.setString(2, correo);
            pstmt.setString(3, rol);

            int filasAfectadas = pstmt.executeUpdate();

            System.out.println("Cliente agregado exitosamente. Filas afectadas: " + filasAfectadas);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    /*
        Método para actualizar el stock del producto;
    */
    public void ActualizarStock(Venta venta){
        try {
            conn.setAutoCommit(false);
            String QStock = "Select stock from producto WHERE id = ";
            String actualizarStock = "UPDATE producto SET stock = ? WHERE  id = ?";
            ArrayList<Carrito>  carrito = venta.getCarrito();
            for (Carrito producto_i : carrito) {
                int cantidad = producto_i.getCantidad();
                int id = producto_i.getProducto().getId();
                try(Statement stmt = conn.createStatement();
                ResultSet  rs = stmt.executeQuery(QStock+id);){
                    int cantidad_producto = rs.getInt("stock");
                    try(PreparedStatement pstmt = conn.prepareStatement(actualizarStock)){
                        if(cantidad_producto-cantidad>0){
                            pstmt.setInt(1,cantidad_producto-cantidad);
                            pstmt.setInt(2,id);
                            pstmt.executeUpdate();
                        }
                        else{
                            String deleteQ = "delete from producto WHERE id = ?";
                            try (PreparedStatement ps = conn.prepareStatement(deleteQ)){
                                ps.setInt(1,id);
                                ps.executeUpdate();
                            }
                        }
                    }
                }
            }
            conn.commit();
        }catch(SQLException e){ 
            System.out.println(e.getMessage());
        }
    }

}