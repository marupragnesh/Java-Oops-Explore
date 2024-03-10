package javacoreclasses;

import java.util.Scanner;

public class pelindrome1 {

    void skip1(String str4)
    {
    String text = str4; 
    text = text.replaceAll("[^a-zA-Z0-9]", ""); 
    System.out.println(text);
    //  String html = " ";
    //   html = html.replaceAll("[^a-zA-Z0-9\\s+]", ""); 
    //   System.out.println(html);
     }

    // Read more: https:
    //javarevisited.blogspot.com/2016/02/how-to-remove-all-special-characters-of-String-in-java.html#ixzz7rlURRTkN}
    void skip (String str3){
        for (int i=0; i<str3.length(); i++){
           int asciival = str3.charAt(i);
            // System.out.println(str3.charAt(i) + "=" + asciival);

            if(asciival < 32 && asciival > 47){
                continue;
            }
            else if (asciival < 32 && asciival > 47)
            continue;

            else if(asciival < 58 && asciival > 64)
            continue;

            else if(asciival < 91 && asciival > 96)
            continue;

            else if (asciival < 123 && asciival > 126)
            continue;

            // else 
            // System.out.println("Something is wronge");

            System.out.println(str3.charAt(i) + "=" + asciival);

        }
    }

    void check(String str1)
    {
        String rev = "";
        int len = str1.length();
        for (int i = (len - 1); i>=0; i--){
             rev =  rev + str1.charAt(i) ;
        }
        if(rev.equals(str1))
        System.out.println("String is javacoreclasses.pelindrome");
        else{
            System.out.println("not javacoreclasses.pelindrome");
        }
    }

    public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter the string");

        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        pelindrome1 p = new pelindrome1();
        // p.check(str);
        p.skip1(str1);
        str1 = str1.toLowerCase();
        boolean a = isPalindrome(str1);
        if(a == true)
        System.out.println("String is javacoreclasses.pelindrome");
        else{
            System.out.println("Not javacoreclasses.pelindrome");
        }

         p.check(str1);
         p.skip1(str1);
         s.close();


    }
}
