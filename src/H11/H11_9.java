package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_9 extends Applet {
    static int N = 7;

    public void paint(Graphics g)
    {
        int x, y;
        for (int row = 0; row < N; row++) {

            for (int col = 0; col < N; col++) {
                x = row * 20;
                y = col * 20;

                if ((row % 2 == 0) == (col % 2 == 0))
                    g.setColor(Color.BLACK);
                else
                    g.setColor(Color.WHITE);


                g.fillRect(x, y, 20, 20);
            }
        }
    }
}
