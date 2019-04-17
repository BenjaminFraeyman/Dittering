/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dittering;
//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;
//import java.io.File;
//import java.io.IOException;
//import javax.swing.JFileChooser;
//import java.io.Writer;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.awt.Graphics;
//import javax.swing.JFrame;
/**
 *
 * @author pollepel
 */
public class Dittering/* extends JFrame*/{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image image = new Image();
        image.openAFile();
        image.showImage();
        image.setVisible(true);
        
        image.saveAFile("tmp/test", "test.jpg");
    }
}
