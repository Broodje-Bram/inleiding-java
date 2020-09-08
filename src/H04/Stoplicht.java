package H04;

import java.awt.*;
import java.applet.Applet;

public class Stoplicht extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.fillRect(100, 125, 100, 300);
        g.setColor(Color.red);
        g.fillArc(110, 140, 80, 80, 90, 360);
        g.setColor(Color.orange);
        g.fillArc(110, 230, 80, 80, 90, 360);
        g.setColor(Color.GREEN);
        g.fillArc(110,  330, 80, 80, 90, 360);
    }
}
