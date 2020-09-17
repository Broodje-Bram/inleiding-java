package H11;

import java.awt.*;
import java.applet.Applet;

public class H11_2 extends Applet {
    public void paint(Graphics g) {
        g.setFont(new Font ("Default", Font.BOLD, 20 ));
        setBackground(Color.CYAN);
        g.setColor(Color.red);
        g.drawString("20,19,18,17,16,15,14,13,12,11,10",20, 20);
    }
}
