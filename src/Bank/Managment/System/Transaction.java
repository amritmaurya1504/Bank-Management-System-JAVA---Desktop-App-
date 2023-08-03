package Bank.Managment.System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.*;

public class Transaction extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;

    Transaction(String pin){
        setLayout(null);
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 900);
        add(l2);

        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        l1.setBounds(235,270,700,35);
        l2.add(l1);

        b1 = new JButton("DEPOSIT");
        b2 = new JButton("CASH WITHDRAWL");
        b3 = new JButton("FAST CASH");
        b4 = new JButton("MINI STATEMENT");
        b5 = new JButton("PIN CHANGE");
        b6 = new JButton("BALANCE ENQUIRY");
        b7 = new JButton("EXIT");

        b1.setBounds(170,399,150,35);
        l2.add(b1);

        b2.setBounds(390,399,150,35);
        l2.add(b2);

        b3.setBounds(170,443,150,35);
        l2.add(b3);

        b4.setBounds(390,443,150,35);
        l2.add(b4);

        b5.setBounds(170,488,150,35);
        l2.add(b5);

        b6.setBounds(390,488,150,35);
        l2.add(b6);

        b7.setBounds(390,533,150,35);
        l2.add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(960,1080);
        setLocation(300,0);
        setUndecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==b2){
            setVisible(false);
            new Withdrawal(pin).setVisible(true);
        }else if(ae.getSource()==b3){
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }else if(ae.getSource()==b4){
//            new MiniStatement(pin).setVisible(true);
        }else if(ae.getSource()==b5){
            setVisible(false);
//            new Pin(pin).setVisible(true);
        }else if(ae.getSource()==b6){
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }else if(ae.getSource()==b7){
            System.exit(0);
        }
    }
}
