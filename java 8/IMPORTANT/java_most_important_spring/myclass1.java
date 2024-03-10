package java_most_important_spring;

public class myclass1 {
    String city = "vadodara";
    String country = "india";

    public myclass1() {
    }
    public myclass1(String city, String country) {
        this.city = city;
        this.country = country;
    }



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "java_most_important_spring.myclass1{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
