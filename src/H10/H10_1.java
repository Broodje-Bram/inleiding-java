package H10;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H10_1 extends Applet {
    int cijfers, uitkomst;
    TextField tekstvak;

    public void init() {
        tekstvak = new TextField(50);
        tekstvak.addActionListener( new VakListener() );
        add( tekstvak );
        uitkomst = 0;
    }

    public void paint(Graphics g) {
        g.setFont(new Font ("Default", Font.BOLD, 15 ));
        setBackground(Color.CYAN);
        g.setColor(Color.red);
        g.drawString(String.valueOf(uitkomst), 200, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfers = Integer.parseInt( s );
            if (cijfers > uitkomst) {
                uitkomst = cijfers;
            }
            repaint();
        }
    }
}
