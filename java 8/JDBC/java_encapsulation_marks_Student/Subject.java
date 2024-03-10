package java_encapsulation_marks_Student;

public class Subject extends Student {
    int sub1;
    int sub2;
    int sub3;

    public Subject(int sid, String sname, int sub1, int sub2, int sub3) {
        super(sid, sname);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }




    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }




}
