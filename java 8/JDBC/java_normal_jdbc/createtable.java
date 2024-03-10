package java_normal_jdbc;

import java.sql.*;

public class createtable {

    //forname in load driver as string
    // always use try catch exception
    // psvm - also not give you suggesion

    public static void main(String[] args) {

        try {
            // load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/dbpragnesh";
            String name = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, name, pass);
            String query = "create table client (clientno INT(20) primary key auto_increment," +
                    " clientname VARCHAR(40))";

            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);

            if(con.isClosed()){
                System.out.println("connection is not establish");
            }else
            {
                System.out.println("table and connection is created");
            }
        }



        catch (Exception e){
            e.printStackTrace();
//            System.out.println();
        }
    }
}