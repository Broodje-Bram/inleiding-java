package H12;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;


public class H12_4 extends Applet {
    int getallen[] = {5,55,25,250,235,225,155,105,185,125,135,};
    Label label = new Label("Voer hier uw Getal in (tussen de 0-250)");
    TextField tekstvlak = new TextField("",20);
    Button enter = new Button("Enter");

    int nummer;
    int index;
    boolean controle = false;

    public void init() {
        enter.addActionListener(new enterListener());
        add(tekstvlak);
        add(label);
        add(enter);
    }

    public void paint(Graphics g) {
        if (controle == true) {
            g.drawString("De getal staat op: " + index + " plaats",50,75);
        } else {
            g.drawString("We hadden u getal niet kunnen vinden",50,75);
        }
    }

    class enterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            controle = false;
            nummer = Integer.parseInt(tekstvlak.getText());

            for(int i = 0; i < getallen.length; i++) {
                if (nummer == getallen[i]) {
                    index = i;
                    controle = true;
                }
            }
            repaint();
        }
    }
}
