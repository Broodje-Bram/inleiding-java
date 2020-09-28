package H10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H10_5 extends Applet {
    Button knop;
    TextField tekstvak;
    String tekst, geslaagd;
    double gemiddelde, aantal;

    public void init(){

        knop = new Button( "Ok" );
        tekstvak = new TextField(50);
        knop.addActionListener(new knoplistener());
        add(knop);
        add(tekstvak);

        tekst = "";
        geslaagd = "";

    }

    public void paint(Graphics g){

        g.setFont(new Font ("Default", Font.BOLD, 15 ));
        setBackground(Color.CYAN);
        g.setColor(Color.red);
        g.drawString("Het ingevoerde getal: " + tekst,30, 80);
        g.drawString("Het gemiddelde: " + (gemiddelde / aantal),30, 100);
        g.drawString("Geslaagd: " + geslaagd,30, 120);

    }

    class knoplistener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int invoer = Integer.parseInt( s );
            if (invoer <= 5) {
                tekst = "Onvoldoende";
                gemiddelde += invoer;
                aantal++;
            }
            else if (invoer > 5) {
                tekst = "Voldoende";
                gemiddelde += invoer;
                aantal++;
            }
            else if (invoer > 10){
                tekst = "Error!";
            }
            else {
                tekst = "Error!";
            }

            if (gemiddelde/aantal<= 5){
                geslaagd = "Neen";
            }
            else {
                    geslaagd = "JA";
            }
            repaint();
        }
    }
}
