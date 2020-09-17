package H08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class H08_PraktijkOpdracht extends Applet {
    TextField tekstvak;
    TextField Cijfers;
    double getal, Keer, Gedeeld, Plus, Min;
    Button Keerknop, GedeeldKnop, PlusKnop, MinKnop;


    public void init() {
        tekstvak = new TextField("", 10);
        Cijfers = new TextField("", 10);

        add(tekstvak);
        add(Cijfers);

        Keerknop = new Button("*");
        MinKnop = new Button("-");
        GedeeldKnop = new Button("/");
        PlusKnop = new Button("+");

        PlusKnop.addActionListener( new PlusKnopListener());
        GedeeldKnop.addActionListener( new GedeeldKnopListener());
        MinKnop.addActionListener( new MinKnopListener() );
        Keerknop.addActionListener( new KeerKnopListener() );

        add(Keerknop);
        add(GedeeldKnop);
        add(PlusKnop);
        add(MinKnop);
    }

    public void paint(Graphics g) {
        setBackground(Color.magenta);
    }

    class KeerKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String b = Cijfers.getText();
            getal = Double.parseDouble( s );
            Keer = Double.parseDouble( b );
            getal = getal*Keer;
            tekstvak.setText("" + getal);
            Cijfers.setText("");
            repaint();
        }
    }
    class MinKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String b = Cijfers.getText();
            getal = Double.parseDouble( s );
            Min = Double.parseDouble( b );
            getal = getal-Min;
            tekstvak.setText("" + getal);
            Cijfers.setText("");
            repaint();
        }
    }
    class GedeeldKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String b = Cijfers.getText();
            getal = Double.parseDouble( s );
            Gedeeld = Double.parseDouble( b );
            getal = getal/Gedeeld;
            tekstvak.setText("" + getal);
            Cijfers.setText("");
            repaint();
        }
    }
    class PlusKnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            String b = Cijfers.getText();
            getal = Double.parseDouble( s );
            Plus = Double.parseDouble( b );
            getal = getal+Plus;
            tekstvak.setText("" + getal);
            Cijfers.setText("");
            repaint();
        }
    }
}
