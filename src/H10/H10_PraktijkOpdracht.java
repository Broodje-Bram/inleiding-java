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
        // Oval for face outline
        g.setColor(Color.YELLOW);
        g.fillOval(180, 170, 150, 150);

        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(220, 220, 15, 15);
        g.fillOval(270, 220, 15, 15);

        // Arc for the smile
        g.drawArc(230, 280, 50, 20, 180, 180);


        g.setFont(new Font ("Default", Font.BOLD, 15 ));
        setBackground(Color.CYAN);
        g.setColor(Color.red);
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
