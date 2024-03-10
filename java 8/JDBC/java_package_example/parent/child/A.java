package java_package_example.parent.child;
import java_package_example.parent1.child1.Y;




    public class A {


       public void show (int a,int b){
            int ans = a + b;
            System.out.println(ans);
           System.out.println("this is child package");
        }

        public static void main(String[] args) {

            A a1 = new A();
            a1.show(5, 5);

            int h = Y.showy(6,6);
            System.out.println(h);


        }

        }



