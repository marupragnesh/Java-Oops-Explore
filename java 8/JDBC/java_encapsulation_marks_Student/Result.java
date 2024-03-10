package java_encapsulation_marks_Student;

public class Result extends Subject implements Result_Calculator{

    int total;
    float percentage;
    String grade;
    public Result(int sid, String sname, int sub1, int sub2, int sub3, int total, float percentage, String grade) {
        super(sid, sname, sub1, sub2, sub3);
        this.total = total;
        this.percentage = percentage;
        this.grade = grade;
    }



    @Override
    public int totalCalculate() {
        total = sub1+sub2+sub3;
        return total;
    }

    @Override
    public float totalPercentage() {
        percentage = total/(float)3;
        return percentage;
    }

    @Override
    public String grade() {
        if(percentage >= 70){
            System.out.println("AA");
        } else if (percentage <= 50 && percentage > 70 ) {
            System.out.println("BB");
        } else if (percentage <= 0 && percentage >50) {
            System.out.println("fail");
        }
        else {
            System.out.println("please enter valid marks");
        }
        return grade;
    }
}
