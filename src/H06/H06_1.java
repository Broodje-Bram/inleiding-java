package H06;

import java.awt.*;
import java.applet.Applet;

public class H06_1 extends Applet {
    double a, c, uitkomst;


    public void init() {
        a = 113;
        c = 4;
        uitkomst = a/c;
    }

    public void paint(Graphics g) {
        g.drawString("Jan Krijgt = €" + uitkomst, 20, 20);
        g.drawString("Ali Krijgt = €" + uitkomst, 20, 40);
        g.drawString("Jeannette krijg = €" + uitkomst, 20, 60);
        g.drawString("Ik krijg = €" + uitkomst, 20, 80);
    }
}
