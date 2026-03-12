import javax.swing.*;

public class MenuPanel extends JPanel{
    public JTextArea bloqueTexto;
    public JScrollPane panel;
    public JTextField opciones;
    public JButton aceptar, regresar;

    public MenuPanel(){

        setLayout(null);
        bloqueTexto = new JTextArea();
        panel = new JScrollPane(bloqueTexto);
        panel.setBounds(100, 100, 800, 300);
        opciones = new JTextField();
        opciones.setBounds(100, 430, 250, 30);
        aceptar = new JButton("Aceptar");
        aceptar.setBounds(380, 430,200,30);
        regresar = new JButton("Regresar al Menu");
        regresar.setBounds(380, 430,200,30);
        regresar.setVisible(false);

        add(panel);
        add(opciones);
        add(aceptar);
        add(regresar);

    }
}