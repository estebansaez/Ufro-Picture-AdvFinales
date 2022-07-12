package modelo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import guis.FondoMenu;
import guis.ImagenSelec;
import guis.Menu;

public class Botones extends JFrame {
    public JButton boton2;
    public JButton boton3;
    public JButton boton4;
    public JButton boton5;
    public JButton boton6;
    public JButton boton7;
    public JButton boton8;
    public JButton boton9;

    public ImagenSelec imagen = new ImagenSelec();

    public Botones() {
    }

    public void añadirBotonesSeleccionadores(FondoMenu fondo) {
        boton2 = new JButton();
        boton2.setText("Seleccionar");
        boton2.setBounds(50, 100, 120, 20);
        boton2.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(boton2);
        boton2.setOpaque(true);
        boton2.setBackground(Color.lightGray);

        boton3 = new JButton();
        boton3.setText("Seleccionar");
        boton3.setBounds(290, 100, 120, 20);
        boton3.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(boton3);
        boton3.setOpaque(true);
        boton3.setBackground(Color.LIGHT_GRAY);

        boton4 = new JButton();
        boton4.setText("Seleccionar");
        boton4.setBounds(540, 100, 120, 20);
        boton4.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(boton4);
        boton4.setOpaque(true);
        boton4.setBackground(Color.LIGHT_GRAY);

        boton5 = new JButton();
        boton5.setText("Seleccionar");
        boton5.setBounds(790, 100, 120, 20);
        boton5.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(boton5);
        boton5.setOpaque(true);
        boton5.setBackground(Color.LIGHT_GRAY);

        boton6 = new JButton();
        boton6.setText("Seleccionar");
        boton6.setBounds(50, 250, 120, 20);
        boton6.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(boton6);
        boton6.setOpaque(true);
        boton6.setBackground(Color.LIGHT_GRAY);

        boton7 = new JButton();
        boton7.setText("Seleccionar");
        boton7.setBounds(290, 250, 120, 20);
        boton7.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(boton7);
        boton7.setOpaque(true);
        boton7.setBackground(Color.LIGHT_GRAY);

        boton8 = new JButton();
        boton8.setText("Seleccionar");
        boton8.setBounds(540, 250, 120, 20);
        boton8.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(boton8);
        boton8.setOpaque(true);
        boton8.setBackground(Color.LIGHT_GRAY);

        boton9 = new JButton();
        boton9.setText("Seleccionar");
        boton9.setBounds(790, 250, 120, 20);
        boton9.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(boton9);
        boton9.setOpaque(true);
        boton9.setBackground(Color.LIGHT_GRAY);


    }

    public void eventos() {
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.imagen1();
                imagen.setVisible(true);
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.imagen2();
                imagen.setVisible(true);
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.imagen3();
                imagen.setVisible(true);
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.imagen4();
                imagen.setVisible(true);
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.imagen5();
                imagen.setVisible(true);
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.imagen6();
                imagen.setVisible(true);
            }
        });
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.imagen7();
                imagen.setVisible(true);
            }
        });
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.imagen8();
                imagen.setVisible(true);
            }
        });

    }


}
