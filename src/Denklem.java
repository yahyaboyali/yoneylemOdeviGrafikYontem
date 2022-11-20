import javax.swing.*;

public class Denklem extends JComponent {
    private int a,b,n;

    public Denklem(int a, int b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
