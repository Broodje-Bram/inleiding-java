package H14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H14_01 extends Applet {
    double rand1;
    double rand2;

    String kleur[] = {"Harten", "Schoppen", "Klaver", "Ruiten"};
    String betekenis[] = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"};
    String gekozen = "";
    Button knop;

    public void init() {
        knop = new Button("Druk op de knop om een kaart te kiezen");
        knop.addActionListener(new knopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        g.setFont(new Font ("Default", Font.BOLD, 15 ));
        setBackground(Color.CYAN);
        g.drawString(gekozen,50,50);
    }


    private class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rand1 = Math.random() * 13;
            int r1 = (int) rand1;
            rand2 = Math.random() * 4;
            int r2 = (int) rand2;

            gekozen = kleur[r2] + "" + betekenis[r1];

            repaint();
        }
    }
}
