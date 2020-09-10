package H06;

import java.awt.*;
import java.applet.Applet;

public class H06PraktijkOpdracht extends Applet {
    double a, b, c, uitkomst;
    int gemiddeldeuitkomst;
    double HeleUitkomst;

    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a+b+c)/3;
        gemiddeldeuitkomst = (int) (uitkomst * 10.0);
        HeleUitkomst = gemiddeldeuitkomst / 10.0;
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is : " + HeleUitkomst, 30, 30);
    }
}
