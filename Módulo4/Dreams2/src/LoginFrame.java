import javax.swing.*;
//1000,800
public class LoginFrame extends JPanel {
    public JLabel userL, psswdL;
    public JTextField usertxt;
    public JPasswordField psswdtxt;
    public JButton loginbtn, createbtn;

    public LoginFrame(){
        
        setLayout(null);
        userL = new JLabel("Usuario");
        userL.setBounds(100, 100, 150, 30);
        psswdL = new JLabel("Contraseña");
        psswdL.setBounds(100, 150 , 150, 30);
        usertxt = new JTextField();
        usertxt.setBounds(280, 100, 250, 30);
        psswdtxt = new JPasswordField();
        psswdtxt.setBounds(280,150,250,30);
        loginbtn = new JButton("Iniciar sesión");
        loginbtn.setBounds(400, 190, 150, 40);
        createbtn = new JButton("Crear cuenta");
        createbtn.setBounds(200, 190,150, 40);

        add(userL);
        add(psswdL);
        add(usertxt);
        add(psswdtxt);
        add(loginbtn);
        add(createbtn);
    }

}