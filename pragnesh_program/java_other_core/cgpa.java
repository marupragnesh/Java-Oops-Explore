package java_other_core;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        System.out.println("Enter How many subjects ");
        Scanner s = new Scanner(System.in);
        int sub = s.nextInt();

        int mark[] = new int[sub];
        System.out.println("mark size" + mark.length);

        int i;
        for (i = 0; i < sub; i++) {
            System.out.println("Enter marks of " + i + " subject ");
            mark[i] = s.nextInt();
        }

        double sum = 0;
        for (int j = 0; j < sub; j++) {
            sum = sum + mark[j];
        }
        sum = sum / sub;

        System.out.println("Your Cgpa is" + sum);
        System.out.println("Your percentage is " + (sum / 10) * 9.5);

    }
}
