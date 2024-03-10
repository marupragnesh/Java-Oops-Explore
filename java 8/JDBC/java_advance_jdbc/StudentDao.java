package java_advance_jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

   static boolean f = false;


   public static boolean insertdata(Student st) {
        try {
            Connection con = ConnectionProvider.getConnection();


            String insertdata = "insert into student (studentname , studentcity, studentphone) value (?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(insertdata);

            pstmt.setString(1, st.getStudentname());
            pstmt.setString(2, st.getStudentcity());
            pstmt.setString(3, st.getStudentphone());

            pstmt.executeUpdate();

            System.out.println("Your data is successfully added......");
             f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }


    public static boolean deletedata(int userid) {
        try {
            Connection con = ConnectionProvider.getConnection();


            String deletequery = "delete from student where studentid = ?";

            PreparedStatement pstmt = con.prepareStatement(deletequery);

           pstmt.setInt(1,userid);

            pstmt.executeUpdate();

            System.out.println("Your data is successfully deleted......");
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean showdata() {
        try {
            Connection con = ConnectionProvider.getConnection();


            String showquery = "select * from student";

//            PreparedStatement pstmt = con.prepareStatement(insertdata);

            Statement stmt = con.createStatement();

            ResultSet set = stmt.executeQuery(showquery);

            while(set.next()){

                System.out.println("whoooooooooooooooooooo");

                int id = set.getInt(1);
                String name = set.getString("studentname");
                String city = set.getString("studentcity");
                String phone = set.getString("studentphone");
                System.out.println("id is :" +id);
                System.out.println("name is: "+name);
                System.out.println("city is : "+city);
                System.out.println("phone is: "+phone);
            }
//            pstmt.setInt(1,userid);
//
//            pstmt.executeUpdate();

            System.out.println("----------------------------");
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
    public static boolean updatedata() {
        try {
            Connection con = ConnectionProvider.getConnection();
            int i = 1;
            while (i <= 1){
                System.out.println("for name update press 1");
                System.out.println("for city update press 2");
                System.out.println("for phone update press 3");
                System.out.println("for multiple update press 4");
                BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));{
                    int press = Integer.parseInt(br1.readLine());

                    if(press == 1){
                        System.out.println("Enter the updated student name");
                        BufferedReader br11 = new BufferedReader(new InputStreamReader(System.in));
                        String name1 = br11.readLine();

                        String updatequery1 = "update student set studentname=? " +
                                "where studentid = ? ";

                        PreparedStatement pstmt = con.prepareStatement(updatequery1);

                        pstmt.setString(1,name1);
                        pstmt.executeUpdate();

                    } else if (press == 2) {
                        System.out.println("Enter the updated student city");
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
                        String city1 = br2.readLine();
                        String updatequery2 = "update student set  studentcity=?  " +
                                "where studentid = ? ";

                        PreparedStatement pstmt = con.prepareStatement(updatequery2);
                        pstmt.setString(1,city1);
                        pstmt.executeUpdate();

                    }
                    else if (press == 3){
                        System.out.println("Enter the updated student phone");
            BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
                        String phone1 = br3.readLine();

                        String updatequery3 = "update student set  studentphone=? " +
                                "where studentid = ? ";

                        PreparedStatement pstmt = con.prepareStatement(updatequery3);

                        pstmt.setString(1,phone1);
                        pstmt.executeUpdate();

                    }
                    else if (press == 4){

//
                     BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
//

                        System.out.println("Enter the name you want to update ");
                        String name = br4.readLine();

                        System.out.println("Enter the city you want to update");
                        String city = br4.readLine();

                        System.out.println("Enter the phone you want to update");
                        String phone = br4.readLine();

                        String updatequery4 = "update student set studentname=?, studentcity=? , studentphone=? " +
                                "where studentid = ? ";

                        System.out.println("Enter the student id you want to update");
//                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        int sid = Integer.parseInt(br4.readLine());

                        PreparedStatement pstmt = con.prepareStatement(updatequery4);

                        pstmt.setString(1,name);
                        pstmt.setString(2, city);

                        pstmt.setString(3,phone);
                        pstmt.setInt(4,sid);
                        pstmt.executeUpdate();

                    }

                }

            }
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
