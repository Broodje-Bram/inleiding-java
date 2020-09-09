package H06;

import java.applet.Applet;
import java.awt.*;

public class H06_2 extends Applet {
    int a, b, c, d, uur, dag, Jaar;


    public void init() {
        a = 3600;
        c = 1;
        uur = a*c;
        b = 31556952;
        Jaar = b*c;
        d = 86400;
        dag = d*c;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een Uur:  " + uur, 20, 20);
        g.drawString("Seconden in een Dag:  " + dag, 20, 40);
        g.drawString("Seconden in een Jaar:  " + Jaar, 20, 60);
    }
}
