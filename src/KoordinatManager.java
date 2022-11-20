import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class KoordinatManager extends JComponent {
    private KordinatTablosu kordinatTablosu;

    public KoordinatManager(KordinatTablosu kordinatTablosu) {
        this.kordinatTablosu = kordinatTablosu;
    }
    public void paint(Graphics graphics){
        Graphics2D g2d = (Graphics2D) graphics;

        Line2D xEkseni = new Line2D.Double(kordinatTablosu.getW()/10.0,kordinatTablosu.getH()/3.0,9*kordinatTablosu.getW()/10.0,kordinatTablosu.getH()/3.0);
        Line2D yEkseni = new Line2D.Double(kordinatTablosu.getW()/3,3*kordinatTablosu.getH()/5,kordinatTablosu.getW()/3,kordinatTablosu.getH()/25.0);
        DenklemManager denklemManager = new DenklemManager(new Denklem(1,3,6));
        DenklemManager denklemManager2 = new DenklemManager(new Denklem(0,2,0));
        Line2D denklem1 = new Line2D.Double(denklemManager.calculate().getResultOfDenklem().getX()+200,
                denklemManager.calculate().getResultOfDenklem().getY(),
                denklemManager.calculate().getResultOfDenklem().getX()+kordinatTablosu.getW(),
                denklemManager.calculate().getResultOfDenklem().getY()+kordinatTablosu.getW());
        Line2D denklem2 = new Line2D.Double(denklemManager2.calculate().getResultOfDenklem().getX(),
                denklemManager2.calculate().getResultOfDenklem().getY()*100,
                denklemManager2.calculate().getResultOfDenklem().getX()+kordinatTablosu.getW(),
                denklemManager2.calculate().getResultOfDenklem().getY()+kordinatTablosu.getW());

        g2d.setColor(new Color(154, 8, 23,221));
        g2d.draw(yEkseni);
        g2d.draw(xEkseni);
        g2d.draw(denklem2);
        g2d.draw(denklem1);
    }
}
