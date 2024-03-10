package java_normal_jdbc2;

import java.sql.*;

public class createtable {

    //forname in load driver as string
    // always use try catch exception
    // psvm - also not give you suggesion
    // you can write first sql query in  xampp and after you place in this program as string.

    public static void main(String[] args) {

//        Connection con = null;

        try {
            // load the drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/dbpragnesh";
            String name = "root";
            String pass = "";

            // create object of connection and pass parameter

            Connection con = DriverManager.getConnection(url, name, pass);
//            String query = "create table client (clientno int(20) primary key auto_increment," +
//                    " clientname varchar(40) not null)";
            // create query
            String q = "create table client (clientno int(20) primary key auto_increment , clientname varchar(40) not null )";
            // statement
            Statement stmt = con.createStatement();
            // execute and pass query
            stmt.executeUpdate(q);

            if(con.isClosed()){
                System.out.println("connection is not establish");

            }else {
                System.out.println("table and connection is created");
            }

        }



        catch (Exception e){
            e.printStackTrace();
//            System.out.println();
        }



    }
}