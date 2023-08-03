package Bank.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;

    Withdrawal(String pin){

        setLayout(null);
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 900);
        add(l2);

        l1 = new JLabel("Enter the amount you want to withdraw : ");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("SANS_SERIF", Font.BOLD, 16));
        l1.setBounds(190,260,700,35);
        l2.add(l1);

        t1 = new JTextField();
        t1.setFont(new Font("SANS_SERIF", Font.BOLD, 22));

        b1 = new JButton("WITHDRAW");
        b2 = new JButton("BACK");

        setLayout(null);

        t1.setBounds(190,320,320,35);
        l2.add(t1);

        b1.setBounds(390,488,150,35);
        l2.add(b1);

        b2.setBounds(390,533,150,35);
        l2.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(960,1080);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b2){
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }else if(e.getSource() == b1){
            String amount = t1.getText();
            Date date = new Date();
//            System.out.println(date);
            if(t1.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Withdraw!");
            }else{
                Conn c1 = new Conn();
                String q = "insert into bank values('"+pin+"', '"+date+"', 'Withdraw', '"+amount+"')";
                try{
                    c1.s.executeUpdate(q);
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdrawed Successfully");
                    setVisible(false);
                    new Transaction(pin).setVisible(true);
                }catch (Exception error){
                    System.out.println(error);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Deposit("5566");
    }
}
