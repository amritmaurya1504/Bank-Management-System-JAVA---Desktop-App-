package Bank.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton back;
    String pin;
    BalanceEnquiry(String pin){
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 960, 900);
        add(l2);

        back = new JButton("BACK");
        back.setBounds(365,530,150,30);
        l2.add(back);
        back.addActionListener(this);

        int balance = 0;

        // -------- fetching balance -----------
        try{
            Conn c = new Conn();
            String q = "select * from bank where pin = '"+pin+"'";
            ResultSet rs = c.s.executeQuery(q);
            int count = 1;
            while (rs.next()){
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                    // System.out.println(balance + " -> Deposited");
                }else if(rs.getString("type").equals("Withdraw")){
                    balance = balance - Integer.parseInt(rs.getString("amount"));
                    // System.out.println(balance + " -> WithDraw");
                }
                // System.out.println(balance + " -> Main " + count++);
            }

        }catch (Exception err){
            System.out.println(err);
        }

        JLabel text = new JLabel("Your Current Account Balance is RS : " + balance);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("SANS_SERIF", Font.BOLD, 14));
        text.setBounds(190, 350, 400 ,30);
        l2.add(text);


        setSize(900, 900);
        setLocation(300,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new BalanceEnquiry("5992");
    }
}
