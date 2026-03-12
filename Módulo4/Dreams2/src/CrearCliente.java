import javax.swing.*;

public class CrearCliente{
    
    private CrearClientePanel view;
    private NavegarPanel nav;
    private DreamsDB db;

    public CrearCliente(CrearClientePanel view, NavegarPanel nav, DreamsDB db){
        this.view = view;
        this.nav = nav;
        this.db = db;
        view.creatbtn.addActionListener(e-> this.crearUsuario());
        view.cancelbtn.addActionListener(e->this.cancelCreate());
    }

    public void crearUsuario(){
        String nombre = view.usertxt.getText();
        String correo = view.correotxt.getText();
        if (nombre.length()>0 && correo.length()>0 && db.ingresarCliente(nombre, correo, "")) {
            JOptionPane.showMessageDialog(null, "Usuario creado");
            nav.CargarPanel("Login");
        }
        else{
            JOptionPane.showMessageDialog(null, "Credenciales no son válidas");
        }
    }
    public void cancelCreate(){
        nav.CargarPanel("Login");
    }
}