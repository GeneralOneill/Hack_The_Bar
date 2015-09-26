package com.b2b.classes;

/**
 * Created by devashrinagarkar on 9/26/15.
 */
public class Drink
{
    private String type;
    private String name;
    private double price;

    public Drink(String myType, String myName, double myPrice) {
        type = myType;
        name = myName;
        price = myPrice;
    }

    public String getType(){return type;}
    public String getName(){return name;}
    public double getPrice(){return price;}
}
