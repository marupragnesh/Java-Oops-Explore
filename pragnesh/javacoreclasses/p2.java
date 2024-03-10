package javacoreclasses;

class p2 {

    p2(int value){
        System.out.println("hii");
        System.out.println(value);

     
    }
    p2(p2 v2){

    }

    public void p1()
    {
        System.out.println("hellow");

    }
    public static void main(String[] args) {
        
        char b = 'e';
        float a =  900.23f;
        System.out.println(a+""+b);

        for(int i=2; i<11; i++){
            if(i%2 == 0){
                System.out.println(i);
                break;
            }
        }
        

p2 obj = new p2(2232);
p2 obj2 = new p2(obj);
obj.p1();



    }
}