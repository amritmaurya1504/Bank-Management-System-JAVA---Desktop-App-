package Bank.Managment.System;

import java.sql.*;

public class Conn {

    // 5 Steps in JDBC Connection
    /*
    *  1 -> Register the driver
    *  2 -> Create Connection
    *  3 -> Create Statement
    *  4 -> Execute Query
    *  5 -> Exit Connection
    * */

    Connection c;
    Statement s;

    public Conn(){
        try{

//            Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagementSystem", "root", "Am.raj@2002");
            s = c.createStatement();


        }catch (Exception e){
            System.out.println(e);
        }
    }

}
