package guis;

import modelo.Botones;
import modelo.EtiquetasImagen;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Menu extends JFrame implements ActionListener {
    FondoMenu fondo = new FondoMenu();
    Botones botones = new Botones();
    EtiquetasImagen etiquetas = new EtiquetasImagen();
    JButton botonSalir;

    public Menu() throws IOException {
        setSize(1000, 680);
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
        botones.eventos();
        boton();
        cerrar();
    }

    public void boton() {
        botonSalir = new JButton();
        botonSalir.setText("CERRAR SESION");
        botonSalir.setBounds(415, 500, 150, 50);
        botonSalir.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(botonSalir);
        botonSalir.setOpaque(true);
        botonSalir.setBackground(Color.LIGHT_GRAY);
    }

    public void cerrar() {
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}