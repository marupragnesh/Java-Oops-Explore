package java_myinterface;

interface ii {
    public String show();
}
public class irefcall implements ii {
    @Override
    public String show() {
        String s = "pragnesh";
        System.out.println("hhoooo");
        return "this is string";
    }
    public String call(){
        ii obj = new irefcall();
        obj.show();
        return null;
    }
    public static void main(String[] args) {
        irefcall objclass = new irefcall();
        objclass.call();

//        java_myinterface.ii obj;  = new java_myinterface.irefcall();
    }
}
