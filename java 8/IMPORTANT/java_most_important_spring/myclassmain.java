package java_most_important_spring;

public class myclassmain {
    public static void main(String[] args) {
        myclass1 m1 = new myclass1("australiya","override-value");
        myclass2 m2 = new myclass2();

        System.out.println(m1);
        System.out.println(m1.city);;
        m1.setCity("delhi");
       String ss = m1.getCity();
        System.out.println(ss+"error");
        m1.setCity("mumbai");



        m1.getCountry();
        m1.setCountry("canada");

        System.out.println( m2.getObj());
        System.out.println("++++++++++++");
        // below line do autowired in spring
        m2.setObj(m1);
        m2.getObj().setCity("new york");
//        m2.getObj().city = "hahahha";


        m2.getObj().setCountry("USA");
        System.out.println(m1);
        System.out.println(m2.getObj());
        System.out.println(m2);
    }
}
