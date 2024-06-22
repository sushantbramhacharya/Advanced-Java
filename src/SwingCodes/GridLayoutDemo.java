package SwingCodes;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {

    public static void main(String[] args) {
        JFrame f=new JFrame();
        JLabel l1=new JLabel("Username");
        JLabel l2=new JLabel("Password");
        JTextField tf1=new JTextField(20);
        JTextField tf2=new JTextField(20);
        JPasswordField tpf1=new JPasswordField(20);
        JPasswordField tpf2=new JPasswordField(20);
        JButton b1=new JButton("Submit");
        JButton b2=new JButton("Cancel");

        f.setLayout(new GridLayout(4,2,10,10));
        f.add(l1);
        f.add(l2);
        f.add(tf1);
        f.add(tf2);
        f.add(tpf1);
        f.add(tpf2);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
