package java_string;

import java.util.Arrays;

public class All_Strings {


    public static void main(String[] args) {

        char ch1[] = {4, 'a', 'n', 'p', '*', 'n'};
        int i1[] = {64, 65, 67};
        String s1 = new String(ch1);
        String s2 = new String(ch1, 2, 3); //count form 0
        String s3 = new String(Arrays.toString(i1));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        String s4 = new String(s3);
        // when you pass the object then it may string or char , otherwise you call somethod or may get error
        byte ascii[] = {65, 66, 67, 68, 69, 70};
        String s5 = new String(ascii);
        System.out.println(s5);

        String s6 = "pragnesh"; // count form 1
        String s7 = new String("whatisoriginal");
        System.out.println(s6.length());
        System.out.println(s7.length());
        System.out.println("desai length is " + "desai".length());

        String s8 = "this " + "is " + "concatination";
        System.out.println(s8);
// concatination with other data types
        String s9 = "four: " + 2 + 2; // defalut type conversion
        System.out.println(s9);

        int a1 = 10;
        String s10 = String.valueOf(a1);
        System.out.println("value of is "+s10);

        String xy = (String)s10;
        System.out.println("xy value is"+xy);

        //getChars  - it give you substring
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);

        String s12 = "amanbhai";
        byte b[] = s12.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        String s13 = new String(b);
        System.out.println(b);
        System.out.println(s13);

        String s14 = "amanbhai";
        char che2[] = s14.toCharArray();
        for (int value : che2) {
            System.out.print(value);
        }
        System.out.println();

        int a4 = 53;
        String s15 = new String();
        s15 = Integer.toString(a4);
        System.out.println(s15);

    }
}
