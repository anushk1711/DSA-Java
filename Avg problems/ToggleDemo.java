import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ToggleDemo {
    ToggleDemo() {
        JFrame jf = new JFrame("Toggle Button");

        JLabel lbl = new JLabel("Button is OFF");

        JToggleButton tb =
                new JToggleButton("ON/OFF");

        tb.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(tb.isSelected())
                    lbl.setText("Button is ON");
                else
                    lbl.setText("Button is OFF");
            }
        });

        jf.setLayout(new FlowLayout());
        jf.add(tb);
        jf.add(lbl);

        jf.setSize(250,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new ToggleDemo();
    }
}