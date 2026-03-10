import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        DreamsDB dreamsdb = new DreamsDB();
        dreamsdb.mostrarInventario();

        List <String> categorias = new ArrayList<>();
        categorias.add("Higiene");
        categorias.add("Productos personal");
        dreamsdb.ingresarProducto("Desodorante", 65.0, categorias, 50);
    }
}