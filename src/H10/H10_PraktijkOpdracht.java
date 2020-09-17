package H10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H10_PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    String b;

    public void init(){
        tekstvak = new TextField("", 20);
        label = new Label("Type je Cijfer");

        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g){
        g.drawString("" + getal + b, 20, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            if (getal>10){
                b = "  Error";
            } else if (getal<1){
              b = "  Error";
            } else if (getal<4){
                b = "  Slecht";
            } else if (getal<=4){
                b = "  Onvoldoende";
            } else if (getal<=5){
                b = "  Matig";
            } else if (getal<8){
              b = "  Voldoende";
            } else if (getal>7) {
                b = "  Goed";
            }
            repaint();
        }
    }
}
