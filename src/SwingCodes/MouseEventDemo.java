package SwingCodes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo  implements MouseListener {
    static JLabel l1,l2,l3;

    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p=new JPanel();
        p.setLayout(new GridLayout(3,1,5,5));
        l1=new JLabel("No Event");
        l2=new JLabel("No Event");
        l3=new JLabel("No Event");

        p.add(l1);
        p.add(l2);
        p.add(l3);
        f.add(p);
        MouseEventDemo m=new MouseEventDemo();
//        for main method we cant use this

        p.addMouseListener(m);
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l3.setText("Clicked at :"+e.getX()+" "+e.getY()+" "+e.getClickCount()+"Times clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("Mouse Pressed at :"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("Mouse Released at :"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l2.setText("Mouse Entered from :"+e.getX()+" "+e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l2.setText("Mouse Exited from :"+e.getX()+" "+e.getY());
    }
}
