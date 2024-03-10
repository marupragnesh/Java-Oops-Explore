package java_customer_main;

import java.util.Scanner;

public class Main {

    int customerNo;
    String customerName;
    String policyType;
    byte age;





    public void getData()
    {
        System.out.println("Enter the age");
        Scanner s =  new Scanner(System.in);
        age = s.nextByte();
        s.nextLine();

        System.out.println("Enter the policy");
        policyType = s.nextLine();

        System.out.println("Enter the username");
        customerName = s.nextLine();

        System.out.println("Enter user Id");
        customerNo = s.nextInt();



    }

    public void getData1(){

    }
    public void setData()
    {
        Customer c = new Customer();

    c.setCustomerNo(customerNo);
    c.setCustomerName(customerName);
    c.setPolicyType(policyType);
    c.setAge(age);
        System.out.println("Your premium is "+ c.finalPremium());

//    java_new_inter2.c.finalPremium();
//    java_new_inter2.c.setGst(java_new_inter2.c.gst);

    }
    public void calculateData()
    {

    }

    public static void main(String[] args) {

        Main m = new Main();
//        java_customer_main.Main java_new_inter2.c = new java_customer_main.Main();
        m.getData();
        m.setData();
        m.calculateData();
        m.getData1();

    }

}