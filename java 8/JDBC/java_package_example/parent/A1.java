package java_package_example.parent;

public class A1 {

    int a;
    int b;
    void show (int a,int b){
        int ans = a + b;
        System.out.println(ans);
    }

    public static void main(String[] args) {

        A1 a1 = new A1();
        a1.show(5,5);

    }
}