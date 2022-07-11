package datos;
import guis.Menu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.EventListener;
import javax.swing.*;
import guis.fondoVentanaUsuario;
import utils.Validar;


public class VentanaUsuario extends JFrame implements EventListener {
    fondoVentanaUsuario fondoU = new fondoVentanaUsuario();
    Validar validar = new Validar();
    public JTextField cajaDeTexto1;
    public JLabel confirmacion;
    public JButton boton1;

    public VentanaUsuario(){
        setSize(400,400);
        setTitle("Datos de Usuario");
        setLocationRelativeTo(null);
        setResizable(false);
        fondoU.setLayout(null);
        this.getContentPane().add(fondoU);
        agregarPartes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void agregarPartes(){
        textoAreas();
        CajaDeTexto1();
        CajadeTexto2();
        colocarBotones();
        crearEventos();
        jButtonActionPerformed();
    }

    private void textoAreas(){
        JTextArea texto = new JTextArea();
        texto.setBounds(30,30,400,50);
        texto.setFont(new Font("arial", Font.ITALIC, 30));
        texto.setForeground(Color.ORANGE);
        texto.setText("Ingrese sus Datos: ");
        texto.setBackground( new Color(0,0,0,0));
        fondoU.add(texto);

        JTextArea texto1 = new JTextArea();
        texto1.setBounds(30,80,100,20);
        texto1.setFont(new Font("arial", Font.ITALIC, 20));
        texto1.setForeground(Color.ORANGE);
        texto1.setText("Nombre");
        texto1.setBackground( new Color(0,0,0,0));
        fondoU.add(texto1);

        JTextArea texto2 = new JTextArea();
        texto2.setBounds(30,120,200,20);
        texto2.setFont(new Font("arial", Font.ITALIC, 20));
        texto2.setForeground(Color.ORANGE);
        texto2.setText("Contraseña");
        texto2.setBackground( new Color(0,0,0,0));
        fondoU.add(texto2);
    }

    public String CajaDeTexto1(){
        cajaDeTexto1 = new JTextField();
        cajaDeTexto1.setBounds(150,80,100,25);
        String texto = cajaDeTexto1.getText();
        fondoU.add(cajaDeTexto1);
        return texto;
    }

    private void CajadeTexto2(){
        JPasswordField cajaDeTexto2 = new JPasswordField();
        cajaDeTexto2.setBounds(150,120,100,25);
        fondoU.add(cajaDeTexto2);
    }

    private void colocarBotones(){
        boton1 = new JButton();
        boton1.setText("Aceptar");
        boton1.setBounds(40,300,100,20);
        fondoU.add(boton1);


        JButton boton2 = new JButton();
        boton2.setText("Salir");
        boton2.setBounds(250,300,100,20);
        fondoU.add(boton2);

        /*confirmacion = new JLabel();
        confirmacion.setBounds(120,320,120,20);
        confirmacion.setFont(new Font("arial",1,10));
        panel.add(confirmacion);*/

    }

    private void crearEventos(){
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                    if(CajaDeTexto1().isEmpty()) {
                        validar.ValidarNombre();
                    }else{JOptionPane.showMessageDialog(null,"Usuario Aceptado");
                        Menu menu = null;
                        try {
                            menu = new Menu();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        menu.setVisible(true);
                        dispose();}

            }
        });
    }

    @SuppressWarnings("uncheked")
    private void jButtonActionPerformed(){
        //Menu nuevaVentana = new Menu();
    }
}
