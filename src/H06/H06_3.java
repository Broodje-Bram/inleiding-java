package H06;

import java.awt.*;
import java.applet.Applet;

public class H06_3 extends Applet {
    int a,b,c;

    public void init() {
        a = 500;
        b = 800;
        c = a-b;

    }
    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.drawString("Antwoord =" + c, 50, 50);
    }
}
