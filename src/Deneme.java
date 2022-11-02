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
        Line2D yekseni = new Line2D.Double(200, 400, 200, 20);
        Line2D xekseni = new Line2D.Double(50, 200, 450, 200);
        Line2D L2D3 = new Line2D.Double(200, 150, 400, 200);
        Line2D L2D4 = new Line2D.Double(200, 100, 300, 200);
        g2d.setColor(new Color(154, 8, 23,221));
        g2d.draw(yekseni);
        g2d.draw(xekseni);
        g2d.draw(L2D3);
        g2d.draw(L2D4);
    }
}
