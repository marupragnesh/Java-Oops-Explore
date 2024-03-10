package java_string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class grammer {
    public static void main(String[] args) {

        try {
            System.out.println("Enter the String ");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();

            System.out.println(name.replaceAll("\\b (oo|this|are|is|am)\\b", " "));
//            System.out.println("modified string: " +name1.trim());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}