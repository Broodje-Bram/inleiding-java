package H10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H10_PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    String beoordeling;

    public void init(){
        tekstvak = new TextField("", 20);
        label = new Label("Type je Cijfer");

        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);

        beoordeling = "";
    }



    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            if (getal>10){
                beoordeling = "  Error";
            } else if (getal<1){
              beoordeling = "  Error";
            } else if (getal<4){
                beoordeling = "  Slecht";
            } else if (getal<=4){
                beoordeling = "  Onvoldoende";
            } else if (getal<=5){
                beoordeling = "  Matig";
            } else if (getal<8){
              beoordeling = "  Voldoende";
            } else if (getal>7) {
                beoordeling = "  Goed";
            }
            repaint();
        }
    }

    public void paint(Graphics g){
        if (getal<=-0){
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
        }

        else if (getal<4) {
            // Oval for face outline
            g.setColor(Color.lightGray);
            g.fillOval(180, 170, 150, 150);

            // Ovals for eyes
            // with black color filled
            g.setColor(Color.BLACK);
            g.fillOval(220, 220, 15, 15);
            g.fillOval(270, 220, 15, 15);

            // Arc for the smile
            g.drawArc(230, 280, 50, 20, -180, -180);
        }
        else if (getal<=4){
            // Oval for face outline
            g.setColor(Color.lightGray);
            g.fillOval(180, 170, 150, 150);

            // Ovals for eyes
            // with black color filled
            g.setColor(Color.BLACK);
            g.fillOval(220, 220, 15, 15);
            g.fillOval(270, 220, 15, 15);

            // Arc for the smile
            g.drawArc(230, 280, 50, 20, -180, -180);
        }
        else if (getal<=5){
            // Oval for face outline
            g.setColor(Color.RED);
            g.fillOval(180, 170, 150, 150);

            // Ovals for eyes
            // with black color filled
            g.setColor(Color.BLACK);
            g.fillOval(220, 220, 15, 15);
            g.fillOval(270, 220, 15, 15);

            // Arc for the smile
            g.drawLine(230,280,280,280);
        }
        else if (getal<8){
            // Oval for face outline
            g.setColor(Color.blue);
            g.fillOval(180, 170, 150, 150);

            // Ovals for eyes
            // with black color filled
            g.setColor(Color.BLACK);
            g.fillOval(220, 220, 15, 15);
            g.fillOval(270, 220, 15, 15);

            // Arc for the smile
            g.drawLine(230,300,280,280);
        }
        else if(getal>7){
            drawSmiley(Color.green, g);
            // Oval for face outline
            //g.setColor(Color.green);
            //g.fillOval(180, 170, 150, 150);

            // Ovals for eyes
            // with black color filled
            //g.setColor(Color.BLACK);
            //g.fillOval(220, 220, 15, 15);
            //g.fillOval(270, 220, 15, 15);

            // Arc for the smile
            //g.drawArc(230, 280, 50, 20, 180, 180);
        }

        g.setFont(new Font ("Default", Font.BOLD, 15 ));
        setBackground(Color.CYAN);
        g.setColor(Color.red);
        g.drawString("" + getal + beoordeling, 20, 80);
    }
    private void drawSmiley (Color color, Graphics g){
        g.setColor(color);
        g.fillOval(180, 170, 150, 150);

        // Ovals for eyes
        // with black color filled
        g.setColor(Color.BLACK);
        g.fillOval(220, 220, 15, 15);
        g.fillOval(270, 220, 15, 15);

        // Arc for the smile
        g.drawArc(230, 280, 50, 20, 180, 180);
    }


}
