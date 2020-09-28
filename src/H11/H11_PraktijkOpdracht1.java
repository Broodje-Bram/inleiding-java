package H11;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H11_PraktijkOpdracht1 extends Applet {
    int A;
    long tafel;
    Button knop;
    TextField tekstvlak;

    public void init() {
        A = 0;
        tafel = 0;
        knop = new Button("Submit");
        tekstvlak = new TextField("",10);

        knop.addActionListener(new knopListener());
        add(tekstvlak);
        add(knop);
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setFont(new Font ("Default", Font.BOLD, 13 ));
        for (int i = 1; i <= 10; i++) {
            tafel = A * i;
            g.drawString("" + tafel,100, i * 20 + 30);

            g.drawString("1 x " + A + "=",50,50);
            g.drawString("2 x " + A + "=",50,70);
            g.drawString("3 x " + A + "=",50,90);
            g.drawString("4 x " + A + "=",50,110);
            g.drawString("5 x " + A + "=",50,130);
            g.drawString("6 x " + A + "=",50,150);
            g.drawString("7 x " + A + "=",50,170);
            g.drawString("8 x " + A + "=",50,190);
            g.drawString("9 x " + A + "=",50,210);
            g.drawString("10 x " + A + "=",45,230);
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            A = Integer.parseInt(tekstvlak.getText());
            repaint();
        }
    }
}
