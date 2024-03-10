package java_normal_jdbc2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/dbpragnesh";
            String name = "root";
            String pass = "";

            // create object of connection and pass parameter

            Connection con = DriverManager.getConnection(url, name, pass);

            String update = "update client set clientname = ?  where clientno = ?";

            System.out.println("Enter the update name");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name2 = br.readLine();

            System.out.println("Enter the clientno to update their name ");
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            int no =Integer.parseInt(br.readLine());

            PreparedStatement pstmt = con.prepareStatement(update);

            // below paramaterindex is matter it is given based on query or may always write increasement no.
            pstmt.setString(1,name2);
            pstmt.setInt(2, no);
// sequence doesnt matter


            pstmt.executeUpdate();
            System.out.println("java_normal_jdbc2.Update data successfully");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
