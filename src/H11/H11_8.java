package H11;

import java.awt.*;
import java.applet.Applet;

public class H11_8 extends Applet {
    public void paint (Graphics g) {
        int radius = 400, width = 1800, height = 1000;
        do {
            int x=width/2-radius, y=height/2-radius;
            g.drawOval (x, y, 2*radius, 2*radius);
            radius -= 4;
        } while (radius > 0);
    }
}
