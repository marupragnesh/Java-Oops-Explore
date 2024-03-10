package java_encapsulation_marks_Student;


public class Student {

    int sid;

    String sname;
    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }



    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
