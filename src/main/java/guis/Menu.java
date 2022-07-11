package guis;

import datos.VentanaUsuario;
import modelo.Botones;
import modelo.EtiquetasImagen;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;


public class Menu extends JFrame implements ActionListener {
    fondo fondo = new fondo();
    Botones botones = new Botones();
    EtiquetasImagen etiquetas = new EtiquetasImagen();

    public Menu() throws IOException {
        setSize(1000,680);
        setTitle("UFRO - PICTURE");
        setLocationRelativeTo(null);
        fondo.setLayout(null);
        this.getContentPane().add(fondo);
        añadirPartes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void añadirPartes() {
        etiquetas.etiquetas(fondo);
        botones.añadirBotonesSeleccionadores(fondo);
        botones.añadorBotonesOpcionales(fondo);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}