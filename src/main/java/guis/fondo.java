package guis;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class fondo extends JPanel {

    @Override
    public void paint(Graphics g) {
        File file = new File("C:\\Users\\Esteban Saez\\IdeaProjects\\Ufro-PictureV0.2\\Imagenes\\1366_2000.png");
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ImageIcon imagen = new ImageIcon(bufferedImage);
        g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
    }
}
