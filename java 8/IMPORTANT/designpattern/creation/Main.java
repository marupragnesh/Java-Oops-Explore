package designpattern.creation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        os obj = new Android();
//        obj.spec();  it is tightly coupled;

        FactoryDesign fd = new FactoryDesign();
//        fd.getos("open");
       os obj = fd.getos("open");
        System.out.println(obj);

    }
}