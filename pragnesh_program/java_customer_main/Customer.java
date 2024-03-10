package java_customer_main;

import java.util.Scanner;

public class Customer {

    int customerNo;
    String customerName;
    String policyType;
    byte age;
    float gst;
    float premiumAmount;

//    Scanner s =  new Scanner(System.in);

    public int getCustomerNo() {
        return customerNo;
    }
    public void setCustomerNo(int customerNo) {
        this.customerNo = customerNo;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPolicyType() {
        System.out.println(policyType);
        return policyType;
    }
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public float getGst() {
        return gst;
    }
    public void setGst(float gst) {
        this.gst = gst;
    }

    public float getPremiumAmount() {
        return premiumAmount;
    }
    public void setPremiumAmount(float premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public float finalPremium()
    {
        System.out.println(getPolicyType());

        if(getPolicyType().equals("li"))
        {
            if(getAge()>50)
            {
                this.premiumAmount = (float) (30000 + (30000 * 0.05));

            }
            else
            {
                this.premiumAmount = (float) (20000 + (20000 * 0.15));
            }
        } else if (getPolicyType().equals( "elss")) {
            if(getAge()>50)
            {
                this.premiumAmount = (float) (40000 + (40000 * 0.05));

            }
            else
            {
                this.premiumAmount = (float) (30000 + (30000 * 0.15));
            }

        }
        else if (getPolicyType() .equals( "nfo")) {
            if(getAge()>50)
            {
                this.premiumAmount = (float) (40000 + (40000 * 0.05));

            }
            else
            {
                this.premiumAmount = (float) (30000 + (30000 * 0.15));
            }

        }


        return this.premiumAmount;

    }


}
