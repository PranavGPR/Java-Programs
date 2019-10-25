package test;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ColourChanger extends JFrame{
    public static void main(String[] args) {
        JFrame f = new JFrame("Colour Changer");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setBounds(100,100,400,300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.getContentPane().setBackground(Color.GRAY);
        JButton b1 = new JButton("Black!");
        JButton b2= new JButton("Pink!");
        JButton b3 = new JButton("Blue!");
        JButton b4 = new JButton("Green!");
        JButton b5 = new JButton("Red!");
        b1.setBounds(50, 50, 150, 30);
        f.add(b1);
        b2.setBounds(50, 80, 150, 30);
        f.add(b2);
        b3.setBounds(50, 110, 150, 30);
        f.add(b3);
        b4.setBounds(50, 140, 150, 30);
        f.add(b4);
        b5.setBounds(50, 170, 150, 30);
        f.add(b5);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.BLACK);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.MAGENTA);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.BLUE);
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.GREEN);
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f.getContentPane().setBackground(Color.RED);
            }
        });
    }
}
