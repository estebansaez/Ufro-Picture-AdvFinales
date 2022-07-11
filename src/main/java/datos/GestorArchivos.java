package datos;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.File;
import javax.swing.JFrame;

public class GestorArchivos extends JFrame{

    final File[] buscarArchivo = new File[1];
    public JPanel jpButton;
    public JButton elegirArchivo;
    public JLabel jlFileName;
    public JFrame jFrame;
    public JLabel jlTitle;

    public GestorArchivos(){
        JFrame jFrame = new JFrame("Seleccionar fondo");
        jFrame.setSize(450,450);
        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        añadirBotones();
        hacerEventos();
    }

    private void añadirBotones(){
        jlTitle = new JLabel("Enviar Archivo");
        jlTitle.setFont(new Font("Arial",Font.BOLD,25));
        jlTitle.setBorder(new EmptyBorder(20,0,10,0));
        jlTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        jlFileName = new JLabel("Elegir fondo");
        jlFileName.setFont(new Font("Arial",Font.BOLD,20));
        jlFileName.setBorder(new EmptyBorder(50,0,0,0));
        jlFileName.setAlignmentX(Component.CENTER_ALIGNMENT);

        jpButton = new JPanel();
        jpButton.setBorder(new EmptyBorder(75,0,10,0));

        elegirArchivo = new JButton("Elegir archivo");
        elegirArchivo.setPreferredSize(new Dimension(150,75));
        elegirArchivo.setFont(new Font("Arial",Font.BOLD,20));
    }

    private void hacerEventos(){
        //jpButton.add(buscarArchivo);
        jpButton.add(elegirArchivo);

        elegirArchivo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.setDialogTitle("Elegir archivo:");

                if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    buscarArchivo[0]=jFileChooser.getSelectedFile();
                    jlFileName.setText("El archivo que quiere seleccionar es: "+buscarArchivo[0].getName());

                }
            }
        });
    }
}
