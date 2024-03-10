package java_annonymous_class;

interface annony {
    void show();
    void xyz();

    // annonyous class is work without function interface we no need of function interface
    // where as lamda is used with function interface.
}


public class anno {
    public static void main(String[] args) {


        annony a1 = new annony() {
            @Override
            public void show() {
                System.out.println("hello");
            }

            @Override
            public void xyz() {

            }


        };

        a1.show();
    }
}