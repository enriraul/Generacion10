
import javax.swing.JOptionPane;

public class Login {
    private LoginPanel view;
    private NavegarPanel nav;
    private DreamsDB db;

    public Login(LoginPanel view, NavegarPanel nav, DreamsDB db){
        this.view = view;
        this.nav = nav;
        this.db = db;
        view.loginbtn.addActionListener(e-> this.login());
        view.createbtn.addActionListener(e->this.crearUsuario());
    }
    public void login(){
        String nombre = view.usertxt.getText();
        String correo = view.correotxt.getText();

        if (db.validarCliente(nombre,correo)) {
            nav.CargarPanel("Menu");
        }
        else{
            JOptionPane.showMessageDialog(null, "Credenciales no son válidas");
        }
    }
    public void crearUsuario(){
        nav.CargarPanel("CrearUsuario");
    }
}