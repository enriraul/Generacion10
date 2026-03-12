import javax.swing.*;
//1000,800
public class LoginPanel extends JPanel {
    public JLabel userL, psswdL;
    public JTextField usertxt,correotxt;
    public JButton loginbtn, createbtn;

    public LoginPanel(){
        
        setLayout(null);
        userL = new JLabel("Usuario");
        userL.setBounds(100, 100, 150, 30);
        psswdL = new JLabel("Contraseña");
        psswdL.setBounds(100, 150 , 150, 30);
        usertxt = new JTextField();
        usertxt.setBounds(280, 100, 250, 30);
        correotxt = new JTextField();
        correotxt.setBounds(280,150,250,30);
        loginbtn = new JButton("Iniciar sesión");
        loginbtn.setBounds(400, 190, 150, 40);
        createbtn = new JButton("Crear cuenta");
        createbtn.setBounds(200, 190,150, 40);

        add(userL);
        add(psswdL);
        add(usertxt);
        add(correotxt);
        add(loginbtn);
        add(createbtn);
    }

}