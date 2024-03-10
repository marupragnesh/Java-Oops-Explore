package callbyref_object;

public class JavaApplication1 {
   
    public static void main(String[] args) {
 
 int a,b;
 a=10;b=20;
 System.out.print("Output for Call By Value\n");
 System.out.print("\nBefore Swapping");
 System.out.print("\nA : "+a+"->B : "+b);
 CallByValue c1 = new CallByValue(a,b);
 c1.swap();
 System.out.print("\nAfter Swapping");
 System.out.print("\nA : "+a+"->B : "+b);
 System.out.print("\n\nOutput for Call By Reference\n");
 System.out.print("\nBefore Swapping");
 System.out.print("\nA : "+a+"->B : "+b);
 CallByReference c2 = new CallByReference(a,b);
 c2.swap(c2);
 System.out.print("\nAfter Swapping");
 System.out.print("\nA : "+c2.a+"->B : "+c2.b);
 
 System.out.print("\n\nOutput for Return By Reference\n");
 System.out.print("\nBefore Swapping");
 System.out.print("\nA : "+a+"->B : "+b);
 ReturnObject c3 = new ReturnObject(a,b);
 ReturnObject c4 = new ReturnObject();
 c4= c3.swap(c3);
 System.out.print("\nAfter Swapping");
 System.out.print("\nA : "+c4.a+"->B : "+c4.b);
       
    }
 }               
 
 