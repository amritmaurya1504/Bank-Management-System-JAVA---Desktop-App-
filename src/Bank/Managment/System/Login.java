package Bank.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JButton login, register, clear; // Global Variable
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        // Resizing Image
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon newImage = new ImageIcon(i2);
        // we have to place icon on frame using JLable
        JLabel label = new JLabel(newImage);
        label.setBounds(70,10,100,100); // to use this we have to make null border laylout
        add(label);

        JLabel text = new JLabel("Welcome to State Bank Of India");
        text.setFont(new Font("SANS_SERIF", Font.BOLD, 24));
        text.setBounds(170,60,400,40);
        add(text);

        JLabel cardNo = new JLabel("Enter Your Card No : ");
        cardNo.setFont(new Font("SANS_SERIF", Font.ITALIC, 15));
        cardNo.setBounds(130,120,400,40);
        add(cardNo);

        cardTextField = new JTextField();
        cardTextField.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));
        cardTextField.setBounds(130,160,400,40);
        add(cardTextField);


        JLabel atmPin = new JLabel("Enter Your ATM Pin : ");
        atmPin.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));
        atmPin.setFont(new Font("SANS_SERIF", Font.ITALIC, 15));
        atmPin.setBounds(130,200,400,40);
        add(atmPin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(130,240,400,40);
        add(pinTextField);

        login = new JButton("LOGIN");
        login.setBounds(170, 320, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        register = new JButton("REGISTER");
        register.setBounds(340, 320, 150, 30);
        register.setBackground(Color.BLACK);
        register.setForeground(Color.WHITE);
        register.addActionListener(this);
        add(register);

        clear = new JButton("CLEAR");
        clear.setBounds(250, 370, 150, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

//        getContentPane().setBackground(Color.WHITE);

        setSize(700,500); // setting size of frame
        setVisible(true); // visibility on
        setLocation(400, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // What to do if some buttons is clicked
        if(e.getSource() == login){
            Conn c = new Conn();
            String cardno = cardTextField.getText();
            String pin = pinTextField.getText();

            String query = "select * from Login where cardno = '"+cardno+"' and pin = '"+pin+"'";

            try{
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transaction(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }catch (Exception err){
                System.out.println(err);
            }

        }else if(e.getSource() == register){
            setVisible(false);
            new SignUpOne().setVisible(true);
        }else if(e.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
    }
    public static void main(String[] args) {
        new Login();
    }


}
