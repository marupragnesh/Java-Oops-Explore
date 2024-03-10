package designpattern.creation;

public class FactoryDesign {

    public os getos(String name)
    {
        if(name.equals("open"))
        {
            return new Android().spec();
        } else if (name == "secure") {
            return new Ios();
        }
        else {
            return new Windows();
        }
    }
}

