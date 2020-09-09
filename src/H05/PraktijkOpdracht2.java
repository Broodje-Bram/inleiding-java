package H05;

import java.awt.*;
import java.applet.Applet;

public class PraktijkOpdracht2 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);

        //Lijn
        g.drawLine(20, 20, 220, 20);
        g.drawString("Lijn", 105, 40);

        //Rechthoek
        g.drawRect(20, 50, breedte, hoogte);
        g.drawString("Rechthoek", 90, 165);

        //Afgeronde Rechthoek
        g.drawRoundRect(20, 170, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde Rechthoek", 60, 285);

        //Gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(240, 50, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(240, 50, breedte, hoogte);
        g.drawString("Gevulde rechthoek met ovaal", 260, 165);

        //Gevulde Ovaal
        g.setColor(opvulkleur);
        g.fillOval(240, 170, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 300, 285);

        //Taartpunt met ovaal eromheen
        g.setColor(opvulkleur);
        g.fillArc(460, 50, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(460, 50, breedte, hoogte);
        g.drawString("Taartpunt met ovaal eromheen", 480, 165);

        //Cirkel
        g.setColor(lijnkleur);
        g.drawArc(510, 170, hoogte, hoogte, 0, 360);
        g.drawString("Cirkel", 545, 285);
    }
}
