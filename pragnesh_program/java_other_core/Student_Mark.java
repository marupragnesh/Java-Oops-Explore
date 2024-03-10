package java_other_core;

import java.util.Scanner;

//
public class Student_Mark {


    //        int subject = s.nextInt();
    void marks() {
        int i;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter marks Maths :");

        int marks1 = s.nextInt();

        System.out.print("Enter marks Science :");

        int marks2 = s.nextInt();
        System.out.print("Enter marks English :");

        int marks3 = s.nextInt();
        System.out.print("Enter marks Gujrati :");

        int marks4 = s.nextInt();

        System.out.print("Enter marks Hindi :");

        int marks5 = s.nextInt();

        int ans = (marks1 + marks2 + marks4 + marks3 + marks5) / 5;

        System.out.println("you Percentage is : " + ans);
//        System.out.println( );

        if (ans > 80) {
            System.out.print("Your grade java_super.A");
        } else if (ans <= 80 && ans >= 70) {
            System.out.print("Your grade is B");

        } else if (ans < 70 && ans >= 60) {
            System.out.print("Your grade C");

        } else if (ans < 60 && ans >= 50) {
            System.out.print("Your grade D");

        } else if (ans < 50 && ans >= 40) {
            System.out.print("Your grade E ");
        } else if (ans < 40) {
            System.out.print(" sorry you are fail");
        }
        else {
            System.out.println(" your grade is " + ans);
        }

    }


    public static void main(String[] args) {


        Student_Mark s1 = new Student_Mark();
        s1.marks();
    }
}

