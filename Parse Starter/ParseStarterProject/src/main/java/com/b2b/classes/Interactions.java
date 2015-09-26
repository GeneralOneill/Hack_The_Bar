package com.b2b.classes;

/**
 * Created by devashrinagarkar on 9/26/15.
 */
public class Interactions
{
    private Drink drink;
    private User user;
    private String timestamp;
    private Bar bar;
    private String bartender;

    public Interactions(Drink myDrink, String myTimestamp, Bar myBar, String myBartender, User iUser)
    {
        drink = myDrink;
        timestamp = myTimestamp;
        bar = myBar;
        user = iUser;
        bartender = myBartender;
    }
    public Drink getDrink()
    {
        return drink;
    }

    public String getTimestamp()
    {
        return timestamp;
    }

    public Bar getBar()
    {
        return bar;
    }

    public String getBartender()
    {
        return bartender;
    }

    public User getUser()
    {
        return user;
    }
}
