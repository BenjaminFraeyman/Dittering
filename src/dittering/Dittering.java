/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dittering;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author pollepel
 */
public class Dittering {
    private BufferedImage img;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("strawberry.jpg"));
        } catch (IOException e) {
        }
    }
    
}
