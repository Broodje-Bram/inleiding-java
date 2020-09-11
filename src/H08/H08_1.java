package H08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H08_1 extends Applet {
    TextField tekstvak;
    Button knop;
    Button Reset;
    String s;
    String R;

    public void init() {
        tekstvak = new TextField("", 25);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        add(tekstvak);
        add(knop);
        s = "";
        Reset = new Button("Reset");
        Reset.addActionListener( new ResetListener() );
        add(Reset);
        R = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}
