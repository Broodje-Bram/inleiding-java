package H11;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H11_PraktijkOpdracht1 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst, tekst2, tekst3;
    int keersom;
    Button knop;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst2 = "";
        tekst3 = "";
        add(label);
        add(tekstvak);

        knop = new Button( "Ok" );
        knop.addActionListener(new knopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        g.setFont(new Font ("Default", Font.BOLD, 15 ));
        setBackground(Color.CYAN);
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 80 );
        g.drawString(tekst3, 50, 100 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            keersom = Integer.parseInt( s);
            switch(keersom) {
                case 1:
                    tekst = "1 x 1 = 1 ";
                    tekst2 = "2 x 1 = 2 ";
                    tekst3 = "enz... ";
                    break;
                case 2:
                    tekst = "1 x 2 = 2 ";
                    tekst2 = "2 x 2 = 4 ";
                    tekst3 = "enz... ";
                    break;
                case 3:
                    tekst = "1 x 3 = 3 ";
                    tekst2 = "2 x 3 = 6 ";
                    tekst3 = "enz... ";
                    break;
                case 4:
                    tekst = "1 x 4 = 4 ";
                    tekst2 = "2 x 4 = 8 ";
                    tekst3 = "enz... ";
                    break;
                case 5:
                    tekst = "1 x 5 = 5 ";
                    tekst2 = "2 x 5 = 10 ";
                    tekst3 = "enz... ";
                    break;
                case 6:
                    tekst = "1 x 6 = 6 ";
                    tekst2 = "2 x 6 = 12 ";
                    tekst3 = "enz... ";
                    break;
                case 7:
                    tekst = "1 x 7 = 7 ";
                    tekst2 = "2 x 7 = 14 ";
                    tekst3 = "enz... ";
                    break;
                case 8:
                    tekst = "1 x 8 = 8 ";
                    tekst2 = "2 x 8 = 16 ";
                    tekst3 = "enz... ";
                    break;
                case 9:
                    tekst = "1 x 9 = 9 ";
                    tekst2 = "2 x 9 = 18 ";
                    tekst3 = "enz... ";
                    break;
                case 10:
                    tekst = "1 x 10 = 10 ";
                    tekst2 = "2 x 10 = 20 ";
                    tekst3 = "enz... ";
                    break;
                default:
                    tekst = "Alleen de Tafel 1 tot en met 10 Werkt.";
                    tekst2 = "";
                    tekst3 = "";
                    break;
            }
            repaint();
        }
    }
    class knopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            keersom = Integer.parseInt( s);
            switch(keersom) {
                case 1:
                    tekst = "1 x 1 = 1 ";
                    tekst2 = "2 x 1 = 2 ";
                    tekst3 = "enz... ";
                    break;
                case 2:
                    tekst = "1 x 2 = 2 ";
                    tekst2 = "2 x 2 = 4 ";
                    tekst3 = "enz... ";
                    break;
                case 3:
                    tekst = "1 x 3 = 3 ";
                    tekst2 = "2 x 3 = 6 ";
                    tekst3 = "enz... ";
                    break;
                case 4:
                    tekst = "1 x 4 = 4 ";
                    tekst2 = "2 x 4 = 8 ";
                    tekst3 = "enz... ";
                    break;
                case 5:
                    tekst = "1 x 5 = 5 ";
                    tekst2 = "2 x 5 = 10 ";
                    tekst3 = "enz... ";
                    break;
                case 6:
                    tekst = "1 x 6 = 6 ";
                    tekst2 = "2 x 6 = 12 ";
                    tekst3 = "enz... ";
                    break;
                case 7:
                    tekst = "1 x 7 = 7 ";
                    tekst2 = "2 x 7 = 14 ";
                    tekst3 = "enz... ";
                    break;
                case 8:
                    tekst = "1 x 8 = 8 ";
                    tekst2 = "2 x 8 = 16 ";
                    tekst3 = "enz... ";
                    break;
                case 9:
                    tekst = "1 x 9 = 9 ";
                    tekst2 = "2 x 9 = 18 ";
                    tekst3 = "enz... ";
                    break;
                case 10:
                    tekst = "1 x 10 = 10 ";
                    tekst2 = "2 x 10 = 20 ";
                    tekst3 = "enz... ";
                    break;
                default:
                    tekst = "Alleen de Tafel 1 tot en met 10 Werkt.";
                    tekst2 = "";
                    tekst3 = "";
                    break;
            }
            repaint();
        }
    }
}
