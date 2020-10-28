package Groepsopdracht;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Groepsopdracht extends Applet {
    TextField tekstvak;
    Button knop;
    Label label;
    String inputTekstvak;
    int cijferTransformatie,som;

    public void init() {
        tekstvak = new TextField("", 5);
        knop  = new Button("Submit");
        label = new Label("Voer hier u Cijfer in");

        knop.addActionListener(new knopListener());
        inputTekstvak = "";

        knop.setBackground(Color.RED);

        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        som = 0;

        for (int i = 1; i <= cijferTransformatie; i++) {
            if (i%2==0){
                if (i%6==0){
                    som+=i*i;
                    g.drawString(""+i*i,50,50+i*10);
                }
                else {
                    som+=i;
                    g.drawString("" + i, 50,50+i*10);
                }
            }
            if (i== cijferTransformatie){
                g.drawString("Totaal "+ som ,50,50+i*15);
            }
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputTekstvak = tekstvak.getText();
            try {
                cijferTransformatie = Integer.parseInt( inputTekstvak );
            }
            catch (Exception Gert){
                cijferTransformatie = 0;
            }
            repaint();
        }
    }
}
