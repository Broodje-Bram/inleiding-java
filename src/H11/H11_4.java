package H11;

import java.awt.*;
import java.applet.Applet;

public class H11_4 extends Applet {
    public void paint(Graphics g) {
        g.setFont(new Font ("Default", Font.BOLD, 20 ));
        setBackground(Color.CYAN);
        g.setColor(Color.red);
        g.drawString("0x3= 0", 20,20);
        g.drawString("1x3= 3", 20,40);
        g.drawString("2x3= 6", 20,60);
        g.drawString("3x3= 9", 20,80);
        g.drawString("4x3= 12", 20,100);
        g.drawString("5x3= 15", 20,120);
        g.drawString("6x3= 18", 20,140);
        g.drawString("7x3= 21", 20,160);
        g.drawString("8x3= 24", 20,180);
        g.drawString("9x3= 27", 20,200);
        g.drawString("10x3= 30", 20,220);
    }
}
