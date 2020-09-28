package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_6 extends Applet {
    public void paint(Graphics g) {
        int radius = 25, width = 180, height = 150;
        do {
            int x=width/2-radius, y=height/2-radius;
            g.drawOval (x, y, 2*radius, 2*radius);
            radius -= 5;
        } while (radius > 0);
    }
}
