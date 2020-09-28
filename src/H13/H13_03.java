package H13;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H13_03 extends Applet {
    Button stenen;
    Button beton;
    Button remove;
    int muur = 0;

    public void init() {
        setSize(1200, 700);
        stenen = new Button("Stenen muur");
        beton = new Button("Betonnen muur");
        remove = new Button("Remove");

        stenen.addActionListener(new stenen());
        beton.addActionListener(new beton());
        remove.addActionListener(new remove());

        add(remove);
        add(stenen);
        add(beton);
    }
    public void paint(Graphics g) {

        switch (muur) {
            case 0:
                break;
            case 1:
                drawWall(g, 20, 20, 1160, 660);
                break;
            case 2:
                betonMuur(g, 20, 20, 1160, 660);
                break;
            default:
                break;

        }

    }
    void drawWall(Graphics g, int x, int y, int ww, int hw) {
        g.setColor(new Color(100, 100, 100));
        g.fillRect(x, y, ww, hw);
        g.setColor(new Color(150, 50, 50));

        for (int a = 0; a <= ((hw - 3) / 18) - 1; a++) {
            if (a % 2 == 0) {
                for (int i = 0; i <= ((ww - 3) / 33) - 1; i++) {
                    g.fillRect((x + 3) + 33 * i, (y + 3) + 18 * a, 30, 15);
                }
            } else {
                for (int b = 0; b <= ((ww - 3) / 33) - 2; b++) {
                    g.fillRect((x + 21) + 33 * b, (y + 3) + 18 * a, 30, 15);
                    g.fillRect((x + 3), (y + 3) + 18 * a, 15, 15);
                    g.fillRect(x + (((ww - 3) / 33) * 33 - 12), (y + 3) + 18 * a, 15, 15);
                }
            }
        }
    }
    void betonMuur(Graphics g, int x, int y, int ww, int wh) {
        g.setColor(new Color(50, 50, 50));
        g.fillRect(x, y, ww, wh);
        g.setColor(new Color(130, 125, 120));

        for (int i = 0; i <= ((wh - 5) / 50) - 1; i++) {
            if (i % 2 == 0) {
                for (int a = 0; a <= ((ww - 5) / 95) - 1; a++) {
                    g.fillRect((x + 5) + 95 * a, (y + 5) + 50 * i, 90, 45);
                }
            } else {
                for (int b = 0; b <= ((ww - 5) / 95) - 2; b++) {
                    g.fillRect((x + 55) + 95 * b, (y + 5) + 50 * i, 90, 45);
                    g.fillRect((x + 5), (y + 5) + 50 * i, 45, 45);
                    g.fillRect(x + (((ww - 5) / 95) * 95 - 40), (y + 5) + 50 * i, 45, 45);
                }
            }
        }
    }
    class stenen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muur = 1;
            repaint();
        }
    }
    class beton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muur = 2;
            repaint();
        }
    }
    class remove implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            muur = 0;
            repaint();
        }
    }
}
