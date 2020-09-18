package H12;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
import java.util.*;

public class H12_3 extends Applet {
    TextField tekstvak[] = new TextField[5];
    Button knop;
    int getallen[] = new int[5];
    Label label;

    public void init() {
        knop = new Button("Ok");
        knop.addActionListener(new knopListener());

        label = new Label("Type hier de getallen");
        add(label);

        for(int i=0; i!=5; i++){
            tekstvak[i] = new TextField("",10);
            add(tekstvak[i]);
        }
        add(knop);
    }

    public void paint(Graphics g) {
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

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            for(int i=0; i!=5; i++){
                getallen[i] = Integer.parseInt(tekstvak[i].getText());
            }
            Arrays.sort(getallen);
            for(int i=0; i!=5; i++){
                tekstvak[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}

