package b2b.classes;

/**
 * Created by root on 9/26/15.
 */
public class Drink {
    private String name;
    private double price;
    private Bar bar;

    public Drink(String myName, double myPrice, Bar newBar) {
        name = myName;
        price = myPrice;
        bar = newBar;

    }

    public Bar getBar(){return bar;}
    public String getName(){return name;}
    public double getPrice(){return price;}
}
