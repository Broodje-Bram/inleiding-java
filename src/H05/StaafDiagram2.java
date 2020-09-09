package H05;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagram2 extends Applet {
    public void init() {
    }
    public void paint(Graphics g) {

        // Kilograms
        g.drawString("100 kg", 10, 50);
        g.drawString("80 kg", 10, 75);
        g.drawString("60 kg", 10, 100);
        g.drawString("40 kg", 10, 125);
        g.drawString("20 kg", 10, 150);
        g.drawString("0 kg", 10, 175);

        // stafen

        //Valerie
        g.setColor(Color.pink);
        g.fillRect(113,200,80, 40 );
        g.setColor(Color.black);
        g.drawString("Valerie", 130, 190);

        //Hans
        g.setColor(Color.DARK_GRAY);
        g.fillRect(184,75,66, 100 );
        g.setColor(Color.black);
        g.drawString("Hans",204, 190);

        //Jeroen
        g.setColor(Color.blue);
        g.fillRect(50, 50, 66, 125);
        g.setColor(Color.black);
        g.drawString("Jeroen",60, 190);

        //lijnen
        g.setColor(Color.black);
        g.drawRect(50, 50, 200, 75);
        g.drawRect(50, 50, 200, 25);
        g.drawRect(50, 50, 200, 50);
        g.drawRect(50, 50, 200, 75);
        g.drawRect(50, 50, 200, 100);
        g.drawRect(50, 50, 200, 125);


    }
}
