package H05;

import java.applet.Applet;
import java.awt.*;

public class StaafDiagram2 extends Applet {
    int KgValerie;
    int KgHans;
    int KgJeroen;

    public void init() {
        KgValerie = 40;
        KgHans = 80;
        KgJeroen = 100;
    }
    public void paint(Graphics g) {

        // Kilograms
        g.drawString("100 kg", 10, 20);
        g.drawString("80 kg", 10, 40);
        g.drawString("60 kg", 10, 60);
        g.drawString("40 kg", 10, 80);
        g.drawString("20 kg", 10, 100);
        g.drawString("0 kg", 10, 120);

        // stafen

        //Valerie
        g.setColor(Color.pink);
        g.fillRect(113,120-KgValerie,80, KgValerie );
        g.setColor(Color.black);
        g.drawString("Valerie", 130, 130);

        //Hans
        g.setColor(Color.DARK_GRAY);
        g.fillRect(184,120-KgHans,66, KgHans );
        g.setColor(Color.black);
        g.drawString("Hans",204, 130);

        //Jeroen
        g.setColor(Color.blue);
        g.fillRect(50, 120-KgJeroen, 66, KgJeroen);
        g.setColor(Color.black);
        g.drawString("Jeroen",60, 130);

        //lijnen
        g.setColor(Color.black);
        g.drawRect(50,20,199,20);
        g.drawRect(50,40,199,20);
        g.drawRect(50,60,199,20);
        g.drawRect(50,80,199,20);
        g.drawRect(50,100,199,20);
    }
}
