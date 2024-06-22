import javax.swing.*;
public class dr {
//    menu bars
    public static  void main(String args[])
    {
        JFrame f=new JFrame();
        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("Main Menu");
        JMenu m2=new JMenu("Sub Menu");
        JMenuItem i1=new JMenuItem("Menu Item 1");
        JMenuItem i2=new JMenuItem("Menu Item 2");
        JMenuItem i3=new JMenuItem("Menu Item 3");
        JMenuItem s1=new JMenuItem("Sub Menu Item 1");
        JMenuItem s2=new JMenuItem("Sub Menu Item 2");

        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m2.add(s1);
        m2.add(s2);

        m1.add(m2);
        mb.add(m1);

        f.setJMenuBar(mb);
        f.setSize(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
