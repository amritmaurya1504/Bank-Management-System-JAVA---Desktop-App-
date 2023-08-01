package Bank.Managment.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUpTwo extends JFrame implements ActionListener {

    private JLabel l1, l2,l3,l4,l5,l6,l7,l8,l9,l10, l11, l12,l7a;
    private JTextField t9,t10;
    private JRadioButton rb1, rb2, rb3, rb4;
    private JButton next;
    private JComboBox c1,c2,c3,c4,c5;
    private String formNo;

    SignUpTwo(long randVal){
        this.formNo = "" + randVal;
        setLayout(null);

        setTitle("New SBI Account Application Form - Page 2");
        Random rand = new Random();
//        randVal = Math.abs((rand.nextLong() % 9000L) + 1000L);
        // System.out.println(randVal);

        // -------- Adding Labels --------------

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        // Resizing Image
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon newImage = new ImageIcon(i2);
        // we have to place icon on frame using JLable
        l1 = new JLabel(newImage);
        l1.setBounds(70,10,100,100); // to use this we have to make null border laylout
        add(l1);



        l2 = new JLabel("Application Form No : " + randVal);
        l2.setFont(new Font("Raleway", Font.BOLD, 23));
        l2.setBounds(170,40,600,40);
        add(l2);

        l3 = new JLabel("Page 2 : Additional Details");
        l3.setFont(new Font("Raleway", Font.PLAIN, 15));
        l3.setForeground(Color.DARK_GRAY);
        l3.setBounds(170,65,200,40);
        add(l3);

        l4 = new JLabel("Religion : ");
        l4.setFont(new Font("Raleway", Font.PLAIN, 18));
        l4.setForeground(Color.DARK_GRAY);
        l4.setBounds(90,130,200,30);
        add(l4);

        l5 = new JLabel("Category : ");
        l5.setFont(new Font("Raleway", Font.PLAIN, 18));
        l5.setForeground(Color.DARK_GRAY);
        l5.setBounds(90,180,200,30);
        add(l5);

        l6 = new JLabel("Income : ");
        l6.setFont(new Font("Raleway", Font.PLAIN, 18));
        l6.setForeground(Color.DARK_GRAY);
        l6.setBounds(90,230,200,30);
        add(l6);

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setFont(new Font("Arial", Font.PLAIN, 14));
        c3.setBounds(260,230,340,30);
        add(c3);

        l7 = new JLabel("Educational");
        l7.setFont(new Font("Raleway", Font.PLAIN, 18));
        l7.setForeground(Color.DARK_GRAY);
        l7.setBounds(90,280,200,30);
        add(l7);

        l7a = new JLabel("Qualification : ");
        l7a.setFont(new Font("Raleway", Font.PLAIN, 18));
        l7a.setForeground(Color.DARK_GRAY);
        l7a.setBounds(90,300,200,30);
        add(l7a);


        l8 = new JLabel("Occupation : ");
        l8.setFont(new Font("Raleway", Font.PLAIN, 18));
        l8.setForeground(Color.DARK_GRAY);
        l8.setBounds(90,350,200,30);
        add(l8);

        l9 = new JLabel("PAN Number : ");
        l9.setFont(new Font("Raleway", Font.PLAIN, 18));
        l9.setForeground(Color.DARK_GRAY);
        l9.setBounds(90,400,200,30);
        add(l9);


        l10 = new JLabel("Aadhar Number : ");
        l10.setFont(new Font("Raleway", Font.PLAIN, 18));
        l10.setForeground(Color.DARK_GRAY);
        l10.setBounds(90,450,200,30);
        add(l10);

        l11 = new JLabel("Senior Citizen : ");
        l11.setFont(new Font("Raleway", Font.PLAIN, 18));
        l11.setForeground(Color.DARK_GRAY);
        l11.setBounds(90,500,200,30);
        add(l11);

        l12 = new JLabel("Existing Account : ");
        l12.setFont(new Font("Raleway", Font.PLAIN, 18));
        l12.setForeground(Color.DARK_GRAY);
        l12.setBounds(90,550,200,30);
        add(l12);


        // -------- Adding Text Fields ----------------
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setFont(new Font("Arial", Font.PLAIN, 14));
        c1.setBounds(260,135,340,30);
        add(c1);

        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setFont(new Font("Arial", Font.PLAIN, 14));
        c2.setBounds(260,180,340,30);
        add(c2);

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education);
        c4.setFont(new Font("Arial", Font.PLAIN, 14));
        c4.setBounds(260,300,340,30);
        add(c4);

        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setFont(new Font("Arial", Font.PLAIN, 14));
        c5.setBounds(260,350,340,30);
        add(c5);


        t9 = new JTextField();
        t9.setFont(new Font("Arial", Font.PLAIN, 14));
        t9.setBounds(260,405,340,30);
        add(t9);

        t10 = new JTextField();
        t10.setFont(new Font("Arial", Font.PLAIN, 14));
        t10.setBounds(260,450,340,30);
        add(t10);

        // Radio Buttons

        rb1 = new JRadioButton("Yes");
        rb1.setBounds(260, 500, 90, 30);
//        rb1.setBackground(Color.WHITE);
        add(rb1);

        rb2 = new JRadioButton("No");
        rb2.setBounds(360,500,120,30);
        add(rb2);

        ButtonGroup seniorCitizen = new ButtonGroup();
        seniorCitizen.add(rb1);
        seniorCitizen.add(rb2);

        rb3 = new JRadioButton("Yes");
        rb3.setBounds(260, 550, 90, 30);
//        rb1.setBackground(Color.WHITE);
        add(rb3);

        rb4 = new JRadioButton("No");
        rb4.setBounds(360,550,120,30);
        add(rb4);

        ButtonGroup existingAccount = new ButtonGroup();
        existingAccount.add(rb3);
        existingAccount.add(rb4);



        next = new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(300, 640, 100, 30);
        next.addActionListener(this);
        add(next);
//        getContentPane().setBackground(Color.WHITE);
        setSize(700,800);
        setLocation(400,10);
//        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String)c1.getSelectedItem();
        String category = (String)c2.getSelectedItem();
        String income = (String)c3.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();

        String pan = t9.getText();
        String aadhar = t10.getText();

        String scitizen = "";
        if(rb1.isSelected()){
            scitizen = "Yes";
        }
        else if(rb2.isSelected()){
            scitizen = "No";
        }

        String eaccount = "";
        if(rb3.isSelected()){
            eaccount = "Yes";
        }else if(rb4.isSelected()){
            eaccount = "No";
        }

        try{

            if(religion.equals("") || category.equals("") || occupation.equals("") || pan.equals("") || income.equals("")
                    || aadhar.equals("") || scitizen.equals("") || eaccount.equals("") || education.equals("")){
                JOptionPane.showMessageDialog(null, "Every Field is Required!");
            }else{
                Conn c = new Conn();
                String q1 = "insert into signupTwo values('"+formNo+"','"+religion+"','"+category+"'," +
                        "'"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"'," +
                        "'"+scitizen+"','"+eaccount+"')";
                c.s.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "Data Saved to DB!");

                // SignUp 3 Object
            }

        }catch (Exception error){
            System.out.println(error);
        }

    }

    public static void main(String[] args) {
        new SignUpTwo(1233);
    }
}
