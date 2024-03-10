package java_new_package;

public class Chain {
    static void calling(){



        ArithmeticException a = new ArithmeticException("this is arithmetic or what");
//        a.initCause(new java_new_package.pragneshException("My custome exception"));
        a.initCause(new NullPointerException("Exception Chaining"));
        throw a;
    }
}

