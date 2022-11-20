import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.awt.*;
import java.awt.geom.*;

public class Main {
    public static void solition(Map<Integer,String> denklem,int sonuc) {
        Set a= denklem.keySet();
        System.out.println(a.toString());

    }
    public static void main(String[] args) {
        JFrame x = new JFrame();
        int w = 1000;
        int h = 1000;
        x.setSize(w,h);
        x.add(new KoordinatManager(new KordinatTablosu(w,h)));
        x.setTitle("Grafik Yöntem");
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.setVisible(true);
    }
}