package java_employee_main1;

public class employee {
    private int basicsalary;
    private int da, hra, did;


    public void getBasicSalary(int basicsalary) {
        this.basicsalary = basicsalary;
    }

    public int calculateSalary() {
        int finalsalary;
        da = basicsalary / 10;
        hra = basicsalary / 20;
        did = basicsalary / 20;
        finalsalary = basicsalary + da + hra - did;
        return finalsalary;
    }

}

