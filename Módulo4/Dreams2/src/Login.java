
import javax.swing.JOptionPane;

public class Login {
    private LoginFrame view;

    public Login(LoginFrame view){
        this.view = view;
        view.loginbtn.addActionListener(e-> this.login());
        view.createbtn.addActionListener(e->this.crearUsuario());
    }
    public void login(){
        String nombre = view.usertxt.getText();
        String passwd = view.psswdtxt.getText();
        //db.validarCliente(nombre,passwd);
        if (db.validarCliente(nombre,passwd)) {
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Credenciales no son válidas");
        }
    }
}