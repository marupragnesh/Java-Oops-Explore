package java_string;

public class simple1 {


    int a;

    simple1( int a){
        this.a = a;
    }
    @Override
    public String toString () {
        return "connection.simple1{" +
                "a=" + a +
                '}';
    }
    public static void main(String[] args) {

        simple1 s = new simple1(10);
        System.out.println(s.a);

    }

    }
