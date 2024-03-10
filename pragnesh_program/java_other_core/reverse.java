package java_other_core;

import java.util.Scanner;

public class reverse {


    public static void main(String[] args) {
        int rem = 0;
        int rev = 0;
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        while (num != 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
//            System.out.println(num + " " + rem);
            num = num / 10;
        }
        System.out.println(rev);

    }
}
