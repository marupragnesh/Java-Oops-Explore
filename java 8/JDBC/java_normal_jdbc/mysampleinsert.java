package java_normal_jdbc;

import java.sql.*;
import java.util.*;
import java.lang.*;
import  java.io.*;

/**
 *
 * @author Dhaval Mehta
 */
public class mysampleinsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection conn = null;
        String stmt = null;

        ResultSet rs = null;

        try
        {

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        }
        catch (Exception ex)
        {
            System.out.print("Driver Load Problem : "+ ex.getMessage());

        }
        try
        {
            String url1 ="jdbc:mysql://localhost:3306/dbpragnesh";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url1,user,pass);



        }
        catch (SQLException ex)
        {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        try
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter Your name ");
            String ename= sc.next();
            String query1 = "insert into client (clientname) values (?)";
            PreparedStatement pstmt = conn.prepareStatement(query1);

            pstmt.setString(1,ename);


            pstmt.executeUpdate();


            System.out.print(ename + " is added successfully");




        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
