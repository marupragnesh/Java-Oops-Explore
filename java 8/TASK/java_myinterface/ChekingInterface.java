package java_myinterface;

interface myinterface{
    public void show();
}
public class ChekingInterface implements myinterface{

    int i = 1;
    @Override
    public void show() {
        ++i;
        System.out.println(i);
    }
    public void aemj(){
        System.out.println(" aemj "+i);
    }

    public int imethod(){
        return i;
    }

    public static void main(String[] args) {
        ChekingInterface c1 = new ChekingInterface();
            myinterface m1 = new ChekingInterface();
            m1.show();
//        System.out.println(m1.);
            c1.show();
        System.out.println(c1.imethod());
    }

    myinterface m2;
    public void mymethod(){
//        m2.show();

    }

}
