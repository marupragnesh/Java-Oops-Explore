package java_new_package;

class ab {
    int a = 10, b = 0;
    int val[] = {1, 2, 3};

    void call() {
        try {
//            int ans = a / b;
            val[10] = 90;

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(" this exception say ---> " + e.getMessage());

        }
    }
}


public class Multiple_E {
    public static void main(String[] args) {
        ab obj = new ab();
        obj.call();
    }
}
