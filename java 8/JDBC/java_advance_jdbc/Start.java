package java_advance_jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// before run code your server must be running  like xampp or mysql
public class Start {

    public static void main(String[] args)  {
        System.out.println("Enter the choice ");

        try {
            while (true) {
                // below line only takes string arguments
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Press 1 for add data");
                System.out.println("Press 2 for add show");
                System.out.println("Press 3 for add delete");
                System.out.println("Press 4 for update the data");
                System.out.println("Press 5 for add exit");
                int press = Integer.parseInt(br.readLine());
                if (press == 1) {

                    System.out.println("Enter the name");
                    String studentname = br.readLine();

                    System.out.println("Enter the city");
                    String studentcity = br.readLine();

                    System.out.println("Enter the phone-Number");
                    String studentphone = br.readLine();
                    Student s1 = new Student(studentname,studentcity,studentphone);
//                    System.out.println("is this print or not ??"); print
                    System.out.println(s1.toString());
                    boolean check=  StudentDao.insertdata(s1);

//                    boolean check = s1.insertdata();

                    if(check == true){
                        System.out.println("data successfully added... or what ...");

                    }
                    else{
                        System.out.println("Yeh kya ho gya .....");
                    }

                    // add data

                } else if (press == 2) {

//                    int userid = Integer.parseInt(br.readLine());
                    boolean check1 = StudentDao.showdata();


                    // show data

                } else if (press == 3) {
                    System.out.println("Enter the userid which you want to delete");

                    int userid = Integer.parseInt(br.readLine());
                    boolean check1 = StudentDao.deletedata(userid);
                    // delete
                    if (check1 == true) {
                        System.out.println("data successfully deleted... or what ...");

                    } else {
                        System.out.println("Yeh kya ho gya .....");
                    }
                }
                    // delete data
                    else if (press == 4){

                        boolean check1 = StudentDao.updatedata();
                        if(check1){
                            System.out.println("Your data is successfully updated");
                        }
                        else{
                            System.out.println("Are update nai ho raha he kya ");
                        }
                    }



                 else if (press == 5) {
                    System.out.println("You are exited Thank you");
                    break;
                }

                else {
                    System.out.println("Something is Wrong");
                }
            }
        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
