package java_employee_main1;

import java_employee_main1.employee;

public class Main1 {


    public static void main(String[] args) {
        int bsalary = 10000;

        employee e1 = new employee();
        e1.getBasicSalary(bsalary);
        int finalsalary = e1.calculateSalary();
        System.out.println(finalsalary);
    }
}

