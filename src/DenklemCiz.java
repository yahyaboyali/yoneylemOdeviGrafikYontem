import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class DenklemCiz extends JComponent {

    private DenklemManager denklemManager;

    public DenklemCiz(DenklemManager denklemManager) {
        this.denklemManager = denklemManager;
    }
    public void paint(Graphics graphics) {

        Graphics2D g2d = (Graphics2D) graphics;
        Line2D denklem1 = new Line2D.Double(denklemManager.calculate().getResultOfDenklem().getX()*10,
                denklemManager.calculate().getResultOfDenklem().getY()*10,
                denklemManager.calculate().getResultOfDenklem().getX()*100,
                denklemManager.calculate().getResultOfDenklem().getY()*100);
        g2d.setColor(new Color(154, 8, 23,221));
        g2d.draw(denklem1);
    }
}
