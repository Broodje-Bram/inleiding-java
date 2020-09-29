package H14;

import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H14_Praktijkopdracht extends Applet {

    Image burger;
    URL path;
    Button play;
    Button reset;
    TextField tekstveld;

    int Burgers = 23;
    boolean turn = true;
    boolean gameover = false;
    boolean lost = false;

    String tekst1 = "";
    String tekst2 = "Voer 1,2 of 3 in en druk op play!";

    public void init() {

        setSize(350,500);

        tekst1 = tekst2;
        path = H14_Praktijkopdracht.class.getResource("/H14/resources/");
        burger = getImage(path, "Hamburger.jpg");

        play = new Button("Play");
        reset = new Button("Reset");
        tekstveld = new TextField("",10);
        play.addActionListener(new playListener());
        reset.addActionListener(new resetListener());
        add(tekstveld);
        add(play);
        add(reset);

    }

    public void paint(Graphics g) {
        setBackground(Color.CYAN);
        g.setFont(new Font ("Default", Font.BOLD, 13 ));
        g.drawString(tekst1,70,50);
        for (int i = 0; i < Burgers; i++) {
            g.drawImage(burger, 100 + 50 * (i % 4), 100 + 50 * (i / 4), 50, 50, this);
        }
    }

    int botPlays(int userplay, int Burgers) {
        int botplays = 0;
        double random = Math.random() * 3 + 1;
        int r = (int)random;

        if(Burgers == 23) {
            switch(userplay) {
                case 1:
                    botplays = 1;
                    break;
                case 2:
                    botplays = r;
                    break;
                case 3:
                    botplays = 3;
                    break;
            }


        }else if(Burgers == 21 || Burgers == 17 || Burgers == 13 || Burgers == 9|| Burgers == 5) {
            switch(userplay) {
                case 1:
                    botplays = 3;
                    break;
                case 2:
                    botplays = 2;
                    break;
                case 3:
                    botplays = 1;
                    break;
            }
        }else if(Burgers == 20 || Burgers == 16 || Burgers == 12 || Burgers == 8|| Burgers == 4){
            switch(userplay) {
                case 1:
                    botplays = 2;
                    break;
                case 2:
                    botplays = 1;
                    break;
                case 3:
                    botplays = r;
                    break;
            }
        }else if(Burgers == 19 || Burgers == 15 || Burgers == 11 || Burgers == 7|| Burgers == 3){
            switch(userplay) {
                case 1:
                    botplays = 1;
                    break;
                case 2:
                    botplays = r;
                    break;
                case 3:
                    botplays = 3;
                    break;
            }
        }else if(Burgers == 18 || Burgers == 14 || Burgers == 10 || Burgers == 6|| Burgers == 2){
            switch(userplay) {
                case 1:
                    botplays = r;
                    break;
                case 2:
                    botplays = 3;
                    break;
                case 3:
                    botplays = 2;
                    break;
            }
        }else {
            botplays =r;
        }

        return botplays;
    }

    class playListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int userplay = 0;
            int bot = 0;
            if(Integer.parseInt(tekstveld.getText()) == 1 || Integer.parseInt(tekstveld.getText()) == 2 || Integer.parseInt(tekstveld.getText()) ==3) {
                userplay = Integer.parseInt(tekstveld.getText());
                bot = botPlays(userplay, Burgers);

                turn = true;
                Burgers -=userplay;
                if(Burgers <= 0 && gameover == false) {
                    if(true == true) {
                        lost = true;
                        gameover = true;
                    }
                }

                turn = false;
                Burgers -=bot;
                if(Burgers <= 0 && gameover == false) {
                    lost = false;
                    gameover = true;
                }

                tekst1 = "Bot koos " + bot + " Burgers te verwijderen.";

            }else {
                tekst1 = "Error: Voer een getal tussen 1-3 in!";
                repaint();
            }

            if(gameover==true) {
                if(lost == true) {
                    tekst1 = "Winner!";
                }else {
                    tekst1 = "Loser!";
                }
            }
            tekstveld.setText("");
            repaint();
        }
    }
    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstveld.setText("");
            tekst1 = tekst2;
            Burgers = 23;
            lost = false;
            gameover = false;
            turn = true;
            repaint();
        }
    }
}
