import java.awt.*;
import javax.swing.*;

public class componentes {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Componentes Básicos Swing");
        ventana.setSize(500,400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout()); 
        JLabel etiqueta = new JLabel("Nombre:");
        JTextField campoTexto = new JTextField(10);
        JButton boton = new JButton("Aceptar");
        JCheckBox checkJava = new JCheckBox("Java");
        JCheckBox checkPython = new JCheckBox("Python"); 
        JRadioButton radio1 = new JRadioButton("Hombre");
        JRadioButton radio2 = new JRadioButton("Mujer");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radio1);
        grupo.add(radio2);
        String[] paises = {"México","España","Chile"};
        JComboBox<String> combo = new JComboBox<>(paises);
        String[] frutas = {"Manzana","Pera","Uva"};
        JList<String> lista = new JList<>(frutas);
        JToggleButton toggle = new JToggleButton("Activar");
        JSlider slider = new JSlider(0,100,50);
        JProgressBar progreso = new JProgressBar(0,100);
        progreso.setValue(40);
        panel.add(etiqueta);
        panel.add(campoTexto);
        panel.add(boton);
        panel.add(checkJava);
        panel.add(checkPython);
        panel.add(radio1);
        panel.add(radio2);
        panel.add(combo);
        panel.add(new JScrollPane(lista));
        panel.add(toggle);
        panel.add(slider);
        panel.add(progreso);
        ventana.add(panel);
        ventana.setVisible(true);
    }
}