package com.b2b.classes;

/**
 * Created by devashrinagarkar on 9/26/15.
 */
public class Interactions {
    public static Drink drink;
    public static User user;
    public static String timestamp;
    public static Bar bar;
    public static String bartender;
    public static double pointValue;

    public static void Interactions(Drink myDrink, String myTimestamp, Bar myBar, String myBartender, double myPointValue) {
        drink = myDrink;
        timestamp = myTimestamp;
        bar = myBar;
        bartender = myBartender;
        pointValue = myPointValue;
    }

    public static void updatePoints(double price, double points)
    {
        User.points+= Drink.price;
    }
}
