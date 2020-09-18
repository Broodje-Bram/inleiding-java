package H12;

import java.awt.*;
import java.applet.Applet;

public class H12_2 extends Applet {
    Button knop1, knop2,knop3,knop4,knop5,knop6,knop7,knop8,knop9,knop10,knop11,knop12,knop13,knop14,knop15,knop16,knop17,knop18,knop19,knop20,knop21;
    Button knop22,knop23,knop24,knop25;

    public void init(){
        knop1 = new Button( "Knop1" );
        knop2 = new Button( "Knop2");
        knop3 = new Button( "Knop3");
        knop4 = new Button( "Knop4");
        knop5 = new Button( "Knop5");
        knop6 = new Button( "Knop6");
        knop7 = new Button( "Knop7");
        knop8 = new Button( "Knop8");
        knop9 = new Button( "Knop9");
        knop10 = new Button( "Knop10");
        knop11 = new Button( "Knop11");
        knop12 = new Button( "Knop12");
        knop13 = new Button( "Knop13");
        knop14 = new Button( "Knop14");
        knop15 = new Button( "Knop15");
        knop16 = new Button( "Knop16");
        knop17 = new Button( "Knop17");
        knop18 = new Button( "Knop18");
        knop19 = new Button( "Knop19");
        knop20 = new Button( "Knop20");
        knop21 = new Button( "Knop21");
        knop22 = new Button( "Knop22");
        knop23 = new Button( "Knop23");
        knop24 = new Button( "Knop24");
        knop25 = new Button( "Knop25");

        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        add(knop5);
        add(knop6);
        add(knop7);
        add(knop8);
        add(knop9);
        add(knop10);
        add(knop11);
        add(knop12);
        add(knop13);
        add(knop14);
        add(knop15);
        add(knop16);
        add(knop17);
        add(knop18);
        add(knop19);
        add(knop20);
        add(knop21);
        add(knop22);
        add(knop23);
        add(knop24);
        add(knop25);
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
}
