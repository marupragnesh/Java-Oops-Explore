package java_advance_jdbc;

import java.sql.*;


public class ConnectionProvider {
    public static Connection con;

    public static Connection getConnection() {

        try {
            if (con == null) {

                Class.forName("com.mysql.cj.jdbc.Driver");

//                String url = "jdbc:mysql://localhost:3306/studentss";
//                String name = "root";
//                String pass = "";

//                con = DriverManager.getConnection(url, name, pass);
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentss", "root", "");


                if(con.isClosed()){
                    System.out.println("Server is not connected please try again");
                }else {
                    System.out.println("Database connection establish successfully");
                }
                System.out.println("temp");

            }
       }
        catch (Exception e) {
            e.printStackTrace();
        }
        return con;


    }

    public static void main(String[] args) {
        System.out.println("temp");
        ConnectionProvider.getConnection();


    }

}

