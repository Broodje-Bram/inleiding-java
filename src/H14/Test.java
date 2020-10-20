package H14;

import java.applet.Applet;
import java.awt.*;

public class Test extends Applet {


    public void init() {
    }


    public void paint(Graphics g) {
        for (int i = 1; i < 11; i++) {
          g.drawString("Bram Goudsmid " + i, 50, 50*i+50);
          if (i == 5){
              g.drawString("we zijn op de helft", 50, 50*i+30 );
          }
        }
    }
}
