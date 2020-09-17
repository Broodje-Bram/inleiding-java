package H10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H10_4 extends Applet {
    TextField tekstvakjaar, tekstvakmaand;
    Label label, labelmaand;
    String s, tekstjaar, tekstmaand,b;
    int jaartal, maand;

    public void init() {
        tekstvakjaar = new TextField("", 20);
        tekstvakmaand = new TextField("", 20);

        label = new Label("Type hier een Jaartal");
        labelmaand = new Label("Type hier een Maand");

        tekstvakjaar.addActionListener( new TekstvakjaarListener() );
        tekstvakmaand.addActionListener( new TekstvakmaandListener() );

        tekstjaar = "";
        tekstmaand = "";

        add(label);
        add(labelmaand);
        add(tekstvakjaar);
        add(tekstvakmaand);
    }

    public void paint(Graphics g) {
        g.drawString(tekstjaar, 50, 70);
        g.drawString(tekstmaand, 50,100);
    }

    class TekstvakjaarListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvakjaar.getText();
            jaartal = Integer.parseInt( s);
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                tekstjaar = ""+ jaartal + " is een schrikkeljaar";
            }
            else {
                tekstjaar = ""+ jaartal + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
    class TekstvakmaandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b = tekstvakmaand.getText();
            maand = Integer.parseInt( b);
            switch(maand) {
                case 1:
                    tekstmaand = ""+ jaartal + " Januari: 31 Dagen";
                    break;
                case 2:
                    if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0 ){
                        tekstmaand = ""+ jaartal + " Februari: 29 Dagen";
                    }
                    else {
                        tekstmaand = ""+ jaartal + "Februari: 28 Dagen";
                    }
                    break;
                case 3:
                    tekstmaand = ""+ jaartal + " Maart: 31 Dagen";
                    break;
                case 4:
                    tekstmaand = ""+ jaartal + " April: 30 Dagen";
                    break;
                case 5:
                    tekstmaand = ""+ jaartal + " Mei: 31 Dagen";
                    break;
                case 6:
                    tekstmaand = ""+ jaartal + " Juni: 30 Dagen";
                    break;
                case 7:
                    tekstmaand = ""+ jaartal + " Juli: 31 Dagen";
                    break;
                case 8:
                    tekstmaand = ""+ jaartal + " Augustus: 31 Dagen";
                    break;
                case 9:
                    tekstmaand = ""+ jaartal + " September: 30 Dagen";
                    break;
                case 10:
                    tekstmaand = ""+ jaartal + " Oktober: 31 Dagen";
                    break;
                case 11:
                    tekstmaand = ""+ jaartal + " November: 30 Dagen";
                    break;
                case 12:
                    tekstmaand = ""+ jaartal + " December: 31 Dagen";
                    break;
                default:
                    tekstmaand = "Alleen de nummers van 1 tot en met 12 werken, want zoveel maanden zitten er in een jaar....";
                    break;
            }
            repaint();
        }
    }
}
