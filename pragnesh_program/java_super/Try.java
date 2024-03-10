package java_super;

abstract class A{
    static int a;
    final int b;

    // final variable can only be initailize through constructor

    A(int b) {
        this.b = b;
        System.out.println(b);
    }
}

 class Try {
    public static void main(String[] args) {
        System.out.println("hii");
    }
}
