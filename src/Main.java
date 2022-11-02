import javax.swing.*;
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
        int w = 500;
        int h = 500;
        x.setSize(w,h);
        x.setTitle("deneme");
        x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x.add(new Deneme(w,h));
        x.setVisible(true);
    }
}