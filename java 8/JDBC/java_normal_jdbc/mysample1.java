package java_normal_jdbc;

import java.sql.*;

/**
 *
 * @author Dhaval Mehta
 */
public class mysample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
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
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost/dbpragnesh?" +
                            "user=root&password=");




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
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM emp");
            while(rs.next())
            {
                System.out.print(""+rs.getInt("eno"));
                System.out.print("-"+rs.getString("ename"));

            }

        }
        catch(Exception e)
        {
            System.out.print("Problem  : "+ e.getMessage());
        }
    }

}
