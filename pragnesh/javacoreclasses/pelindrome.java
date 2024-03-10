package javacoreclasses;

import java.util.*;
// import java.util.Scanner;

class pelindrome {

   /*  void skip (String str3){
        for (int i=0; i<str3.length(); i++){
           int asciival = str3.charAt(i);
            System.out.println(str3.charAt(i) + "=" + asciival);
        }
    }
*/ 
    void check1(String str2){
        System.out.println("  "+str2);
    }
    void check(String str1){
       
        String rev = " ";
        int strlen = str1.length(); 
        // below to for loop possible (str1.length - 1)
        for(int i = (strlen-1); i>=0; i--){
            rev = rev + str1.charAt(i);

         

            // int asciival = str1.charAt(i);
            // System.out.println(str1.charAt(i) + "=" + asciival);
            // charat is bool 1 and need any string to store rev
        }
        /*  String str0 = str1.toLowerCase();
         String rev0 = rev.toLowerCase();
        String rev1 = rev;
        String str9 = str1;
        */
        System.out.println("rev value is "+ rev);   
        System.out.println("str1 value is "+ str1);
        // if(str == rev) main problem // strcmp
        // boolean value = (rev1.compareTo(str9));
        
        // System.out.println(""+rev1.compareTo(str9));  
        // return false;  
        // if(value == true)
      /*  if(rev0.compareTo(str0)== 1)
       {
        System.out.println("String is Pelindrome ");
       }
       else{
        System.out.println( " Your string is NOT javacoreclasses.pelindrome" );
       }
       */
    }
    public static void main(String[] args) {
        System.out.println("Enter the string");
        // boolean b1 = false;
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int strlength = str.length();
        System.out.println("Your string is "+ str);
        pelindrome p = new pelindrome();
        p.check1(str);
        System.out.println("YOur string length is "+strlength);
        p.check(str);


        // p.skip(str);
     /*   if(b1 == true ){
            System.out.println("String is javacoreclasses.pelindrome ");
        }
        else{
            System.out.println("NOT javacoreclasses.pelindrome ");
        }*/
        s.close();
    }
    
}





// learn charAt compareTO equal stringname.toUpperCase if(function == 0) function returntype 