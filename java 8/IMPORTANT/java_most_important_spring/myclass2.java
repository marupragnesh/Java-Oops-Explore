package java_most_important_spring;

public class myclass2 {
    private myclass1 obj;

    public myclass2() {
    }

    public myclass1 getObj() {
        return obj;
    }

    public void setObj(myclass1 obj) {
        this.obj = obj;
    }

    public myclass2(myclass1 obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "java_most_important_spring.myclass2{" +
                "obj=" + obj +
                '}';
    }
}

