package java_advance_jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertData {

    public static void main(String[] args) {
        System.out.println("choose option from below ");
        System.out.println("");

        try{
            Connection c = ConnectionProvider.getConnection();

            String query = "insert into todo (title ) value (?)";

            PreparedStatement pstmt = c.prepareStatement(query);

            System.out.println("Enter the name ");
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            pstmt.executeUpdate();

//            pstmt.setString(1,);


        }
        catch (Exception e){
            e.printStackTrace();

        }
    }
}
