package Bank.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignUpOne extends JFrame implements ActionListener {

    private JLabel l1, l2,l3,l4,l5,l6,l7,l8,l9,l10, l11, l12, l13;
    private JTextField t4,t5,t8,t10,t11,t12,t13;
    private JDateChooser t6;
    private JRadioButton rb1, rb2, rb3, rb4;
    private JButton next;
    private long randVal;

    SignUpOne(){
        setLayout(null);

        setTitle("New SBI Account Application Form");
        Random rand = new Random();
        randVal = Math.abs((rand.nextLong() % 9000L) + 1000L);
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
        l2.setFont(new Font("SANS_SERIF", Font.BOLD, 23));
        l2.setBounds(170,40,600,40);
        add(l2);

        l3 = new JLabel("Page 1 : Personal Details");
        l3.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));
        l3.setForeground(Color.DARK_GRAY);
        l3.setBounds(170,65,200,40);
        add(l3);

        l4 = new JLabel("Name : ");
        l4.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l4.setForeground(Color.DARK_GRAY);
        l4.setBounds(90,130,200,30);
        add(l4);

        l5 = new JLabel("Father's Name : ");
        l5.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l5.setForeground(Color.DARK_GRAY);
        l5.setBounds(90,180,200,30);
        add(l5);

        l6 = new JLabel("Date of Birth : ");
        l6.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l6.setForeground(Color.DARK_GRAY);
        l6.setBounds(90,230,200,30);
        add(l6);

        t6 = new JDateChooser();
        t6.setBounds(260, 230, 340, 30);
        t6.setForeground(Color.BLACK);
        add(t6);

        l7 = new JLabel("Gender : ");
        l7.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l7.setForeground(Color.DARK_GRAY);
        l7.setBounds(90,280,200,30);
        add(l7);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(260, 280, 60, 30);
//        rb1.setBackground(Color.WHITE);
        add(rb1);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(360,280,120,30);
        add(rb2);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rb1);
        genderGroup.add(rb2);

        l8 = new JLabel("Email ID : ");
        l8.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l8.setForeground(Color.DARK_GRAY);
        l8.setBounds(90,330,200,30);
        add(l8);

        l9 = new JLabel("Marital Status : ");
        l9.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l9.setForeground(Color.DARK_GRAY);
        l9.setBounds(90,380,200,30);
        add(l9);

        rb3 = new JRadioButton("Married");
        rb3.setBounds(260, 380, 90, 30);
//        rb1.setBackground(Color.WHITE);
        add(rb3);

        rb4 = new JRadioButton("Unmarried");
        rb4.setBounds(360,380,120,30);
        add(rb4);

        ButtonGroup mariedGround = new ButtonGroup();
        mariedGround.add(rb3);
        mariedGround.add(rb4);

        l10 = new JLabel("Address : ");
        l10.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l10.setForeground(Color.DARK_GRAY);
        l10.setBounds(90,430,200,30);
        add(l10);

        l11 = new JLabel("City : ");
        l11.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l11.setForeground(Color.DARK_GRAY);
        l11.setBounds(90,480,200,30);
        add(l11);

        l12 = new JLabel("PinCode : ");
        l12.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l12.setForeground(Color.DARK_GRAY);
        l12.setBounds(90,530,200,30);
        add(l12);

        l13 = new JLabel("State : ");
        l13.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
        l13.setForeground(Color.DARK_GRAY);
        l13.setBounds(90,580,200,30);
        add(l13);

        // -------- Adding Text Fields ----------------
        t4 = new JTextField();
        t4.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));
        t4.setBounds(260,135,340,30);
        add(t4);

        t5 = new JTextField();
        t5.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));
        t5.setBounds(260,180,340,30);
        add(t5);

        t8 = new JTextField();
        t8.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));
        t8.setBounds(260,335,340,30);
        add(t8);

        t10 = new JTextField();
        t10.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));
        t10.setBounds(260,440,340,30);
        add(t10);

        t11 = new JTextField();
        t11.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));
        t11.setBounds(260,485,340,30);
        add(t11);

        t12 = new JTextField();
        t12.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));
        t12.setBounds(260,530,340,30);
        add(t12);

        t13 = new JTextField();
        t13.setFont(new Font("SANS_SERIF", Font.PLAIN, 14));
        t13.setBounds(260,575,340,30);
        add(t13);

        next = new JButton("Next");
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(300, 640, 100, 30);
        next.addActionListener(this);
        add(next);
//        getContentPane().setBackground(Color.WHITE);
        setSize(700,800);
        setLocation(400,10);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo, name, fatherName, dob, gender, email, marital, address, city, pincode, state;

        formNo = "" + randVal;
        name = t4.getText();
        fatherName = t5.getText();
        dob =  ((JTextField) t6.getDateEditor().getUiComponent()).getText();
        gender = null;

        if(rb1.isSelected()){
            gender = "Male";
        }else if(rb2.isSelected()){
            gender = "Female";
        }

        email = t8.getText();
        marital = null;
        if(rb3.isSelected()){
            marital = "Married";
        }else if(rb4.isSelected()){
            marital = "Unmarried";
        }

        address = t10.getText();
        city = t11.getText();
        pincode = t12.getText();
        state = t13.getText();

        try{
            if(name.equals("") || fatherName.equals("") || dob.equals("") || gender.equals("") || email.equals("")
            || marital.equals("") || address.equals("") || city.equals("") || pincode.equals("") || state.equals("")){
                JOptionPane.showMessageDialog(null, "Every Field is Required!");
            }else{
                Conn c = new Conn();
                String q1 = "insert into SignUpMain values('"+formNo+"','"+name+"','"+fatherName+"','"+dob+"','"+gender+"'," +
                        "'"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(q1);
                //JOptionPane.showMessageDialog(null, "Data Saved to DB!");

                setVisible(false);
                new SignUpTwo(randVal).setVisible(true);
            }

        }catch (Exception error){
            System.out.println(error);
        }

    }

//    public static void main(String[] args) {
//        new SignUpOne();
//    }

}
