package java_sample_annonymous;

// try to make any sub class static and change in object craetion part
// remember technique to creation of object in inner class first create simple obejct and then first part write class
// and second part object of first class and "." after new keyword
    class InnoClass1 {
        int age;

        void show() {
            System.out.println("this is show");
        }

        class InnoClass2 {

            int height;

            void height() {
                System.out.println("this is height");
            }

            class InnoClass3 {
                int weight;
                void weight(){
                    System.out.println("This is weight");
                }

            }
        }
    }
    public class InnoClass {
        public static void main(String[] args) {
            InnoClass1 i1 = new InnoClass1();
            i1.show();

            // below line new keyword
           InnoClass1.InnoClass2 i2 = i1.new InnoClass2();
           i2.height();



           // below line i1.i2.new java_sample_annonymous.InnoClass instead i2.new InnoClass3()
           InnoClass1.InnoClass2.InnoClass3 i3 = i2.new InnoClass3();
           i3.weight();
        }
}



