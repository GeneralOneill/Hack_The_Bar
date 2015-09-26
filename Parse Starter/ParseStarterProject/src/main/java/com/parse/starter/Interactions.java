package com.parse.starter;

/**
 * Created by devashrinagarkar on 9/26/15.
 */
public class Interactions
{
    public Drink drink;
    public User user;
    public String timestamp;
    public Bar bar;
    public String bartender;
    public double pointValue;

    public Interactions(Drink myDrink, String myTimestamp, Bar myBar, String myBartender) {
        drink = myDrink;
        timestamp = myTimestamp;
        bar = myBar;
        bartender = myBartender;
        pointValue = Drink.price;
    }

    public void updatePoints(double price, double points)
    {
        User.points+= Drink.price;
    }


}
