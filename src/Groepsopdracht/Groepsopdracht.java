package Groepsopdracht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Groepsopdracht extends Applet {
    TextField tekstvak;
    Button knop;
    Label label;
    String s;
    int b,q;

    public void init() {
        tekstvak = new TextField("", 5);
        knop  = new Button("Submit");
        label = new Label("Voer hier u Cijfer in");

        knop.addActionListener(new knopListener());
        s = "";
        q = 0;

        knop.setBackground(Color.RED);

        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        for (int i = 1; i <= b; i++) {
            if (i%2<=0){
                g.drawString("" + i, 50,50+i*10);
            }
            if (i==b){
                g.drawString("Totaal " ,50,50+i*15);
            }
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            b = Integer.parseInt( s );
            repaint();
        }
    }
}
