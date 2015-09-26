package b2b.classes;

/**
 * Created by root on 9/26/15.
 */
public class Drink {
    private String type;
    private String name;
    private double price;

    public Drink(String myType, double myPointValue, String myName, double myPrice) {
        type = myType;
        name = myName;
        price = myPrice;
    }

    public String getType(){return type;}
    public String getName(){return name;}
    public double getPrice(){return price;}
}
