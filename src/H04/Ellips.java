package H04;

import java.awt.*;
import java.applet.Applet;

public class Ellips extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(20, 20, 150, 200, 90, 360);
    }
}
