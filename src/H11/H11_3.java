package H11;

import java.awt.*;
import java.applet.Applet;

public class H11_3 extends Applet {

    long [] Fibonacci;
    int i;

    public void init() {
        Fibonacci = new long [ 1000 ];
        Fibonacci[ 0 ] = 0;
        Fibonacci[ 1 ] = 1;

        for (i = 2; i < 1000; i++)
        {
            Fibonacci[ i ] = Fibonacci[ i - 2  ] + Fibonacci[ i - 1  ];
        }
    }

    public void paint(Graphics g) {
        int yPos = 20;

        for( i = 0; i < 1000; i++)
        {
            g.drawString(""+Fibonacci [i], 50, yPos );
            yPos +=20;
        }

    }
}
