package builderdesign;

public class Phone {
    private String camera;
    private String processor;
    private String mobileid;

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMobileid() {
        return mobileid;
    }

    public void setMobileid(String mobileid) {
        this.mobileid = mobileid;
    }

    public Phone phone()
    {
        return new Phone();
    }
}
