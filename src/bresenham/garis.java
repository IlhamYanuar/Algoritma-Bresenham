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
public class garis extends JPanel{
    private double x0,y0,x1,y1;
    
    public double getx0() {
        return x0;
    }
    
    public double getx1() {
        return x1;
    }
    
    public double gety0() {
        return y0;
    }
    
    public double gety1() {
        return y1;
    }
    
    public void setx0(double xa) {
        x0 = xa;
    }
    
    public void sety0(double ya) {
        y0 = ya;
    }
    
    public void setx1(double xb) {
        x1 = xb;
    }
    
    public void sety1(double yb) {
        y1 = yb;
    }
    
    public void paint(Graphics g) {
        double x,y,xend;
        double dx = Math.ceil(x1-x0);
        double dy = Math.ceil(y1-y0);
        double p = 2*dy-dx;
        double duady = 2*dy;
        double duadydx = 2*(dy-dx);
        if (x0>x1) {
            x = x1;
            y = y1;
            xend = x0;
        } else {
            x = x0;
            y = y0;
            xend = x1;
        }
        
       double x3 = Math.ceil(x);
       Float d = new Float(x3);
        int x2 = d.intValue();
        
        double y3 = Math.ceil(y);
       Float f = new Float(y3);
        int y2 = f.intValue();
        
        g.drawRect(x2, y2, 1, 1);
        while(x2<xend) {
            x2++;
            if(p<0) {
                p+=duady;
            } else {
                if (y0>y1) {
                    y2--; } else y2++;
                p+=duadydx;
            }
            g.drawRect(x2, y2, 1, 1);
        }
    }
    
    public garis() {
        
    }
        
}
