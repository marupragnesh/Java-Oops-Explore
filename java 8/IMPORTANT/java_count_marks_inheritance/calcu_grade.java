package java_count_marks_inheritance;

public class calcu_grade extends marks {

    int percentage;
    void calculate(){

        percentage = (marks1+marks3+marks2)/3;
        System.out.println(name +" percentage is " + percentage);

    }
     void studentgrade() {
        if(percentage<0 || percentage>100)
        {
            System.out.println("Wrong Entry");
        }
        else if(percentage<50)
        {
            System.out.println("Grade F");
        }
        else if(percentage>=50 && percentage<60)
        {
            System.out.println("Grade D");
        }
        else if(percentage>=60 && percentage<70)
        {
            System.out.println("Grade C");
        }
        else if(percentage>=70 && percentage<80)
        {
            System.out.println("Grade B");
        }
        else if(percentage>=80 && percentage<90)
        {
            System.out.println("Grade java_sample_annonymous.A");
        }
        else
        {
            System.out.println("Grade java_sample_annonymous.A+");
        }
    }
}
