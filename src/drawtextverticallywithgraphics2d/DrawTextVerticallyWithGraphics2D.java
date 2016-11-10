
package drawtextverticallywithgraphics2d;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.geom.AffineTransform;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawTextVerticallyWithGraphics2D extends JFrame{
    int coor = 0;
    public DrawTextVerticallyWithGraphics2D() {
        addControls();
        addEvent();
    }
    public void addControls(){
        Container con = getContentPane();
        Panel pn = new Panel();
        pn.setLayout(new BorderLayout());
        pn.add(new myComponent(), BorderLayout.CENTER);
        con.add(pn);
    }
    
    class myComponent extends JComponent{

        @Override
        public void paint(Graphics g) {
            Graphics2D graphics2D = (Graphics2D) g;
            AffineTransform affineTransform = new AffineTransform();
//          affineTransform.setToScale(1.5,1.5);
            for(coor = 0; coor < 10; ++coor){
                affineTransform.setToRotation(coor);
                graphics2D.setTransform(affineTransform);
//          FontMetrics fontMetrics = g.getFontMetrics();
//          graphics2D.drawString("Hello world".toUpperCase(), 250, fontMetrics.getAscent());
                graphics2D.setColor(Color.red);
                graphics2D.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 40));
                graphics2D.drawString("Hello world".toUpperCase(), 50, 50);
            }
            
               
        }
        
    }
    public void addEvent(){
    
    }
    public void showWindow(){
        this.setSize(500, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        DrawTextVerticallyWithGraphics2D drawText = new DrawTextVerticallyWithGraphics2D();
        drawText.showWindow();
    }
    
}
