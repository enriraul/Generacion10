import java.awt.CardLayout;
import javax.swing.*;

public class MainFrame extends JFrame{
    public MainFrame(){

        DreamsDB db = new DreamsDB();
        CardLayout layout = new CardLayout();
        JPanel contenedor = new JPanel(layout);
        NavegarPanel nv = new NavegarPanel(layout,contenedor);
        LoginPanel loginP = new LoginPanel();
        new Login(loginP,nv, db);
        CrearClientePanel crearP = new CrearClientePanel();
        new CrearCliente(crearP,nv,db);
        MenuPanel menuP = new MenuPanel();
        new Menu(menuP,db, nv);

        contenedor.add(loginP,"Login");
        contenedor.add(crearP,"CrearUsuario");
        contenedor.add(menuP,"Menu");

        add(contenedor);
        setSize(1000,800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}