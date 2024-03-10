package builderdesign;

public class PhoneConstructor {

    private String camera;
    private String processor;
    private String mobileid;

    @Override
    public String toString() {
        return "PhoneConstructor{" +
                "camera='" + camera + '\'' +
                ", processor='" + processor + '\'' +
                ", mobileid='" + mobileid + '\'' +
                '}';
    }

    public PhoneConstructor() {
    }

    public PhoneConstructor(String camera, String processor, String mobileid) {
        this.camera = camera;
        this.processor = processor;
        this.mobileid = mobileid;
    }
}
