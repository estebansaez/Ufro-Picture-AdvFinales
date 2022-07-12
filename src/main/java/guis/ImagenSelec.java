package guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImagenSelec extends JFrame {
    JPanel panel;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    public ImagenSelec()  {
        ventana();
        BotonesOpcionales();
        eventos();
    }
    public void ventana(){
        panel = new JPanel();
        setSize(1000,680);
        setTitle("UFRO - PICTURE");
        setLocationRelativeTo(null);
        panel.setLayout(null);
        this.getContentPane().add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void imagen1(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\1.jpg");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0, 0, getWidth(), getHeight());
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);
    }
    public void imagen2(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\2.png");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0, 0, getWidth(), getHeight());
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);
    }
    public void imagen3(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\3.png");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0, 0, getWidth(), getHeight());
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);
    }
    public void imagen4(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\4.jpg");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0, 0, getWidth(), getHeight());
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);
    }
    public void imagen5(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\5.jpg");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0, 0, getWidth(), getHeight());
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);
    }
    public void imagen6(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\6.jpg");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0, 0, getWidth(), getHeight());
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);
    }
    public void imagen7(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\7.png");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0, 0, getWidth(), getHeight());
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);
    }
    public void imagen8(){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\8.jpg");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(0, 0, getWidth(), getHeight());
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiqueta1);
        etiqueta1.setOpaque(true);

    }

    public void BotonesOpcionales() {
        boton1 = new JButton();
        boton1.setText("Establecer como");
        boton1.setBounds(100, 500, 200, 20);
        panel.add(boton1);

        boton2 = new JButton();
        boton2.setText("Descargar");
        boton2.setBounds(660, 500, 200, 20);
        panel.add(boton2);

        boton3 = new JButton();
        boton3.setText("Volver al Menu");
        boton3.setBounds(380, 570, 200, 20);
        panel.add(boton3);
    }

    public void eventos() {
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();

            }
        });
    }
}
