package java_normal_jdbc2;

import javax.swing.undo.StateEdit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
import java.sql.Statement;
import java.util.concurrent.ConcurrentNavigableMap;

public class DynamicInsert {

    public static void main(String[] args) {
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/dbpragnesh";
            String name = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, name , pass );

            String query = "insert into client (clientname) values (?)";
            PreparedStatement pstmt = con.prepareStatement(query);

//            pstmt.setString(2,"pintu");

            System.out.println("Enter the user name ");
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String name1 = bf.readLine();

            pstmt.setString(1,name1);



            pstmt.executeUpdate();
            System.out.println("Data is inserted");

            if(con.isClosed()){
                System.out.println("connection is closed");
            }
            else{
                System.out.println("connection is created ");
            }
            con.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
