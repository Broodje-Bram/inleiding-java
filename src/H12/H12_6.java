package H12;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12_6 extends Applet {

    int getallen[] = {5, 5, 5, 5, 5, 5, 5, 2, 4, 6, 0, 7, 1, 2, 6, 7, 7, 7, 1, 10, 3, 0, 0, 5, 5, 0, 3, 5, 2, 5, 2};
    Label label = new Label("Voer hier uw Getal in (tussen de 0-10)");
    TextField tekstvlak = new TextField("",20);
    Button enter = new Button("Enter");
    int cijfer = 0;
    int vaak = 0;

    public void init() {
        enter.addActionListener(new enterListener());
        add(label);
        add(tekstvlak);
        add(enter);
    }

    public void paint(Graphics g) {
        g.setFont(new Font ("Default", Font.BOLD, 15 ));
        setBackground(Color.CYAN);
        g.drawString("Het getal komt "+ vaak +" keer voor ",50,75);
    }

    class enterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vaak = 0;
            cijfer = Integer.parseInt(tekstvlak.getText());
            for (int i = 0; i < getallen.length; i++) {
                if (cijfer == getallen[i]) {
                    vaak++;
                }
            }
            repaint();
        }
    }

}