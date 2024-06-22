import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    static JFrame f;
    static JButton b1,b2,b3,b4,b5,b6;
    public static void main(String args[])
    {
        f=new JFrame();
        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");
        b4=new JButton("Button 4");
        b5=new JButton("Button 5");
        b6=new JButton("Button 6");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);


        f.setLayout(new FlowLayout(2));
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
