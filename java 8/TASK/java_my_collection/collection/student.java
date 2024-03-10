package java_my_collection.collection;

import java.util.Objects;

public class student {


    int rollno;
    String studentname;


    public student(int rollno, String studentname) {
        this.rollno = rollno;
        this.studentname = studentname;
    }


    @Override
    public String toString() {
        return "student{" +
                "rollno=" + rollno +
                ", studentname=" + studentname +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }


}
