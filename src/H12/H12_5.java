package H12;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H12_5 extends Applet {
    int getallen[] = {5,55,25,250,235,225,155,105,185,125,135,};
    Label label = new Label("Voer hier uw Getal in (tussen de 0-250)");
    TextField tekstvlak = new TextField("",20);
    Button enter = new Button("Enter");
    int nummer;
    boolean controle = false;

    public void init() {
        enter.addActionListener(new enterListener());
        add(tekstvlak);
        add(label);
        add(enter);
    }

    public void paint(Graphics g) {
        g.setFont(new Font ("Default", Font.BOLD, 15 ));
        setBackground(Color.CYAN);
        if (controle == true) {
            g.drawString("De getal staat erin",50,75);
        } else {
            g.drawString("Het getal staat er niet in",50,75);
        }
    }

    class enterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            controle = false;
            nummer = Integer.parseInt(tekstvlak.getText());
            for(int i = 0; i < getallen.length; i++) {
                if (nummer == getallen[i]) {
                    controle = true;
                    break;
                }
            }
            repaint();
        }
    }
}
