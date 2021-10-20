
package Modelo;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
 

public class ImagenFondo implements Border{
    public BufferedImage back;
    private String nombreImagen;

    public ImagenFondo(String nombreImagen) {
        this.nombreImagen = nombreImagen;
        try {
            URL imagePath = new URL(getClass().getResource(nombreImagen).toString());
            back = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }
    
    public ImagenFondo(){
        try {
            URL imagePath = new URL(getClass().getResource("/Vista/Imagenes/0.jpg").toString());
            back = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back, (x + (width - back.getWidth())/2),(y + (height - back.getHeight())/2), null);
    }
 
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }
 
    public boolean isBorderOpaque() {
        return false;
    }
 
}
