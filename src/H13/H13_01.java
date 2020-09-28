package H13;

import java.awt.*;
import java.applet.Applet;

public class H13_01 extends Applet {
    public void paint(Graphics g) {
        drawTriangle(g, 30, 30, 60, 30, 45, 90);
    }

    void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);

    }
}
