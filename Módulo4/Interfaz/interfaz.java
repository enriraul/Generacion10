//import java.awt.*; CardLayout
import javax.swing.*;

public class interfaz extends JFrame{
    private JPanel panel1;

    public interfaz(){

        setTitle("Interfaz prueba");
        setSize(1000,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel1 = new JPanel(null);
        JPasswordField nombreUsuario = new JPasswordField();
        nombreUsuario.setBounds(240, 20, 100, 30);
        JLabel nombreUsuarioText = new JLabel("Ingrese el nombre del usuario: ");
        nombreUsuarioText.setBounds(20, 20, 200, 30);
        JTextArea descripcion = new JTextArea();
        descripcion.setBounds(20,70,400,200);
        JButton boton_aceptar = new JButton("aceptar");
        panel1.add(nombreUsuarioText);
        panel1.add(nombreUsuario);
        panel1.add(descripcion);
        panel1.add(boton_aceptar);

        add(panel1);
        setVisible(true);
    }
    public static void main(String[] args) {
        interfaz  pantalla = new interfaz();
    }
}