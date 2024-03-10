package java_new_package;// throw must be use in try catch block

public class throwkeyword {
    public static void main(String[] args) {
        int i = 1;

        try {
            if (i == 1) {
                throw new ArithmeticException("hello ");
            }
        }catch (NullPointerException e){ // change line with Arithmetic Exception
            System.out.println("none" + e);
        }
        System.out.println(i);

    }
}
