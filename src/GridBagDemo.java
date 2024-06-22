import javax.swing.*;
import java.awt.*;

public class GridBagDemo {
    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    GridBagDemo(){
        f = new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        f.setLayout(gbl);

        b1 = new JButton("Button 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbl.setConstraints(b1, gbc);
        f.add(b1);

        b2 = new JButton("Button 2");
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbl.setConstraints(b2, gbc);
        f.add(b2);

        b3 = new JButton("Button 3");
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbl.setConstraints(b3, gbc);
        f.add(b3);

        b4 = new JButton("Button 4");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbl.setConstraints(b4, gbc);
        f.add(b4);

        b5 = new JButton("Button 5");
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbl.setConstraints(b5, gbc);
        f.add(b5);

        b6 = new JButton("Button 6");
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbl.setConstraints(b6, gbc);
        f.add(b6);

        b7 = new JButton("Button 7");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbl.setConstraints(b7, gbc);
        f.add(b7);

        b8 = new JButton("Button 8");
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbl.setConstraints(b8, gbc);
        f.add(b8);

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagDemo();
    }
}
