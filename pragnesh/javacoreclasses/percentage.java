package javacoreclasses;

import java.util.Scanner;

public class percentage {
        public static void main(String[] args) {
            System.out.println("Enter the CGPA");
            Scanner s = new Scanner(System.in);
            double i = s.nextDouble();

            double percentage = i * 9.5;
            System.out.println("Your Percentage is "+percentage);
            s.close();

        }
}
