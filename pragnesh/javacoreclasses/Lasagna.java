package javacoreclasses;

public class Lasagna {

    int a(){
        return 40;
    }
    
    int b( int x){
        return a()- x;
    }

    int c(int x1){
        return x1 + 2;
    }

    int d(int y1, int y2){
        return (y1+2+y2);
    }

    public static void main(String[] args) {
        Lasagna l = new Lasagna();
        l.a();
        l.b(10);
        l.c(20);
        l.d(30, 40);
    }
}
