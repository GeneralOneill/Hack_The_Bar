package b2b.classes;

/**
 * Created by root on 9/26/15.
 */
public class Bar {
    private double points;
    private String email;
    private String barName;
    private String password;
    private String address;

    public Bar(String myEmail, String myBarName, String myPass, String newAddress)
    {
        address = newAddress;
        email= myEmail;
        barName= myBarName;
        password= myPass;
        points=0;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }
    public double getPoints()
    {
        return points;
    }
    public String getBarName()
    {
        return barName;
    }
    public String getAddress(){return address;}
    public void addPoints(int points1)
    {
        points+= points1;
    }
}
