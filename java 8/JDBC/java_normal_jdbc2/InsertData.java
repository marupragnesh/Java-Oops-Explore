package java_normal_jdbc2;

import javax.swing.undo.StateEdit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.concurrent.ConcurrentNavigableMap;

public class InsertData {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/dbpragnesh";
            String name = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, name , pass );

           String query = "insert into client (clientname) values (?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1,"pragnesh");
//            pstmt.setString(2,"pintu");

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
