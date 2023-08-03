package Bank.Managment.System;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JLabel l1, l2;
    JButton b1, b2, b3, b4, b5, b6, b7, b8;
    JTextField t1;
    String pin;

    FastCash(String pin) {
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 960, 900);
        add(l3);

        l1 = new JLabel("SELECT WITHDRAWL AMOUNT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("SANS_SERIF", Font.BOLD, 16));

        b1 = new JButton("Rs 100");
        b2 = new JButton("Rs 500");
        b3 = new JButton("Rs 1000");
        b4 = new JButton("Rs 2000");
        b5 = new JButton("Rs 5000");
        b6 = new JButton("Rs 10000");
        b7 = new JButton("BACK");

        setLayout(null);

        l1.setBounds(235, 300, 700, 35);
        l3.add(l1);

        b1.setBounds(170, 399, 150, 35);
        l3.add(b1);

        b2.setBounds(390, 399, 150, 35);
        l3.add(b2);

        b3.setBounds(170, 443, 150, 35);
        l3.add(b3);

        b4.setBounds(390, 443, 150, 35);
        l3.add(b4);

        b5.setBounds(170, 488, 150, 35);
        l3.add(b5);

        b6.setBounds(390, 488, 150, 35);
        l3.add(b6);

        b7.setBounds(390, 533, 150, 35);
        l3.add(b7);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);

        setSize(960, 1080);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b7){
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }else{
            try{
                String amount = ((JButton)ae.getSource()).getText().substring(3);
                Conn c = new Conn();
                String q = "select * from bank where pin = '"+pin+"'";
                ResultSet rs = c.s.executeQuery(q);
                int balance = 0;
                while (rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else if(rs.getString("type").equals("Withdraw")){
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if (ae.getSource() != b7 && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }

                if (ae.getSource() == b7) {
                    this.setVisible(false);
                    new Transaction(pin).setVisible(true);
                }else{
                    Date date = new Date();
                    c.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Withdraw', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdrawed Successfully");

                    setVisible(false);
                    new Transaction(pin).setVisible(true);
                }

            }catch (Exception err){
                System.out.println(err);
            }


        }
    }

}