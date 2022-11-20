import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Deneme extends JComponent{
    private int w;
    private int h;
    public Deneme (int w,int h){
        this.w = w;
        this.h = h;
    }
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //3x1 +2x2 = z
        // x1+2x2>=0
        //x1+3x2<=6
        //x1,x2 >=0

        Line2D yekseni = new Line2D.Double(400, 800, 400, 40);
        Line2D xekseni = new Line2D.Double(100, 400, 900, 400);
        Line2D L2D3 = new Line2D.Double(400, 300, 800, 400);
        Line2D L2D4 = new Line2D.Double(400, 200, 600, 400);
        g2d.setColor(new Color(154, 8, 23,221));
        g2d.draw(yekseni);
        g2d.draw(xekseni);
        g2d.draw(L2D3);
        g2d.draw(L2D4);
    }
}
