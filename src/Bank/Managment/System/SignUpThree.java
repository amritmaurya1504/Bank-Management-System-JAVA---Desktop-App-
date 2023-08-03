package Bank.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpThree extends JFrame implements ActionListener {

    private JLabel l1, l2, l3, l4,l5,l6,l7,l8,l9,l10,l11,l12;
    private JRadioButton r1,r2,r3,r4;
    private JCheckBox c1,c2,c3,c4,c5,c6,c7;
    private JButton b1,b2;
    private String formNo;

    SignUpThree(String formNo){
        this.formNo = formNo;
        setLayout(null);

        setTitle("New SBI Account Application Form - Page 3");

        // -------- Adding Labels --------------

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        // Resizing Image
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon newImage = new ImageIcon(i2);
        // we have to place icon on frame using JLable
        l1 = new JLabel(newImage);
        l1.setBounds(70,10,100,100); // to use this we have to make null border laylout
        add(l1);



        l2 = new JLabel("Application Form No : " + formNo);
        l2.setFont(new Font("SANS_SERIF", Font.BOLD, 23));
        l2.setBounds(170,40,600,40);
        add(l2);

        l3 = new JLabel("Page 3 : Account Details");
        l3.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));
        l3.setForeground(Color.DARK_GRAY);
        l3.setBounds(170,65,200,40);
        add(l3);

        // ------ Account Type Label start ------------
        l4 = new JLabel("Account Type:");
        l4.setFont(new Font("SANS_SERIF", Font.BOLD, 18));
        l4.setBounds(100,140,200,30);
        add(l4);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.PLAIN, 14));

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.PLAIN, 14));

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.PLAIN, 14));

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.PLAIN, 14));

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);
        r1.setBounds(100,180,150,30);
        add(r1);

        r2.setBounds(350,180,300,30);
        add(r2);

        r3.setBounds(100,220,250,30);
        add(r3);

        r4.setBounds(350,220,250,30);
        add(r4);

        // ------ Account Type Label end ------------

        // ------ Card Label start ------------
        l5 = new JLabel("Card Number:");
        l5.setFont(new Font("SANS_SERIF", Font.BOLD, 18));

        l6 = new JLabel("XXXX-XXXX-XXXX-4184");
        l6.setFont(new Font("SANS_SERIF", Font.BOLD, 18));

        l7 = new JLabel("(Your 16-digit Card number)");
        l7.setFont(new Font("SANS_SERIF", Font.BOLD, 12));
        l7.setForeground(Color.DARK_GRAY);

        l8 = new JLabel("It would appear on ATM Card/Cheque Book.");
        l8.setFont(new Font("SANS_SERIF", Font.BOLD, 11));
        l8.setForeground(Color.DARK_GRAY);


        l5.setBounds(100,300,200,30);
        add(l5);

        l6.setBounds(330,300,250,30);
        add(l6);

        l7.setBounds(100,330,200,20);
        add(l7);

        l8.setBounds(330,330,500,20);
        add(l8);

        // ------- Card label end -----------

        // ------ PIN LABLE START ----------

        l9 = new JLabel("PIN:");
        l9.setFont(new Font("SANS_SERIF", Font.BOLD, 18));

        l10 = new JLabel("XXXX");
        l10.setFont(new Font("SANS_SERIF", Font.BOLD, 18));

        l11 = new JLabel("(4-digit password)");
        l11.setFont(new Font("SANS_SERIF", Font.BOLD, 12));
        l11.setForeground(Color.DARK_GRAY);

        l9.setBounds(100,370,200,30);
        add(l9);

        l10.setBounds(330,370,200,30);
        add(l10);

        l11.setBounds(100,400,200,20);
        add(l11);


        // ------ PIN LABEL END ------------

        // ----- Services start -------------

        l12 = new JLabel("Services Required:");
        l12.setFont(new Font("SANS_SERIF", Font.BOLD, 18));

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));

        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setFont(new Font("SANS_SERIF", Font.PLAIN, 12));

        c1.setBounds(100,500,200,30);
        add(c1);

        c2.setBounds(350,500,200,30);
        add(c2);

        c3.setBounds(100,550,200,30);
        add(c3);

        c4.setBounds(350,550,200,30);
        add(c4);

        c5.setBounds(100,600,200,30);
        add(c5);

        c6.setBounds(350,600,200,30);
        add(c6);

        c7.setBounds(100,660,600,20);
        add(c7);

        l12.setBounds(100,450,200,30);
        add(l12);

        // ----- Services end -------------

        // ---- Buttons --------

        b1 = new JButton("SUBMIT");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("CANCEL");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        b1.setBounds(220,700,100,30);
        add(b1);

        b2.setBounds(390,700,100,30);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setSize(700,800);
        setLocation(400,10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        }
        else if(r2.isSelected()){
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){
            atype = "Current Account";
        }else if(r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);

        String facility = "";
        if(c1.isSelected()){
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){
            facility = facility + " EMAIL Alerts";
        }
        if(c5.isSelected()){
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){
            facility = facility + " E-Statement";
        }

        try{
            if(atype.equals("") || facility.equals("")){
                JOptionPane.showMessageDialog(null, "Every field is required!");
            }else{
                if(c1.isSelected()){
                    if(ae.getSource() == b1){

                        Conn c1 = new Conn();
                        String q1 = "insert into SignUpThree values('"+formNo+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";
                        String q2 = "insert into Login values('"+formNo+"','"+cardno+"','"+pin+"')";
                        c1.s.executeUpdate(q1);
                        c1.s.executeUpdate(q2);
                        JOptionPane.showMessageDialog(null, "Card Number: "
                                + cardno + "\n Pin:"+ pin);

                        setVisible(false);
                        new Deposit(pin).setVisible(true);

                    }else if(ae.getSource() == b2){
                        setVisible(false);
                        new Login().setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Please check the declaration checkbox!");
                }
            }

        }catch (Exception error){
            System.out.println(error);
        }
    }

    public static void main(String[] args) {
        new SignUpThree("456");
    }


}
