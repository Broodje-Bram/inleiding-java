package H03;

import java.awt.*;
import java.applet.Applet;

public class Dobblesteen extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.MAGENTA);
        g.setColor(Color.white);
        g.fillRect(100, 125, 100, 100);
        g.setColor(Color.black);
        g.drawRect(100, 125, 100, 100);
        g.setColor(Color.black);
        g.fillArc(110, 130, 30, 30, 90, 360);
        g.fillArc(160, 130, 30, 30, 90, 360);
        g.fillArc(160, 190, 30, 30, 90, 360);
        g.fillArc(110, 190, 30, 30, 90, 360);
    }

}
