package SwingCodes;

import java.awt.*;
import javax.swing.*;

class Main extends JFrame
{
    static JButton b1,b2,b3;
    static JLabel label;

    private void app()
    {

        setTitle("This is JFrame");
        label=new JLabel("This is Label");

        b1=new JButton("Button 1");
        b2=new JButton("Button 2");
        b3=new JButton("Button 3");

        JTextField tf=new JTextField(20);

        String names[]={"Sushant","Deep","Sirjan"};
        JComboBox<String> jcb=new JComboBox<String>(names);
        jcb.setSelectedIndex(1);

        JList<String> ls=new JList<String>(names);
        ls.setSelectedIndex(2);

        JPanel panel=new JPanel();
        panel.add(label);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(tf);
        panel.add(jcb);
        panel.add(ls);
        add(panel);

        setSize(500,500);
        panel.setBackground(Color.pink);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String agrs[])
    {
        Main app= new Main();
        app.app();
    }
}