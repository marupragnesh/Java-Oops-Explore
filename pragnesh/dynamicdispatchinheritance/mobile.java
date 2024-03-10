package dynamicdispatchinheritance;

class computer
{
    public void com()
    {
        System.out.println("com is calling");
    }
}

class laptop extends computer
{
    public void lap(computer c)
    {
        computer c1 = new computer();
        System.out.println("lap is calling");
        c1.com();
    }
}
class tablet extends laptop
{
    public void tab()
    {
        laptop l1 = new laptop();
        System.out.println("tab is calling");
        computer c = new computer();
        l1.lap(c);
    }
}

public class mobile {
    public static void main(String[] args) {
        tablet t = new tablet();
        t.tab();
    }
}
