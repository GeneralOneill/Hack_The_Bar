package b2b.classes;

/**
 * Created by root on 9/26/15.
 */
public class User {
    private double points;
    private String email;
    private String full_name;
    private String password;

    public User(String fullName, String myEmail, String myPass)
    {
        email= myEmail;
        full_name = fullName;
        password= myPass;
        points=0;
    }
    public User(String fullName, String myEmail, String myPass, int numPoints){
        email= myEmail;
        full_name = fullName;
        password= myPass;
        points=numPoints;
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


    public String getFirst()
    {
        return full_name;
    }

    public void setPoints(int addAmount)
    {
        points+= addAmount;
    }
}
