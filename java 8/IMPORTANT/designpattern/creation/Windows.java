package designpattern.creation;

public class Windows implements os {

    @Override
    public os spec() {
        System.out.println("this is dead os");
        return null;
    }
}
