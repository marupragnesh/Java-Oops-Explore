package java_string;

import java.util.Locale;

public class str {

    public static void main(String[] args) {
        String s = new String();
        System.out.println(s); // nothing
        String s1 = new String("hello");
        String s2 = "pragnesh";
        String s3 = "HELLOl";
        StringBuffer sb = new StringBuffer("value");

        System.out.println(s1);
        System.out.println(s3.toLowerCase());
        System.out.println(s3.indexOf("l"));
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s3.lastIndexOf("l"));
        System.out.println();
        System.out.println(s2.charAt(0));

        sb.delete(4, 7);
        System.out.println("After delete: " + sb);
        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);

        sb.replace(2, 4, "was");
        System.out.println("After replace: " + sb);

     


    }
}
