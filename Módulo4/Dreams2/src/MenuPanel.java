import javax.swing.*;

public class MenuPanel extends JPanel{
    public JTextArea bloqueTexto;
    public JTextField opciones;
    public JButton aceptar;

    public MenuPanel(){

        setLayout(null);
        bloqueTexto = new JTextArea();
        bloqueTexto.setBounds(100, 100, 800, 300);
        opciones = new JTextField();
        opciones.setBounds(100, 430, 250, 30);
        aceptar = new JButton();
        aceptar.setBounds(380, 430,200,30);

        add(bloqueTexto);
        add(opciones);
        add(aceptar);

    }
}