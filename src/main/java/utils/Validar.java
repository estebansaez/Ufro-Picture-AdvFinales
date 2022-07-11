package utils;

import datos.VentanaUsuario;

import javax.swing.*;
import java.awt.*;

public class Validar extends Component {
    public Validar(){}

    public void ValidarNombre(){
        VentanaUsuario nombre = new VentanaUsuario();
            try {
                if(!nombre.CajaDeTexto1().isEmpty()){

                }else {
                    JOptionPane.showMessageDialog(this, "Ingresa un nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }

    }
}
