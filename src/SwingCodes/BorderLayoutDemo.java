package SwingCodes;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    JFrame f;
    JButton b1,b2,b3,b4,b5;

    BorderLayoutDemo()
    {
        f=new JFrame();
        f.setSize(500,500);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(new BorderLayout(10,10));

        b1=new JButton("Button1");
        b2=new JButton("Button2");
        b3=new JButton("Button3");
        b4=new JButton("Button4");
        b5=new JButton("Button5");

        f.add(b1,BorderLayout.NORTH);
        f.add(b2,BorderLayout.SOUTH);
        f.add(b3,BorderLayout.WEST);
        f.add(b4,BorderLayout.EAST);
        f.add(b5,BorderLayout.CENTER);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
