package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.net.*;
import java.util.Random;

public class H14_02 extends Applet {
    String kleur[] = {"Harten", "Schoppen", "Klaver", "Ruiten"};
    String betekenis[] = {"Aas", "Twee", "Drie", "Vier", "Vijf", "Zes", "Zeven", "Acht", "Negen", "Tien", "Boer", "Vrouw", "Heer"};
    String spel[];
    Button verdelen;

    boolean[] help;
    int start = 0;

    URL path;
    AudioClip scream;

    public void init() {
        setSize(500, 300);
        path = H14_02.class.getResource("/H14/resources/");
        scream = getAudioClip(path, "scream.wav");

        verdelen = new Button("Deel!");
        verdelen.addActionListener(new VerdeelListener());
        add(verdelen);

        spel= new String[52];
        help = new boolean[52];

        for (int i = 0; i < help.length; i++) {
            help[i] = false;
        }

        for (int i = 0; i < 13; i++) {
            spel[start] = kleur[0] + "" + betekenis[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            spel[start] = kleur[1] + "" + betekenis[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            spel[start] = kleur[2] + "" + betekenis[i];
            start++;
        }

        for (int i = 0; i < 13; i++) {
            spel[start] = kleur[3] + "" + betekenis[i];
            start++;
        }
    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setFont(new Font ("Default", Font.BOLD, 13 ));
        g.drawString("Speler 1 (Gert)",50,50);
        g.drawString("Speler 2 (Gerrit)",150,50);
        g.drawString("Speler 3 (Henkie)",260,50);
        g.drawString("Speler 4 (Jackie)",380,50);

        int b = 0;
        for (int i = 0; i < 4; i++) {
            for (int a = 0; a < 13; a++) {
                g.drawString(spel[b], 50 + 110 * i,70 + 12 * a);
                b++;
            }
        }
    }

    public static void Random(String[] randomize) {
        Random randomize1;

        for (int i = 0; i < randomize.length; i++) {
            randomize1 = new Random();
            int randPos = randomize1.nextInt(randomize.length);
            String tmp = randomize[i];
            randomize[i] = randomize[randPos];
            randomize[randPos] = tmp;
        }
    }

    private class VerdeelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Random(spel);
            repaint();
            scream.play();
        }
    }
}
