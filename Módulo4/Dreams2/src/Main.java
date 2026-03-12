import javax.swing.SwingUtilities;

public class Main{
    public static void main(String[] args) {
        /*
        DreamsDB dreamsdb = new DreamsDB();
        dreamsdb.mostrarInventario();

        List <String> categorias = new ArrayList<>();
        categorias.add("Higiene");
        categorias.add("Productos personal");
        dreamsdb.ingresarProducto("Desodorante", 65.0, categorias, 50);*/
        SwingUtilities.invokeLater(()-> 
            {
                new MainFrame();
            }
        );

    }
}