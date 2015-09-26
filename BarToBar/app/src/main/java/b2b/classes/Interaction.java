package b2b.classes;

/**
 * Created by root on 9/26/15.
 */
public class Interaction {
    private Drink drink;
    private User user;
    private String timestamp;
    private Bar bar;
    private String bartender;

    public Interaction(Drink myDrink, String myTimestamp, Bar myBar, String myBartender) {
        drink = myDrink;
        timestamp = myTimestamp;
        bar = myBar;
        bartender = myBartender;
    }

    public Drink getDrink(){ return drink;}
    public User getUser(){return user;}
    public String getTimestamp(){return timestamp;}
    public Bar getBar(){return bar;}
    public String getBartender(){return bartender;}
}

