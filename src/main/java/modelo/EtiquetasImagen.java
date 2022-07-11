package modelo;
import guis.fondo;

import javax.swing.*;
import java.awt.*;

public class EtiquetasImagen extends JFrame{

    public EtiquetasImagen(){}

    public void etiquetas(fondo f){
        ImageIcon imagen1 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\1.jpg");
        JLabel etiqueta1 = new JLabel();
        etiqueta1.setBounds(50, 10, 120,80);
        etiqueta1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
        f.add(etiqueta1);
        etiqueta1.setOpaque(true);

        ImageIcon imagen2 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\2.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(290, 10, 120,80);
        etiqueta2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        f.add(etiqueta2);
        etiqueta2.setOpaque(true);

        ImageIcon imagen3 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\3.png");
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(540, 10, 120,80);
        etiqueta3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));
        f.add(etiqueta3);
        etiqueta3.setOpaque(true);

        ImageIcon imagen4 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\4.jpg");
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(790, 10, 120,80);
        etiqueta4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(), Image.SCALE_SMOOTH)));
        f.add(etiqueta4);
        etiqueta4.setOpaque(true);

        ImageIcon imagen5 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\5.jpg");
        JLabel etiqueta5 = new JLabel();
        etiqueta5.setBounds(50, 160, 120,80);
        etiqueta5.setIcon(new ImageIcon(imagen5.getImage().getScaledInstance(etiqueta5.getWidth(), etiqueta5.getHeight(), Image.SCALE_SMOOTH)));
        f.add(etiqueta5);
        etiqueta5.setOpaque(true);

        ImageIcon imagen6 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\6.jpg");
        JLabel etiqueta6 = new JLabel();
        etiqueta6.setBounds(290, 160, 120,80);
        etiqueta6.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(etiqueta6.getWidth(), etiqueta6.getHeight(), Image.SCALE_SMOOTH)));
        f.add(etiqueta6);
        etiqueta6.setOpaque(true);

        ImageIcon imagen7 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\7.png");
        JLabel etiqueta7 = new JLabel();
        etiqueta7.setBounds(540, 160, 120,80);
        etiqueta7.setIcon(new ImageIcon(imagen7.getImage().getScaledInstance(etiqueta7.getWidth(), etiqueta7.getHeight(), Image.SCALE_SMOOTH)));
        f.add(etiqueta7);
        etiqueta7.setOpaque(true);

        ImageIcon imagen8 = new ImageIcon("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\8.jpg");
        JLabel etiqueta8 = new JLabel();
        etiqueta8.setBounds(790, 160, 120,80);
        etiqueta8.setIcon(new ImageIcon(imagen8.getImage().getScaledInstance(etiqueta8.getWidth(), etiqueta8.getHeight(), Image.SCALE_SMOOTH)));
        f.add(etiqueta8);
        etiqueta8.setOpaque(true);

    }
}

