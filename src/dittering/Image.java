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
import javax.swing.JFileChooser;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.Graphics;
import javax.swing.JFrame;

import java.awt.image.BufferedImage;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author pollepel
 */
public class Image extends JFrame{
    private BufferedImage bi;
    
    public void showImage(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        JFileChooser chooser= new JFileChooser();
//        chooser.showOpenDialog(null);
//        File chosenFile = chooser.getSelectedFile();
//        try {
//          bi = ImageIO.read(chosenFile);
//        } catch (Exception e) {
//          e.printStackTrace();
//        }
        setSize(bi.getWidth(), bi.getHeight());
    }

    public void openAFile(/*String dir, String name*/){
        JFileChooser chooser= new JFileChooser();
        chooser.showOpenDialog(null);
        File chosenFile = chooser.getSelectedFile();
        try {
          bi = ImageIO.read(chosenFile);
        } catch (Exception e) {
          e.printStackTrace();
        }
        
//        JFileChooser chooser= new JFileChooser();
//        chooser.showOpenDialog(null);
//        File chosenFile = chooser.getSelectedFile();
//        BufferedImage img = null;
//        try {
//            img = ImageIO.read(chosenFile);
//            System.out.println(chosenFile.getAbsolutePath());
//            System.out.println(chosenFile.getPath());
//            
//            File outputfile = new File("test.jpg");
//            ImageIO.write(img, "jpg", outputfile);
//        } catch (IOException e) {
//            System.out.println("Could not create file");
//        }
    }
       
    private void createAFile(String dir, String name){
        try {
            //File dir = new File("tmp/test");
            File file = new File(dir);
            file.mkdirs();
            //File tmp = new File(file, "tmp.txt");
            File tmp = new File(file, name);
            tmp.createNewFile();
        } catch (IOException e) {
            System.out.println("Could not create file");
        }
    }    
    
    public void saveAFile(String dir, String name){
        try {
            //File dir = new File("tmp/test");
            File file = new File(dir);
            file.mkdirs();
            //File tmp = new File(file, "tmp.jpg");
            File tmp = new File(file, name);
            tmp.createNewFile();
            ImageIO.write(bi, "jpg", tmp);
        } catch (IOException e) {
            System.out.println("Could not create file");
        }
    }
    
    public void paint(Graphics g) {
        g.drawImage(bi, 0, 0, getWidth(), getHeight(), this);
    }    
}