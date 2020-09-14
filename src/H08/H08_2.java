package H08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H08_2 extends Applet {
    Button Vrouw;
    Button Man;
    Button Meid;
    Button Jongen;
    int Totaal, TotaalMan, TotaalVrouwen, TotaalJongens, TotaalMeiden, teller;


    public void init() {

        Vrouw = new Button("1+ Vrouw");
        Man = new Button("1+ Man");
        Meid = new Button("1+ Meid");
        Jongen = new Button("1+ Jongen");

        Vrouw.addActionListener( new VrouwListener() );
        Man.addActionListener( new ManListener() );
        Meid.addActionListener( new MeidListener() );
        Jongen.addActionListener( new JongenListener() );

        Totaal = 0;
        TotaalMan = 0;
        TotaalVrouwen = 0;
        TotaalMeiden = 0;
        TotaalJongens = 0;

        add(Man);
        add(Vrouw);
        add(Meid);
        add(Jongen);
    }

    public void paint(Graphics g) {
        g.drawString("Totaal: " + Totaal, 50, 50);
        g.drawString("Totaal Aantal Mannen: " + TotaalMan, 50, 70);
        g.drawString("Totaal Aantal Vrouwen: " + TotaalVrouwen, 50, 90);
        g.drawString("Totaal Aantal Meiden: " + TotaalMeiden, 50, 110);
        g.drawString("Totaal Aantal Jongens: " + TotaalJongens, 50, 130);

    }

    class VrouwListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            TotaalVrouwen++;
            Totaal++;
            repaint();
        }
    }

    class ManListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            TotaalMan++;
            Totaal++;
            repaint();
        }
    }

    class MeidListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            TotaalMeiden++;
            Totaal++;
            repaint();
        }
    }

    class JongenListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            TotaalJongens++;
            Totaal++;
            repaint();
        }
    }

}
