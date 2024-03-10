package java_lamda_expression;

@FunctionalInterface
interface lamda{

    void show(int i , int j);
}

interface  lamda1{
    int abc(int i, int j);
}
//  " it is only used when function interface is here " ----------- it is most important concept .
// below line is not implimentaing interface.
public class lamdaexpression  {


    public static void main(String[] args) {

        // behind the scenes
//        java_lamda_expression.lamda l1 = new java_lamda_expression.lamda() {
//            @Override
//            public void show(int i, int j) {
//
//            }
//        }


// below line type may be typecasting do not define type of a and b and
        lamda l1 = (a ,b) -> {
            System.out.println("hiii"+a+b);

        };

        l1.show(5,4);

        // return type is not mention still work
       lamda1 l2 = (x,y) -> x+y;

       int ans = l2.abc(7,4);
        System.out.println(ans);

    }
}
