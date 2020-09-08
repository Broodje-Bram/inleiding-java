package H04;

import java.awt.*;
import java.applet.Applet;

public class Show4 extends Applet {
    public void init() {
    }
    //Driehoek
    public void paint(Graphics g) {
        setBackground(Color.red);
        g.drawLine(50, 120, 270, 120);
        g.drawLine(50, 120, 170, 240);
        g.drawLine(270, 120, 170, 240);

        //Huis muur
        g.drawRect(400, 125, 300, 300);

        //Huis Dak
        g.drawLine(750, 125, 350, 125);
        g.drawLine(750, 125, 550, 40);
        g.drawLine(350, 125, 550, 40);

        //Huis Deur
        g.drawRect(550, 325, 50, 100);

        //Raam
        g.drawRect(430, 200, 100, 100);


    }

}
