package java_new_package;

class pragneshException extends Exception{


    public pragneshException (String s){
        super(s);
    }

}




public class main1 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        int ans = 9/10;
        System.out.println(ans);

        try {
            // divide zero
            if (ans == 0)
                throw new pragneshException("help this is exception");

        } catch (pragneshException e) {
            System.out.println(e);

        }

    }
}

