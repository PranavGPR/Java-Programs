package Ramy;

import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame
{

    public Calculator() {
        initComponents();
    }                          
    private void initComponents() {

        t1 = new JTextField();
        b1 = new JButton();
        b3 = new JButton();
        b2 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b10 = new JButton();
        b11 = new JButton();
        b12 = new JButton();
        b13 = new JButton();
        b14 = new JButton();
        b15 = new JButton();
        b16 = new JButton();
        b19 = new JButton();
        b17 = new JButton();
        b18 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(454,386);
        setLayout(null);

        t1.setHorizontalAlignment(JTextField.LEFT);
        add(t1);
        t1.setBounds(10, 10, 440, 70);

        b1.setText("9");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        add(b1);
        b1.setBounds(10, 90, 80, 40);

        b3.setText("7");
        add(b3);
        b3.setBounds(190, 90, 80, 40);

        b2.setText("8");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        add(b2);
        b2.setBounds(100, 90, 80, 40);

        b4.setText("/");
        add(b4);
        b4.setBounds(280, 90, 80, 40);

        b5.setText("4");
        add(b5);
        b5.setBounds(10, 140, 80, 40);

        b6.setText("5");
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        add(b6);
        b6.setBounds(100, 140, 80, 40);

        b7.setText("6");
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        add(b7);
        b7.setBounds(190, 140, 80, 40);

        b8.setText("+");
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        add(b8);
        b8.setBounds(280, 240, 80, 40);

        b9.setText("1");
        add(b9);
        b9.setBounds(10, 190, 80, 40);

        b10.setText("2");
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        add(b10);
        b10.setBounds(100, 190, 80, 40);

        b11.setText("3");
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        add(b11);
        b11.setBounds(190, 190, 80, 40);

        b12.setText("-");
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        add(b12);
        b12.setBounds(280, 190, 80, 40);

        b13.setText(".");
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        add(b13);
        b13.setBounds(10, 240, 80, 40);

        b14.setText("0");
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        add(b14);
        b14.setBounds(100, 240, 80, 40);

        b15.setText("%");
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        add(b15);
        b15.setBounds(190, 240, 80, 40);

        b16.setText("*");
        b16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        add(b16);
        b16.setBounds(280, 140, 80, 40);

        b19.setText("=");
        b19.setMaximumSize(new java.awt.Dimension(65, 76));
        add(b19);
        b19.setBounds(370, 190, 80, 90);

        b17.setText("CLR");
        add(b17);
        b17.setBounds(370, 90, 80, 40);

        b18.setText("SCI");
        b18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        add(b18);
        b18.setBounds(370, 140, 80, 40);

    }// </editor-fold>                        

    private void b1ActionPerformed(ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void b6ActionPerformed(ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void b7ActionPerformed(ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void b10ActionPerformed(ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void b11ActionPerformed(ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void b12ActionPerformed(ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void b13ActionPerformed(ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void b14ActionPerformed(ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void b15ActionPerformed(ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void b16ActionPerformed(ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void b2ActionPerformed(ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void b18ActionPerformed(ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    private void b8ActionPerformed(ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    public static void main(String args[]) {
        new Calculator().setVisible(true);
    }                     
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    private JTextField t1;                   
}
