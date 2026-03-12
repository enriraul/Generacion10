import java.awt.CardLayout;
import javax.swing.JPanel;

public class NavegarPanel{

    private CardLayout layout;
    private JPanel contenedor;

    public NavegarPanel(CardLayout layout, JPanel contenedor){
        this.contenedor = contenedor;
        this.layout = layout;
    } 

    public void CargarPanel(String TagPanel){
        layout.show(contenedor, TagPanel);
    }

}