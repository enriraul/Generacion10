import javax.swing.*;


public class CrearClientePanel extends JPanel{

    public JLabel userL, psswdL;
    public JTextField usertxt,correotxt;
    public JButton creatbtn, cancelbtn;

    public CrearClientePanel(){
            
        setLayout(null);
        userL = new JLabel("Usuario");
        userL.setBounds(100, 100, 150, 30);
        usertxt = new JTextField();        
        usertxt.setBounds(100, 200, 250, 30);
    

        psswdL = new JLabel("Correo");
        psswdL.setBounds(100, 150 , 150, 30);
        correotxt = new JTextField();
        correotxt.setBounds(100,250,250,30);

        creatbtn = new JButton("Crear cuenta");
        creatbtn.setBounds(100, 290, 150, 40);
        cancelbtn = new JButton("Cancelar");
        cancelbtn.setBounds(300, 290,150, 40);

        add(userL);
        add(psswdL);
        add(usertxt);
        add(correotxt);
        add(creatbtn);
        add(cancelbtn);
    }
}