package H08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H08_3 extends Applet {
    TextField tekstvak;
    Label label;
    double getal, a, b;
    Button Okknop;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type je Getal Exclusief Btw");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
        a = 21;
        b = 100;
        Okknop = new Button("Ok");
        Okknop.addActionListener( new OkKnopListener() );
        add(Okknop);
    }

    public void paint(Graphics g) {
        g.drawString("Het is inclusief Btw " + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal = getal/b*21+getal;
            repaint();
        }
    }
    class OkKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            getal = getal/b*21+getal;
            repaint();
        }
    }
}
