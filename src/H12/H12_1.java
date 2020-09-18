package H12;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

import java.awt.*;
import java.applet.Applet;

public class H12_1 extends Applet {
    double[] gemiddelde;
    double uitkomst;
    double a,b,c,d,e,f,g,h,i,j;
    int teller;

    public void init() {
        a = 9;
        b = 1;
        c = 5.4;
        d = 84;
        e = 11.7;
        f = 6.2;
        g = 2.2;
        h = 9.9;
        i = -5;
        j = 3;

        gemiddelde = new double[11];
        uitkomst = (a + b + c + d + e + f + g + h + i + j) / 10;

        gemiddelde[0] = a;
        gemiddelde[1] = b;
        gemiddelde[2] = c;
        gemiddelde[3] = d;
        gemiddelde[4] = e;
        gemiddelde[5] = f;
        gemiddelde[6] = g;
        gemiddelde[7] = h;
        gemiddelde[8] = i;
        gemiddelde[9] = j;
        gemiddelde[10] = uitkomst;

        for (teller = 0; teller < gemiddelde.length; teller++) {
        }
    }

    public void paint(Graphics g) {
        g.setFont(new Font ("Default", Font.HANGING_BASELINE, 13 ));
        setBackground(Color.green);
        for (int teller = 0; teller < gemiddelde.length; teller++) {
            g.drawString("" + gemiddelde[teller],150,20 * teller + 20);
        }
        g.setColor(Color.MAGENTA);
        g.drawString("Het gemiddelde is:  ",20,220);
        Graphics2D twoD = (Graphics2D) g;
        twoD.setColor(Color.black);
        twoD.setStroke(new BasicStroke(3));
        twoD.drawLine(150,205,200,205);
    }
}
