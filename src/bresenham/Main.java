/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bresenham;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author IlhamYanuar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public Main() {
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("algoritma garis bresenham");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        garis grs = new garis();
        
        grs.setx0(3.1);
        grs.sety0(10.8);
        grs.setx1(300.3);
        grs.sety1(161.80);
        grs.setBackground(Color.BLACK);
        
        frame.add(grs);
        frame.setSize(600,600);
        frame.setVisible(true);
        
    }

}
