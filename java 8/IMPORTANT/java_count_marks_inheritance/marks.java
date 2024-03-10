package java_count_marks_inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class marks {
    int marks1;
    int marks2;
    int marks3;
    String name;
    void name(){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the student name ");
             name = br.readLine();

            System.out.println("IN three subject - Enter first subject java_count_marks.marks");
            marks1 = Integer.parseInt(br.readLine());

            System.out.println("IN three subject - Enter second subject java_count_marks.marks");
            marks2 = Integer.parseInt(br.readLine());

            System.out.println("IN three subject - Enter third subject java_count_marks.marks");
            marks3 = Integer.parseInt(br.readLine());

        }catch (Exception e){
            System.out.println("something wrong ");
        }
    }
}


